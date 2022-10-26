package testing.one;

import static data.DbRef.DbName;
import static data.DbRef.databaseReference;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import data.DbRef;

public class LoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText username = findViewById(R.id.login_username);
        EditText password = findViewById(R.id.login_password);

        Button btnLogin = findViewById(R.id.btnLogin);
        TextView createAccount = findViewById(R.id.createAcc_Link);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               final String Username = username.getText().toString();
               final String Password = password.getText().toString();


               if(Username.isEmpty() || Password.isEmpty())
               {
                   Toast.makeText(LoginActivity.this, "Please enter your username or password",Toast.LENGTH_SHORT).show();
               }else{
                   //try db connection here
                    databaseReference.child(DbName).addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            //check if username exists
                            if(snapshot.hasChild(Username))
                            {
                                //get password of user and match it with the one entered
                                String get_password = snapshot.child(Username).child("password").getValue(String.class);
                                if (get_password.equals(Password))
                                {

                                    Toast.makeText(LoginActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();

                                    Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
                                    startActivity(intent);

                                    finish();
                                }
                                else{
                                    Toast.makeText(LoginActivity.this,"Wrong Password",Toast.LENGTH_SHORT).show();
                                }
                            }else{
                                Toast.makeText(LoginActivity.this,"Wrong Password//Username",Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });



               }




                //startActivity(new Intent(LoginActivity.this,HomeActivity.class));
            }
        });

        createAccount.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this,RegistrationActivity.class);
            startActivity(intent);
        });

    }

}