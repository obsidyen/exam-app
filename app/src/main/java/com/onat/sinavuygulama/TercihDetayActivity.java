package com.onat.sinavuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

public class TercihDetayActivity extends AppCompatActivity {

    private TextView textViewAdTercihler,textViewAciklamaTercihler,textViewBaslikTercihler,textViewKalanGunTercihler,textViewFavoriTercihler,textViewTarihTercihler;
    private Tercihler tercihler;
    private DatePicker dp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercih_detay);

        textViewAdTercihler = findViewById(R.id.textViewAdTercihler);
        textViewAciklamaTercihler = findViewById(R.id.textViewAciklamaTercihler);
        textViewBaslikTercihler = findViewById(R.id.textViewBaslikTercihler);
        textViewKalanGunTercihler = findViewById(R.id.textViewKalanGunTercihler);
        textViewFavoriTercihler = findViewById(R.id.textViewFavoriTercihler);
        textViewTarihTercihler = findViewById(R.id.textViewTarihTercihler);

        //String kalangun = "Yıl : "+(tercihler.getTercih_yil()-dp.getYear())+"Ay : "+(tercihler.getTercih_ay()-dp.getMonth())+"Gün : "+(tercihler.getTercih_gun()-dp.getDayOfMonth());

        tercihler = (Tercihler) getIntent().getSerializableExtra("tercih");

        SharedPreferences sp = getSharedPreferences("favoriler",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        boolean kontrol = sp.getBoolean("favoriSwitch"+tercihler.getTercih_id(),false);

        if (kontrol){
            textViewFavoriTercihler.setText("Favorilere Ekli Mi? : Evet");
        }else{
            textViewFavoriTercihler.setText("Favorilere Ekli Mi? : Hayır");
        }

        textViewAdTercihler.setText(tercihler.getTercih_ad());
        textViewAciklamaTercihler.setText(tercihler.getTercih_aciklama());
        textViewTarihTercihler.setText("Sınavın Tarihi : "+ tercihler.getTercih_gun()+"/"+ tercihler.getTercih_ay()+"/"+ tercihler.getTercih_yil());
        textViewKalanGunTercihler.setText("Allah kerim.");


    }
}
