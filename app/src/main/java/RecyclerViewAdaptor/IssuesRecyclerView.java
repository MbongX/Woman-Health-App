package RecyclerViewAdaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import Interfaces.IssueInterface;
import models.Issue;
import testing.one.R;

public class IssuesRecyclerView extends RecyclerView.Adapter<IssuesRecyclerView.MyViewHolder> implements IssueInterface {
    Context context;
    ArrayList<Issue> issues;

    // Issue Interface
    IssueInterface issueInterface;
    @Override
    public void onIssueClick(int position) {

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title,description,rootcause;
        public MyViewHolder(@NonNull View itemView,IssueInterface issueInterface) {
            super(itemView);
            title = itemView.findViewById(R.id.category_title);
            description = itemView.findViewById(R.id.Description);
            rootcause = itemView.findViewById(R.id.RootCause);

            itemView.setOnClickListener(view -> {
                if(issueInterface != null){
                    int pos = getAdapterPosition();
                    if(pos != RecyclerView.NO_POSITION){
                        issueInterface.onIssueClick(pos);
                    }
                }
            });

        }
    }
    // Constructor
    public IssuesRecyclerView(Context context, ArrayList<Issue> Issues,IssueInterface issueInterface){
        this.context = context;
        this.issues = Issues;
        this.issueInterface = issueInterface;
    }

    @NonNull
    @Override
    public IssuesRecyclerView.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the layout
        LayoutInflater inflater  = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.issue_layout,parent,false);
        return new IssuesRecyclerView.MyViewHolder(view,issueInterface);
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
