package com.onat.sinavuygulama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.io.Serializable;
import java.util.ArrayList;

public class BasvurularActivity extends AppCompatActivity implements Serializable {

    private Toolbar toolbarBasvurular;
    private RecyclerView rvBasvurular;
    private ArrayList<Basvurular> basvurularArrayList;
    private BasvurularAdapter bAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basvurular);

        toolbarBasvurular = findViewById(R.id.toolbarBasvurular);
        rvBasvurular = findViewById(R.id.rvBasvurular);

        toolbarBasvurular.setTitle("Başvurular");
        setSupportActionBar(toolbarBasvurular);

        rvBasvurular.setHasFixedSize(true);
        rvBasvurular.setLayoutManager(new LinearLayoutManager(this));

        basvurularArrayList = new ArrayList<>();

        Basvurular b1 = new Basvurular("TYT","0","",10,06,2020,"Zorlu bir sınav. Zorlu bir sınav. Zorlu bir sınav. Zorlu bir sınav. Zorlu bir sınav. Zorlu bir sınav. Zorlu bir sınav",true);
        Basvurular b2 = new Basvurular("AYT","1","",15,11,2020,"Fena bir sınav",false);
        Basvurular b3 = new Basvurular("KPSS","2","",5,06,2020,"Acayip bir sınav",false);
        Basvurular b4 = new Basvurular("ALES","3","",3,12,2020,"Deli bir sınav",false);
        Basvurular b5 = new Basvurular("TOEFL","4","",21,12,2020,"Müthiş bir sınav",false);
        Basvurular b6 = new Basvurular("SMMM","5","",27,10,2020,"Sıkıcı bir sınav",false);
        Basvurular b7 = new Basvurular("YDS","6","",11,1,2020,"Kolay bir sınav",false);

        basvurularArrayList.add(b1);
        basvurularArrayList.add(b2);
        basvurularArrayList.add(b3);
        basvurularArrayList.add(b4);
        basvurularArrayList.add(b5);
        basvurularArrayList.add(b6);
        basvurularArrayList.add(b7);

        bAdapter = new BasvurularAdapter(this,basvurularArrayList);
        rvBasvurular.setAdapter(bAdapter);
    }
}
