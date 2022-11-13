package testing.one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class IssueDetails extends AppCompatActivity {
TextView title,paragragh;
String prac_sex = "@strings/Practice_Safe_Sex_Paragraph";
    public static final String ISSUE_TITLE = "testing.one.ISSUE_TITLE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issue_details);

        title = findViewById(R.id.Title);
        paragragh  = findViewById(R.id.Paraphrase);

        Intent intent = getIntent();
        String intentTitle = intent.getStringExtra(ISSUE_TITLE);
        title.setText(intentTitle);








    }
}