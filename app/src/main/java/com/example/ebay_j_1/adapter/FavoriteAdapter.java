package com.example.ebay_j_1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ebay_j_1.R;
import com.example.ebay_j_1.model.Favorite;

import java.util.ArrayList;

public class FavoriteAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<Favorite> items;

    public FavoriteAdapter(Context context, ArrayList<Favorite> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.favorite,parent,false);
        return new FavoriteViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Favorite favorite = items.get(position);

        if (holder instanceof FavoriteViewHolder){
            ImageView image = ((FavoriteViewHolder)holder).image;
            TextView title = ((FavoriteViewHolder)holder).title;

            image.setImageResource(favorite.profile);
            title.setText(favorite.title);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class FavoriteViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title;

        public FavoriteViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image_tv);
            title = itemView.findViewById(R.id.title_tv);
        }
    }
}
