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

import Interfaces.CategoryInterface;
import models.IssueCategory;
import testing.one.R;

public class IssueCategoryRecyclerViewAdaptor extends RecyclerView.Adapter<IssueCategoryRecyclerViewAdaptor.IssueViewHolder> implements CategoryInterface {

    ArrayList<IssueCategory> categories;
    Context context;

    // Category Interface
    final CategoryInterface categoryInterface;

    @Override
    public void onCategoryClick(int position) {

    }

    public static class IssueViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        public IssueViewHolder(@NonNull View CategoryView,CategoryInterface categoryInterface){
            super(CategoryView);
            title = CategoryView.findViewById(R.id.category_title);
            CategoryView.setOnClickListener(view -> {
                if(categoryInterface != null){
                    int pos = getAdapterPosition();
                    if (pos != RecyclerView.NO_POSITION){
                        categoryInterface.onCategoryClick(pos);
                    }
                }
            });
        }
    }

    public IssueCategoryRecyclerViewAdaptor(Context context,ArrayList<IssueCategory> categories,CategoryInterface categoryInterface){
        this.context = context;
        this.categories = categories;
        this.categoryInterface = categoryInterface;
    }

    @NonNull
    @Override
    public IssueCategoryRecyclerViewAdaptor.IssueViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate Layout
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        View view = layoutInflater.inflate(R.layout.category_layout,parent,false);
        return new IssueViewHolder(view,this.categoryInterface);
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
