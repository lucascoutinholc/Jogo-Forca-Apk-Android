package com.example.apk_jogo_forca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView textViewPalavra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textViewPalavra = findViewById(R.id.palavraEscolhida);

        Intent intent = getIntent();
        textViewPalavra.setText(intent.getStringExtra("palavra"));
    }
}