package testing.one;

import static data.DbRef.DbName;
import static data.DbRef.databaseReference;

import data.DbRef.*;

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
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import data.DbRef;

public class RegistrationActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        EditText Reg_Firstname = findViewById(R.id.reg_Firstname);
        EditText Reg_Lastname = findViewById(R.id.reg_Lastname);
        EditText Reg_Email = findViewById(R.id.email);
        EditText Reg_CellNumber = findViewById(R.id.reg_Cellphone);
        EditText Reg_Username = findViewById(R.id.reg_username);
        EditText Reg_Age = findViewById(R.id.reg_Age);
        EditText Reg_Password = findViewById(R.id.reg_Password);
        EditText Reg_Reapeat_Password = findViewById(R.id.reg_ReapeatPassword);
        TextView Reg_ErrorMessages = findViewById(R.id.reg_errors);
        Button Register= findViewById(R.id.btnRegister);


        Register.setOnClickListener( view -> {
            //extracting the data from the textboxes into string variables
            final String Firstname = Reg_Firstname.getText().toString();
            final String Lastname = Reg_Lastname.getText().toString();
            final String Email = Reg_Email.getText().toString();
            final String CellNumber = Reg_CellNumber.getText().toString();
            final String Username = Reg_Username.getText().toString();
            final String Age =Reg_Age.getText().toString();
            final String Password = Reg_Password.getText().toString();
            final String Repeat_Password = Reg_Reapeat_Password.getText().toString();
            final int ageValue = Integer.valueOf(Age);


            //checking iff all fields have been filled in
            if(Firstname.isEmpty()&&Lastname.isEmpty()&&Email.isEmpty()&&CellNumber.isEmpty()&&Username.isEmpty()&&Age.isEmpty()&&Password.isEmpty()&&Repeat_Password.isEmpty())
            {
                Reg_ErrorMessages.append("Please fill in all the fields");
               Toast.makeText(RegistrationActivity.this,"Please fill in all the fields",Toast.LENGTH_SHORT).show();
            }

            //validating email

             else if (!Email.contains("@") && Email.contains(".")) {
                    Reg_ErrorMessages.append("\nEmail is invalid; email should contain \"@\" & \".\"");
                    //Toast.makeText(RegistrationActivity.this,"Invalid email",Toast.LENGTH_SHORT).show();
                }

            //validating phone number

            else if (CellNumber.length() != 10) {
                    Reg_ErrorMessages.append("\nCell number must be 10 digits");
                    //Toast.makeText(RegistrationActivity.this,"Cell number must have 10 digits",Toast.LENGTH_SHORT).show();
                }


            else if (ageValue > 100) {
                    Reg_ErrorMessages.append("\nAge must be less than 100");
                    //Toast.makeText(RegistrationActivity.this,"Age cannot be greater than 100",Toast.LENGTH_SHORT).show();
                }


           else if (!Password.equals(Repeat_Password)) {
                    Reg_ErrorMessages.append("\nPasswords do not match");
                    //Toast.makeText(RegistrationActivity.this,"Passwords do not match",Toast.LENGTH_SHORT).show();
                }
                else if ((Password.equals(Repeat_Password)) && Password.length() < 8) {
                    Reg_ErrorMessages.append("\nPassword must be greater than 8 characters");
                    //Toast.makeText(RegistrationActivity.this,"Password cannot be less than 8 characters",Toast.LENGTH_SHORT).show();
                }
                //Toast.makeText(RegistrationActivity.this,Reg_ErrorMessages.getText().toString(),Toast.LENGTH_SHORT).show();


            else {

                databaseReference.child("Users").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        //checking if Username is not registered
                        if(snapshot.hasChild(Username)){
                            Toast.makeText(RegistrationActivity.this,"Username is already Registered",Toast.LENGTH_SHORT).show();
                        }
                        else{

                            //sending data to firebase realtime db
                            //Username will be used as a unique ID
                            //other fields will come under Username
                            databaseReference.child(DbName).child(Username).child("Firstname").setValue(Firstname);
                            databaseReference.child(DbName).child(Username).child("Lastname").setValue(Lastname);
                            databaseReference.child(DbName).child(Username).child("Cell Number").setValue(CellNumber);
                            databaseReference.child(DbName).child(Username).child("Age").setValue(Age);
                            databaseReference.child(DbName).child(Username).child("Password").setValue(Password);
                            //display feedback
                            Toast.makeText(RegistrationActivity.this,"User registered Successfully.",Toast.LENGTH_SHORT).show();
                            finish();
                            Intent intent = new Intent(RegistrationActivity.this,LoginActivity.class);
                            startActivity(intent);
                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });


            }




        } );


    }



}