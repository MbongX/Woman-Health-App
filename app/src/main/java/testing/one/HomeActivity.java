package testing.one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import Interfaces.CategoryInterface;
import RecyclerViewAdaptor.IssueCategoryRecyclerViewAdaptor;
import RecyclerViewAdaptor.IssuesRecyclerView;
import data.Data;

public class HomeActivity extends AppCompatActivity implements CategoryInterface {
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
        System.out.println(position);
    }
}