package testing.one;

import static data.DbRef.DbName;
import static data.DbRef.databaseReference;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private ImageView BannerIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();
        BannerIcon = findViewById(R.id.loginBannerLogo);
        EditText username = findViewById(R.id.login_username);
        EditText password = findViewById(R.id.login_password);
        Button btnLogin = findViewById(R.id.btnLogin);
        TextView createAccount = findViewById(R.id.createAcc_Link);

        BannerIcon.setOnClickListener(View -> {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String Username = username.getText().toString().trim();
                final String Password = password.getText().toString().trim();

                //Checking Connectivity
                if ((isConnected(LoginActivity.this)) == false) {
                    showCustomDialog();
                } else {


                    //DB Validation
                    if (Username.isEmpty() || Password.isEmpty()) {
                        if (Username.isEmpty()) {
                            username.setError("Username is required");
                            username.requestFocus();
                            return;
                        }
                        if (Password.isEmpty()) {
                            password.setError("Password is required");
                            password.requestFocus();
                            return;
                        }
                    } else {
                        //try db connection here
                        databaseReference.child(DbName).addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                //check if username exists
                                if (snapshot.hasChild(Username)) {
                                    //get password of user and match it with the one entered
                                    String get_password = snapshot.child(Username).child("Password").getValue(String.class);
                                    if (get_password.contains(Password)) {

                                        Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                                        finish();
                                        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                                        startActivity(intent);


                                    } else {
                                        Toast.makeText(LoginActivity.this, "Wrong Password", Toast.LENGTH_SHORT).show();
                                    }
                                } else {
                                    Toast.makeText(LoginActivity.this, "Wrong Password//Username", Toast.LENGTH_SHORT).show();
                                }
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });


                    }

                }


                //startActivity(new Intent(LoginActivity.this,HomeActivity.class));
            }
        });

        createAccount.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
            startActivity(intent);
        });

    }

    private void showCustomDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
        builder.setMessage("Please connect to the internet to proceed further")
                .setCancelable(false)
                .setPositiveButton("Connect", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //redirecting the user to setting->WiFi
                        startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //redirect the user back to the landing screen
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        finish();
                    }
                }).show();
    }

    private boolean isConnected(LoginActivity login) {

        ConnectivityManager connectivityManager = (ConnectivityManager) login.getSystemService(Context.CONNECTIVITY_SERVICE);
        //wifi connection -> getting the current status
        NetworkInfo wifiConn = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        //Mobile Connectivity
        NetworkInfo mobileConn = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        return wifiConn != null && wifiConn.isConnected() || (mobileConn != null && mobileConn.isConnected());
    }

}