package com.example.apk_jogo_forca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2, editText3, editText4, editText5,
            editText6, editText7, editText8, editText9, editText10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.primeiraPalavra);
        editText2 = findViewById(R.id.segundaPalavra);
        editText3 = findViewById(R.id.terceiraPalavra);
        editText4 = findViewById(R.id.quartaPalavra);
        editText5 = findViewById(R.id.quintaPalavra);
        editText6 = findViewById(R.id.sextaPalavra);
        editText7 = findViewById(R.id.setimaPalavra);
        editText8 = findViewById(R.id.oitavaPalavra);
        editText9 = findViewById(R.id.nonaPalavra);
        editText10 = findViewById(R.id.decimaPalavra);
    }

    public void comecarJogo(View view) {
        String palavraEscolhida = escolherPalavra();
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("palavra", palavraEscolhida);
        startActivity(intent);
    }

    private String escolherPalavra() {
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10) + 1;
        String palavra = "";
        switch (numero) {
            case 1:
                palavra = editText1.getText().toString();
                break;
            case 2:
                palavra = editText2.getText().toString();
                break;
            case 3:
                palavra =  editText3.getText().toString();
                break;
            case 4:
                palavra = editText4.getText().toString();
                break;
            case 5:
                palavra = editText5.getText().toString();
                break;
            case 6:
                palavra = editText6.getText().toString();
                break;
            case 7:
                palavra = editText7.getText().toString();
                break;
            case 8:
                palavra = editText8.getText().toString();
                break;
            case 9:
                palavra = editText9.getText().toString();
                break;
            case 10:
                palavra = editText10.getText().toString();
                break;
        }
        return palavra;
    }
}