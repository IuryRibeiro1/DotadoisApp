package com.example.dotaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.security.Guard;

public class TelaPrincipal extends AppCompatActivity {

    private EditText textmmratual, textmmrdesejado;
    private Button buttoncalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        getSupportActionBar().hide();
        iniciarcomponentes();

        buttoncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int mmratual = Integer.parseInt(textmmratual.getText().toString());

                    if(mmratual == 10 || mmratual < 154) {
                        Fragment newFragment = new Haroldoum();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 154 || mmratual < 308){
                        Fragment newFragment = new Haroldodois();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if (mmratual == 308 || mmratual < 462){
                        Fragment newFragment = new Haroldotres();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 462 || mmratual < 616){
                        Fragment newFragment = new Haroldoquatro();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 616 || mmratual < 770){
                        Fragment newFragment = new Haroldocinco();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 770 || mmratual < 924){
                        Fragment newFragment = new Guardianum();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 924 || mmratual < 1078){
                        Fragment newFragment = new Guardiandois();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 1078 || mmratual < 1232){
                        Fragment newFragment = new Guardiantres();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 1232 || mmratual < 1386){
                        Fragment newFragment = new Guardianquatro();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 1386 || mmratual < 1540){
                        Fragment newFragment = new Guardiancinco();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 1540 || mmratual < 1694){
                        Fragment newFragment = new Cruzadoum();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 1694 || mmratual < 1850){
                        Fragment newFragment = new Cruzadodois();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 1850 || mmratual < 2010){
                        Fragment newFragment = new Cruzadotres();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 2010 || mmratual < 2170){
                        Fragment newFragment = new Cruzadoquatro();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 2170 || mmratual < 2320){
                        Fragment newFragment = new Cruzadocinco();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 2320 || mmratual < 2470){
                        Fragment newFragment = new Archonum();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 2470 || mmratual < 2620){
                        Fragment newFragment = new Archondois();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 2620 || mmratual < 2780){
                        Fragment newFragment = new Archontres();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 2780 || mmratual < 2930){
                        Fragment newFragment = new Archonquatro();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 2930 || mmratual < 3080){
                        Fragment newFragment = new Archoncinco();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 3080 || mmratual < 3234){
                        Fragment newFragment = new Legendum();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 3234 || mmratual < 3388){
                        Fragment newFragment = new Legenddois();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 3388 || mmratual < 3542){
                        Fragment newFragment = new Legendtres();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 3542 || mmratual < 3696){
                        Fragment newFragment = new Legendquatro();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 3696 || mmratual < 3850){
                        Fragment newFragment = new Legendcinco();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 3850 || mmratual < 4004){
                        Fragment newFragment = new Ancientum();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 4004 || mmratual < 4158){
                        Fragment newFragment = new Ancientdois();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 4158 || mmratual < 4312){
                        Fragment newFragment = new Ancienttres();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 4312 || mmratual < 4466){
                        Fragment newFragment = new Ancientquatro();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 4466 || mmratual < 4620){
                        Fragment newFragment = new Ancientcinco();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 4620 || mmratual < 4820){
                        Fragment newFragment = new Divineum();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 4820 || mmratual < 5020){
                        Fragment newFragment = new Divinedois();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 5020 || mmratual < 5220){
                        Fragment newFragment = new Divinetres();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 5220 || mmratual < 5420){
                        Fragment newFragment = new Divinequatro();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual == 5420 || mmratual < 5650){
                        Fragment newFragment = new Divinecinco();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }else if(mmratual >= 5650){
                        Fragment newFragment = new Imortal();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.flfragment, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }
            }
        });

    }

    public void iniciarcomponentes(){
        textmmratual = findViewById(R.id.mmratual);
        textmmrdesejado = findViewById(R.id.mmrdesejado);
        buttoncalcular = findViewById(R.id.buttoncalcular);
    }

}