package com.batman.bakeit.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.batman.bakeit.R;

/**
 * Created by BATMAN on 10-10-2017.
 */

public class RecipeRecylerViewAdapter extends RecyclerView.Adapter<RecipeRecylerViewAdapter.RecipeViewHolder> {

    private int mNumberItems;


    public RecipeRecylerViewAdapter(int mNumberItems) {
        this.mNumberItems = mNumberItems;
    }

    class RecipeViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;

        public RecipeViewHolder(View itemView) {
            super(itemView);


            mTextView = (TextView) itemView.findViewById(R.id.recipe_rv_list_item);
        }


    }


    @Override
    public RecipeRecylerViewAdapter.RecipeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecipeRecylerViewAdapter.RecipeViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
