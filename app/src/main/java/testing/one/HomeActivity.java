package testing.one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import Interfaces.CategoryInterface;
import RecyclerViewAdaptor.IssueCategoryRecyclerViewAdaptor;
import RecyclerViewAdaptor.IssuesRecyclerView;
import data.Data;

public class HomeActivity extends AppCompatActivity implements CategoryInterface {
    public static final String ISSUE_LIST_TITLE = "testing.one.ISSUE_LIST_TITLE";
    public static final String ISSUE_CATEGORY = "testing.one.ISSUE_CATEGORY";
    RecyclerView recyclerView;
    private Data data = new Data();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView = findViewById(R.id.categoryRecyclerView);
        IssueCategoryRecyclerViewAdaptor issuesRecyclerView = new IssueCategoryRecyclerViewAdaptor(this,data.categories,this);
        recyclerView.setAdapter(issuesRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onCategoryClick(int position) {
        Intent intent = new Intent(this,ListIssuesActivity.class);
        intent.putExtra(ISSUE_LIST_TITLE,this.data.categories.get(position).name.toString());
        intent.putExtra(ISSUE_CATEGORY,position);
        startActivity(intent);
    }
}