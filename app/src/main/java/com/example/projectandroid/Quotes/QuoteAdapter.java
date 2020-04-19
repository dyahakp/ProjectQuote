package com.example.projectandroid.Quotes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectandroid.R;

import java.util.ArrayList;

public class QuoteAdapter extends RecyclerView.Adapter<QuoteAdapter.ViewHolder> {

    private ArrayList<QuoteResult> quoteResults = new ArrayList<>();
    private Context context;

    public QuoteAdapter(Context context) {
        this.context = context;
    }

    public void setData(ArrayList<QuoteResult> items) {
        quoteResults.clear();
        quoteResults.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public QuoteAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_quote, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuoteAdapter.ViewHolder holder, int position) {
        holder.ivBody.setText(quoteResults.get(position).getBody());
        holder.ivAuthor.setText(quoteResults.get(position).getAuthor());
    }

    @Override
    public int getItemCount() {
        return quoteResults.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView ivBody, ivAuthor;
        CardView cvItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cvItem = itemView.findViewById(R.id.cv_List);
            ivBody = itemView.findViewById(R.id.body);
            ivAuthor = itemView.findViewById(R.id.author);


        }
    }
}
