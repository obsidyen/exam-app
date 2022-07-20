package com.onat.sinavuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FavoriDetayActivity extends AppCompatActivity {

    private TextView textViewAdFavoriler,textViewAciklamaFavoriler,textViewBaslikFavoriler,textViewKalanGunFavoriler,textViewTarihFavoriler;
    private Favoriler favoriler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favori_detay);

        textViewAdFavoriler = findViewById(R.id.textViewAdFavoriler);
        textViewAciklamaFavoriler = findViewById(R.id.textViewAciklamaFavoriler);
        textViewBaslikFavoriler = findViewById(R.id.textViewBaslikFavoriler);
        textViewKalanGunFavoriler = findViewById(R.id.textViewKalanGunFavoriler);
        textViewTarihFavoriler = findViewById(R.id.textViewTarihFavoriler);

        favoriler = (Favoriler) getIntent().getSerializableExtra("favori");



        textViewAdFavoriler.setText(favoriler.getFavori_ad());
        textViewAciklamaFavoriler.setText(favoriler.getFavori_aciklama());
        textViewTarihFavoriler.setText("Sınavın Tarihi : "+ favoriler.getFavori_gun()+"/"+ favoriler.getFavori_ay()+"/"+ favoriler.getFavori_yil());
        textViewKalanGunFavoriler.setText("Allah kerim.");
    }
}
