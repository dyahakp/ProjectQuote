package com.example.projectandroid.Quotes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectandroid.R;
import com.example.projectandroid.ViewModel.QuoteViewModel;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class QuotesFragment extends Fragment {
    private QuoteAdapter quoteAdapter;
    private RecyclerView rvQuote;
    private QuoteViewModel quoteModel;
    private Observer<ArrayList<QuoteResult>> getQuote = new Observer<ArrayList<QuoteResult>>() {
        @Override
        public void onChanged(ArrayList<QuoteResult> quoteResults) {
            if (quoteResults != null) {
                quoteAdapter.setData(quoteResults);
            }
        }
    };


    public QuotesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quotes, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        quoteAdapter = new QuoteAdapter(getContext());
        quoteAdapter.notifyDataSetChanged();

        rvQuote = view.findViewById(R.id.fragment_rv);
        rvQuote.setLayoutManager(new GridLayoutManager(getContext(), 1));

        quoteModel = new ViewModelProvider(this).get(QuoteViewModel.class);
        quoteModel.setQuote();
        quoteModel.getQuote().observe(this, getQuote);

        rvQuote.setAdapter(quoteAdapter);
    }
}
