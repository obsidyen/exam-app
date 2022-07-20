package com.onat.sinavuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonGiris;
    private TextView textViewGiris;
    private ImageView imageViewGiris;
    private Animation alpha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGiris = findViewById(R.id.buttonGiris);
        textViewGiris = findViewById(R.id.textViewGiris);
        imageViewGiris = findViewById(R.id.imageViewGiris);

        alpha = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
        buttonGiris.setAnimation(alpha);
        imageViewGiris.setAnimation(alpha);
        textViewGiris.setAnimation(alpha);

        buttonGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,KonularActivity.class));
            }
        });

    }
}
