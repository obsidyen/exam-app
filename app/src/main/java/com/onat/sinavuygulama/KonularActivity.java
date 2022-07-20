package com.onat.sinavuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KonularActivity extends AppCompatActivity {

    private Button buttonFavoriler,buttonBasvurular,buttonSinavlar,buttonTercihler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konular);

        buttonFavoriler = findViewById(R.id.buttonFavoriler);
        buttonBasvurular = findViewById(R.id.buttonBasvurular);
        buttonSinavlar = findViewById(R.id.buttonSinavlar);
        buttonTercihler = findViewById(R.id.buttonTercihler);

        buttonBasvurular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KonularActivity.this,BasvurularActivity.class));
            }
        });

        buttonSinavlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KonularActivity.this,SinavlarActivity.class));
            }
        });

        buttonTercihler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KonularActivity.this,TercihlerActivity.class));
            }
        });
        buttonFavoriler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KonularActivity.this,FavorilerActivity.class));
            }
        });
    }
}
