package testing.one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.sql.SQLOutput;
import java.util.ArrayList;

import RecyclerViewAdaptor.IssuesRecyclerView;
import data.Data;
import models.Issue;
import models.IssueCategory;

public class ListIssuesActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Button backbtn;
    TextView title;
    Data data = new Data();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_issues);

        //Set Activity Title textView
        title = (TextView) findViewById(R.id.issueListTitle);
        String t = this.getIntent().getStringExtra(HomeActivity.ISSUE_LIST_TITLE);

        int id = this.getIntent().getIntExtra(HomeActivity.ISSUE_CATEGORY,0);
        title.setText(t);
        ArrayList<Issue> issues = new ArrayList<>();
        for(int c =0;c<data.issues.size();c++){
            if(data.categories.get(id).name==data.issues.get(c).category.name){
                issues.add(data.issues.get(c));
            }
        }

        recyclerView = findViewById(R.id.issuesRecyclerView);
        IssuesRecyclerView issuesRecyclerView = new IssuesRecyclerView(this,issues);
        recyclerView.setAdapter(issuesRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}