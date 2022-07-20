package com.onat.sinavuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

public class SinavlarDetayActivity extends AppCompatActivity {

    private TextView textViewAdSinavlar,textViewAciklamaSinavlar,textViewBaslikSinavlar,textViewKalanGunSinavlar,textViewFavoriSinavlar,textViewTarihSinavlar;
    private Sinavlar sinavlar;
    private DatePicker dp;
    private String favDurumSinavlar = "Sa";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinavlar_detay);

        textViewAdSinavlar = findViewById(R.id.textViewAdSinavlar);
        textViewAciklamaSinavlar = findViewById(R.id.textViewAciklamaSinavlar);
        textViewBaslikSinavlar = findViewById(R.id.textViewBaslikSinavlar);
        textViewKalanGunSinavlar = findViewById(R.id.textViewKalanGunSinavlar);
        textViewFavoriSinavlar = findViewById(R.id.textViewFavoriSinavlar);
        textViewTarihSinavlar = findViewById(R.id.textViewTarihSinavlar);
        //String kalangun = "Yıl : "+(sinavlar.getSinav_yil()-dp.getYear())+"Ay : "+(sinavlar.getSinav_ay()-dp.getMonth())+"Gün : "+(sinavlar.getSinav_gun()-dp.getDayOfMonth());

        sinavlar = (Sinavlar) getIntent().getSerializableExtra("sinav");

        SharedPreferences sp = getSharedPreferences("favoriler",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        boolean kontrol = sp.getBoolean("favoriSwitch"+sinavlar.getSinav_id(),false);

        if (kontrol){
            textViewFavoriSinavlar.setText("Favorilere Ekli Mi? : Evet");
        }else{
            textViewFavoriSinavlar.setText("Favorilere Ekli Mi? : Hayır");
        }
        textViewAdSinavlar.setText(sinavlar.getSinav_ad());
        textViewAciklamaSinavlar.setText(sinavlar.getSinav_aciklama());
        textViewTarihSinavlar.setText("Sınavın Tarihi : "+ sinavlar.getSinav_gun()+"/"+ sinavlar.getSinav_ay()+"/"+ sinavlar.getSinav_yil());
        textViewKalanGunSinavlar.setText("Allah kerim.");

    }
}
