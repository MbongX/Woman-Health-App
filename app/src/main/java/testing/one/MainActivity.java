package testing.one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnBegin = findViewById(R.id.btnBegin);

        btnBegin.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(intent);
        });
    }

}
