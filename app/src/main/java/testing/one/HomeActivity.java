package testing.one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import RecyclerViewAdaptor.IssuesRecyclerView;
import data.Data;

public class HomeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private Data data = new Data();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.IssuesRecyclerView);

        IssuesRecyclerView issuesRecyclerView = new IssuesRecyclerView(this,data.issues);

        recyclerView.setAdapter(issuesRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}