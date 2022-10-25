package RecyclerViewAdaptor;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import models.IssueCategory;
import testing.one.R;

public class IssueCategoryRecyclerViewAdaptor extends RecyclerView.Adapter<IssueCategoryRecyclerViewAdaptor.IssueViewHolder> {

    ArrayList<IssueCategory> categories;
    Context context;

    public static class IssueViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        public IssueViewHolder(@NonNull View CategoryView){
            super(CategoryView);
            title = CategoryView.findViewById(R.id.category_title);
        }
    }

    public IssueCategoryRecyclerViewAdaptor(Context context,ArrayList<IssueCategory> categories){
        this.context = context;
        this.categories = categories;
    }

    @NonNull
    @Override
    public IssueCategoryRecyclerViewAdaptor.IssueViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate Layout
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        View view = layoutInflater.inflate(R.layout.category_layout,parent,false);
        return new IssueViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IssueCategoryRecyclerViewAdaptor.IssueViewHolder holder, int position) {
        IssueCategory category = this.categories.get(position);
        holder.title.setText(category.name);
    }

    @Override
    public int getItemCount() {
        return this.categories.size();
    }
}
