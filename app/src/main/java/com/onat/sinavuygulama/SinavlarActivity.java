package com.onat.sinavuygulama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SinavlarActivity extends AppCompatActivity {

    private Toolbar toolbarSinavlar;
    private RecyclerView rvSinavlar;
    private ArrayList<Sinavlar> sinavlarArrayList;
    private SinavlarAdapter sAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinavlar);

        toolbarSinavlar = findViewById(R.id.toolbarSinavlar);
        rvSinavlar = findViewById(R.id.rvSinavlar);

        toolbarSinavlar.setTitle("Sınavlar");
        setSupportActionBar(toolbarSinavlar);

        rvSinavlar.setHasFixedSize(true);
        rvSinavlar.setLayoutManager(new LinearLayoutManager(this));

        sinavlarArrayList = new ArrayList<>();

        Sinavlar s1 = new Sinavlar("TYT","0","",15,06,2021,"Zorlu bir sınav. Zorlu bir sınav. Zorlu bir sınav. Zorlu bir sınav. Zorlu bir sınav. Zorlu bir sınav. Zorlu bir sınav",true);
        Sinavlar s2 = new Sinavlar("AYT","1","",12,12,2021,"Fena bir sınav",false);
        Sinavlar s3 = new Sinavlar("KPSS","2","",1,4,2021,"Acayip bir sınav",false);
        Sinavlar s4 = new Sinavlar("ALES","3","",4,11,2021,"Deli bir sınav",false);
        Sinavlar s5 = new Sinavlar("TOEFL","4","",25,4,2021,"Müthiş bir sınav",false);
        Sinavlar s6 = new Sinavlar("SMMM","5","",22,1,2021,"Sıkıcı bir sınav",false);
        Sinavlar s7 = new Sinavlar("YDS","6","",12,3,2021,"Kolay bir sınav",false);

        sinavlarArrayList.add(s1);
        sinavlarArrayList.add(s2);
        sinavlarArrayList.add(s3);
        sinavlarArrayList.add(s4);
        sinavlarArrayList.add(s5);
        sinavlarArrayList.add(s6);
        sinavlarArrayList.add(s7);

        sAdapter = new SinavlarAdapter(this,sinavlarArrayList);
        rvSinavlar.setAdapter(sAdapter);
    }
}
