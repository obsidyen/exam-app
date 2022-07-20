package com.onat.sinavuygulama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class FavorilerActivity extends AppCompatActivity {

    private Toolbar toolbarFavoriler;
    private RecyclerView rvFavoriler;
    private ArrayList<Favoriler> favorilerArrayList;
    private FavorilerAdapter fAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoriler);

        toolbarFavoriler = findViewById(R.id.toolbarFavoriler);
        rvFavoriler = findViewById(R.id.rvFavoriler);

        toolbarFavoriler.setTitle("Favoriler");
        setSupportActionBar(toolbarFavoriler);

        rvFavoriler.setHasFixedSize(true);
        rvFavoriler.setLayoutManager(new LinearLayoutManager(this));

        //arraylist konacak / getirilecek.


        fAdapter = new FavorilerAdapter(this,favorilerArrayList);
        rvFavoriler.setAdapter(fAdapter);
    }
}
