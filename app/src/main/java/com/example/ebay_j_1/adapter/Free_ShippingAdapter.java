package com.example.ebay_j_1.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ebay_j_1.R;
import com.example.ebay_j_1.model.Free_shipping;

import java.util.ArrayList;

public class Free_ShippingAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<Free_shipping> items1;

    public Free_ShippingAdapter(Context context, ArrayList<Free_shipping> items1) {
        this.context = context;
        this.items1 = items1;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.free_shipping, parent, false);
        return new Free_shippingHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Free_shipping free_shipping = items1.get(position);

        if (holder instanceof Free_shippingHolder){
            ImageView image_free = ((Free_shippingHolder)holder).image_free;
            TextView text1 = ((Free_shippingHolder)holder).text1;
            TextView text2 = ((Free_shippingHolder)holder).text2;
            TextView text3 = ((Free_shippingHolder)holder).text3;
            TextView text4 = ((Free_shippingHolder)holder).text4;

            image_free.setImageResource(free_shipping.image_free);
            text1.setText(free_shipping.text1);
            text2.setText(free_shipping.text2);
            text3.setText(free_shipping.text3);
            text4.setText(free_shipping.text4);

            text3.setPaintFlags(text3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
    }

    @Override
    public int getItemCount() {
        return items1.size();
    }
    static class Free_shippingHolder extends RecyclerView.ViewHolder{

        TextView text1, text2, text3, text4;
        ImageView image_free;

        public Free_shippingHolder(@NonNull View itemView) {
            super(itemView);
            this.text1 = itemView.findViewById(R.id.text1);
            this.text2 = itemView.findViewById(R.id.text2);
            this.text3 = itemView.findViewById(R.id.text3);
            this.text4 = itemView.findViewById(R.id.text4);
            this.image_free = itemView.findViewById(R.id.free_image_tv);
        }
    }
}
