package com.example.apk_jogo_forca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2, editText3, editText4, editText5,
            editText6, editText7, editText8, editText9, editText10, editText;
    private Button buttonComecar;

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
        buttonComecar = findViewById(R.id.botaoComecar);
    }
}