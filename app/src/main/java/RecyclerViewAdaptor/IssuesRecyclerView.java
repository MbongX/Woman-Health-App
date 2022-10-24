package RecyclerViewAdaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import models.Issue;
import testing.one.R;

public class IssuesRecyclerView extends RecyclerView.Adapter<IssuesRecyclerView.MyViewHolder> {
    Context context;
    ArrayList<Issue> issues;

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title,description,rootcause;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.Description);
            rootcause = itemView.findViewById(R.id.RootCause);
        }
    }
    // Constructor
    public IssuesRecyclerView(Context context, ArrayList<Issue> Issues){
        this.context = context;
        this.issues = Issues;
    }

    @NonNull
    @Override
    public IssuesRecyclerView.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the layout
        LayoutInflater inflater  = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.issue_layout,parent,false);
        return new IssuesRecyclerView.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IssuesRecyclerView.MyViewHolder holder, int position) {
        // Prepare Single item view to receive data
        Issue issue = this.issues.get(position);
        holder.rootcause.setText(issue.RootCause);
        holder.description.setText(issue.description);
        holder.title.setText(issue.title);
    }

    @Override
    public int getItemCount() {
        // Get the number of items
        return issues.size();
    }
}
