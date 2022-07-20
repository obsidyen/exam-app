package com.onat.sinavuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

public class BasvurularDetayActivity extends AppCompatActivity {

    private TextView textViewAd,textViewAciklama,textViewBaslik,textViewKalanGun,textViewFavori,textViewTarih;
    private Basvurular basvurular;
    private DatePicker dp;
    private String favDurum = "Sa";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basvurular_detay);

        textViewAd = findViewById(R.id.textViewAd);
        textViewAciklama = findViewById(R.id.textViewAciklama);
        textViewBaslik = findViewById(R.id.textViewBaslik);
        textViewKalanGun = findViewById(R.id.textViewKalanGun);
        textViewFavori = findViewById(R.id.textViewFavori);
        textViewTarih = findViewById(R.id.textViewTarih);
        //String kalangun = "Yıl : "+(basvurular.getBasvuru_yil()-dp.getYear())+"Ay : "+(basvurular.getBasvuru_ay()-dp.getMonth())+"Gün : "+(basvurular.getBasvuru_gun()-dp.getDayOfMonth());

        basvurular = (Basvurular)getIntent().getSerializableExtra("basvuru");

        SharedPreferences sp = getSharedPreferences("favoriler",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        boolean kontrol = sp.getBoolean("favoriSwitch"+basvurular.getBasvuru_id(),false);

        if (kontrol){
            textViewFavori.setText("Favorilere Ekli Mi? : Evet");
        }else{
            textViewFavori.setText("Favorilere Ekli Mi? : Hayır");
        }

        textViewAd.setText(basvurular.getBasvuru_ad());
        textViewAciklama.setText(basvurular.getBasvuru_aciklama());
        textViewTarih.setText("Sınavın Tarihi : "+ basvurular.getBasvuru_gun()+"/"+ basvurular.getBasvuru_ay()+"/"+ basvurular.getBasvuru_yil());
        textViewKalanGun.setText("Allah kerim.");

    }
}
