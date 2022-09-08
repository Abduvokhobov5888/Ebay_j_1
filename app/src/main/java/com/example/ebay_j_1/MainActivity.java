package com.example.ebay_j_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ebay_j_1.adapter.FavoriteAdapter;
import com.example.ebay_j_1.adapter.Free_ShippingAdapter;
import com.example.ebay_j_1.model.Favorite;
import com.example.ebay_j_1.model.Free_shipping;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        free_shipping();

    }
    void initViews(){
        ArrayList<Favorite> favorite = new ArrayList<>();
        RecyclerView rv = findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        favorite.add(new Favorite("Apple",R.drawable.watch));
        favorite.add(new Favorite("Apple",R.drawable.watch));
        favorite.add(new Favorite("Apple",R.drawable.watch));
        favorite.add(new Favorite("Apple",R.drawable.watch));
        favorite.add(new Favorite("Apple",R.drawable.watch));
        favorite.add(new Favorite("Apple",R.drawable.watch));
        favorite.add(new Favorite("Apple",R.drawable.watch));

        FavoriteAdapter adapter = new FavoriteAdapter(this, favorite);
        rv.setAdapter(adapter);
    }

    void free_shipping(){
        ArrayList<Free_shipping> free_shipping = new ArrayList<>();
        RecyclerView rv1 = findViewById(R.id.rv1);
        rv1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));

        free_shipping.add(new Free_shipping("Bose QuietComfort Earbuds","$199.00","$279.00","29% OFF", R.drawable.watch));
        free_shipping.add(new Free_shipping("Bose QuietComfort Earbuds","$199.00","$279.00","29% OFF", R.drawable.watch));
        free_shipping.add(new Free_shipping("Bose QuietComfort Earbuds","$199.00","$279.00","29% OFF", R.drawable.watch));
        free_shipping.add(new Free_shipping("Bose QuietComfort Earbuds","$199.00","$279.00","29% OFF", R.drawable.watch));
        free_shipping.add(new Free_shipping("Bose QuietComfort Earbuds","$199.00","$279.00","29% OFF", R.drawable.watch));
        free_shipping.add(new Free_shipping("Bose QuietComfort Earbuds","$199.00","$279.00","29% OFF", R.drawable.watch));
        free_shipping.add(new Free_shipping("Bose QuietComfort Earbuds","$199.00","$279.00","29% OFF", R.drawable.watch));

        Free_ShippingAdapter adapter1 = new Free_ShippingAdapter(this,free_shipping);
        rv1.setAdapter(adapter1);
    }
}