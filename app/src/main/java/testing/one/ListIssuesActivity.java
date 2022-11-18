package testing.one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.sql.SQLOutput;
import java.util.ArrayList;

import Interfaces.IssueInterface;
import RecyclerViewAdaptor.IssuesRecyclerView;
import data.Data;
import models.Issue;
import models.IssueCategory;

public class ListIssuesActivity extends AppCompatActivity implements IssueInterface {

    public static final String ISSUE_TITLE = "testing.one.ISSUE_TITLE";
    int id;

    RecyclerView recyclerView;
    TextView title;
    Data data = new Data();
    ArrayList<Issue> issues = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_issues);

        //Set Activity Title textView
        title = findViewById(R.id.issueListTitle);
        String t = this.getIntent().getStringExtra(HomeActivity.ISSUE_LIST_TITLE);

        id = this.getIntent().getIntExtra(HomeActivity.ISSUE_CATEGORY,0);
        title.setText(t);
        for(int c =0;c<data.issues.size();c++){
            if(data.categories.get(id).name==data.issues.get(c).category.name){
                issues.add(data.issues.get(c));
            }
        }

        recyclerView = findViewById(R.id.issuesRecyclerView);
        IssuesRecyclerView issuesRecyclerView = new IssuesRecyclerView(this,issues,this);
        recyclerView.setAdapter(issuesRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void onIssueClick(int position) {
        /*Intent intent = new Intent(this,IssueDetails.class);*/
        String name = issues.get(position).title;

        //intent.putExtra(ISSUE_TITLE,name);
       // intent.putExtra("index",id);

        //intent.putExtra("issueT", String.valueOf(title));
       // startActivity(intent);

        //let's try something out here
        Intent x;
        switch (name)
        {
            //category index:0
            case "Practice Safe Sex":
                x = new Intent(this, SafeSex.class);
              startActivity(x);
              break;
            case "Menstruation and Reproduction Health":
                x = new Intent(this, ManstruAndRepo.class);
                startActivity(x);
                break;
            case "Lack of interest in sex":
                x = new Intent(this, LackOfInterest.class);
                startActivity(x);
                break;
            case "Painful sex":
                x = new Intent(this, PainfulSex.class);
                startActivity(x);
                break;
            case "Problems with orgasm":
                x = new Intent(this, OrgasmProb.class);
                startActivity(x);
                break;
                //category index: 1
            case "Prevent HIV with PrEP":
                x = new Intent(this, PreventHIV.class);
                startActivity(x);
                break;
            case "Preventive vaccines":
                x = new Intent(this, PreventiveVaccines.class);
                startActivity(x);
                break;
            case "Get screened for STIs":
                x = new Intent(this, GetScreened.class);
                startActivity(x);
                break;
            case "Get regular Pap smears":
                x = new Intent(this, RegularPapSmear.class);
                startActivity(x);
                break;
                //category index 2
            case "Emergency contraception":
                x = new Intent(this,EmergencyPrev.class);
                startActivity(x);
                break;
        }
    }
}