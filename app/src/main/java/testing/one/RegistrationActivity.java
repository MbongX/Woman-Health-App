package testing.one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class RegistrationActivity extends AppCompatActivity {


    Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Register = findViewById(R.id.btnRegister);
        Register.setOnClickListener( view -> {

        } );
    }

    private void register(){
        System.out.println("Registered");
    }

}