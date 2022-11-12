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


        //checking the title to see on what to populate in the scrollView

        switch (intentTitle)
        {
            //under take Care
            case "Practice Safe Sex":
                Intent x = new Intent(this,SafeSex.class);
                startActivity(x);
                break;
            case "Menstruation and Reproduction":
                //throw in the data into the TextView
                break;
            case "Lack of interest in sex":
                //throw in the data into the TextView
                break;
            case "Painful Sex":
                //throw in the data into the TextView
                break;
            case "Problems with orgasm":
                //throw in the data into the TextView
                break;
                //preventing Section
            case "Preventing HIV with PrEP":
                //throw in the data into the TextView
                break;
            case "Preventive vaccines":
                //throw in the data into the TextView
                break;
            case "Get screened for STIs":
                //throw in the data into the TextView
                break;
            case "Get regular Pap smears":
                //throw in the data into the TextView
                break;
                //Emergency Contraceptives Section
            case "Emergency contraception":
                //throw in the data into the TextView
                break;
            default:
                paragragh.setText("Error");
        }




    }
}