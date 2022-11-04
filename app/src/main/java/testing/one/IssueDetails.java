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
/*
        switch (intentTitle)
        {
            //under take Care
            case "Practice Safe Sex":
                //throw in the data into the TextView
                //paragragh.setText(prac_sex);
                //paragragh.setText("<b><i>Safer sex practices</i></b> often involve using barriers in your body to help prevent you and your partner from sharing bodily fluids. Some of these barrier methods include:
                //    <ul>
                //        <li>external condoms</li>
                //        <li>internal condoms</li>
                //        <li>dental dams</li>
                //        <li>gloves</li>
                //    </ul>
                //\n
                //These methods have been shown to be <i><b>effective at preventing STIs,</b></i>> which are transmitted through bodily fluids such as:\n
                //    <ul>
                //        <li>semen</li>
                //        <li>blood</li>
                //        <li>vaginal secretions</li>
                //        <li>saliva</li>
                //    </ul>
                //    \n
                //<b>Barrier methods</b> can help protect you and your partner from STIs such as:
                //    \n
                //    <ul>
                //        <li>HIV</li>
                //        <li>gonorrhea</li>
                //        <li>chlamydia</li>
                //        <li>trichomoniasis</li>
                //        <li>hepatitis A, B, and C</li>
                //    </ul>
                //    \n
                //<l>Barrier methods are less effective at preventing STIs that are transmitted through skin-to-skin contact, but they can still help reduce your risk.</l>
                //Examples of <b><i>STIs transmitted via skin-to-skin contact include:</i></b>
                //    \n
                //    <ul>
                //        <li>syphilis</li>
                //        <li>HPV (human papilloma virus)</li>
                //        <li>HSV (herpes simplex virus)</li>
                //        <li>Pubic lice can also be passed from one person to another through this method.</li>
                //    </ul>
                //    \n
                //When selecting barrier methods, opt for <i>latex or polyurethane condoms and dental dams.</i> And always use them during <b>any kind of sexual contact or penetration</b> to protect you and your partner.
                //Using condoms, dental dams, and gloves can help reduce the transmission of STIs during:\n
                //    <ul>
                //        <li>oral sex</li>
                //        <li>vaginal sex</li>
                //        <li>anal sex</li>
                //    </ul>
                //    \n
                //It’s important to note that some STIs can be transmitted during oral sex, including:\n
                //    <ul>
                //        <li>syphilis</li>
                //        <li>HPV</li>
                //        <li>herpes</li>
                //        <li>gonorrhea</li>
                //        <li>chlamydia</li>
                //    </ul>
                //    \n");
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
        */



    }
}