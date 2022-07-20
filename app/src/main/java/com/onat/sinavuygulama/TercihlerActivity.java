package com.onat.sinavuygulama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class TercihlerActivity extends AppCompatActivity {

    private Toolbar toolbarTercihler;
    private RecyclerView rvTercihler;
    private ArrayList<Tercihler> tercihlerArrayList;
    private TercihlerAdapter tAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercihler);

        toolbarTercihler = findViewById(R.id.toolbarTercihler);
        rvTercihler = findViewById(R.id.rvTercihler);

        toolbarTercihler.setTitle("Tercihler");
        setSupportActionBar(toolbarTercihler);

        rvTercihler.setHasFixedSize(true);
        rvTercihler.setLayoutManager(new LinearLayoutManager(this));

        tercihlerArrayList = new ArrayList<>();

        Tercihler t1 = new Tercihler("TYT","0","",10,06,2022,"Aboli baboliii",true);
        Tercihler t2 = new Tercihler("AYT","1","",15,12,2022,"Fenaaa bir sınav",false);
        Tercihler t3 = new Tercihler("KPSS","2","",16,06,2022,"Acayip bir sınav",false);
        Tercihler t4 = new Tercihler("ALES","3","",01,05,2022,"Deli bir sınav",false);
        Tercihler t5 = new Tercihler("TOEFL","4","",13,11,2022,"Müthiş bir sınav",false);
        Tercihler t6 = new Tercihler("SMMM","5","",24,06,2022,"Sıkıcı bir sınav",false);
        Tercihler t7 = new Tercihler("YDS","6","",28,07,2022,"Kolay bir sınav",false);

        tercihlerArrayList.add(t1);
        tercihlerArrayList.add(t2);
        tercihlerArrayList.add(t3);
        tercihlerArrayList.add(t4);
        tercihlerArrayList.add(t5);
        tercihlerArrayList.add(t6);
        tercihlerArrayList.add(t7);

        tAdapter = new TercihlerAdapter(this,tercihlerArrayList);
        rvTercihler.setAdapter(tAdapter);
    }

}
