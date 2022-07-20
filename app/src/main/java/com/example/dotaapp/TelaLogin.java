package com.example.dotaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaLogin extends AppCompatActivity {

    private TextView textcadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);
        getSupportActionBar().hide();
        iniciarcomponentes();

        textcadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaLogin.this , TelaCadastro.class);
                startActivity(intent);

            }
        });

    }

    public void iniciarcomponentes(){
        textcadastrar = findViewById(R.id.textcadastrar);

    }

}