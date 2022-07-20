package com.example.dotaapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;

public class TelaCadastro extends AppCompatActivity {

    private EditText textnomecadastrar, textemailcadastrar, textsenhacadastrar, textcelularcadastrar;
    private Button buttoncadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        getSupportActionBar().hide();
        iniciarcomponentes();

        buttoncadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = textemailcadastrar.getText().toString();
                String senha = textsenhacadastrar.getText().toString();
                String nome = textnomecadastrar.getText().toString();
                String celular = textcelularcadastrar.getText().toString();

                if (email.isEmpty() || senha.isEmpty() || nome.isEmpty() || celular.isEmpty()){
                    Snackbar.make(view , "Preencha todos os campos" , Snackbar.LENGTH_SHORT).show();
                }else{
                    Autenticarusuario(view);
                }

            }
        });

    }

    public void Autenticarusuario(View view){

        String email = textemailcadastrar.getText().toString();
        String senha = textsenhacadastrar.getText().toString();

        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()){
                    Snackbar.make(view, "Cadastro realizado com sucesso", Snackbar.LENGTH_SHORT).show();

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            trocardetela();
                        }
                    },3000);

                }else{
                    String erro;
                    try {
                        throw task.getException();
                    }catch (FirebaseAuthWeakPasswordException e){
                        erro = "Digite uma senha com no mínimo 6 caractéres";
                    }catch (FirebaseAuthInvalidUserException e){
                        erro = "Digite um e-mail válido";
                    }catch (FirebaseAuthUserCollisionException e){
                        erro = "E-mail já cadastrado";
                    }catch (Exception e){
                        erro = "Erro ao cadastrar usuário";
                    }Snackbar.make(view, erro , Snackbar.LENGTH_SHORT).show();
                }
            }
        });

    }
    public void trocardetela(){
        Intent intent = new Intent(TelaCadastro.this , TelaPrincipal.class);
        startActivity(intent);
    }


    public void iniciarcomponentes(){
        textnomecadastrar = findViewById(R.id.textnomecadastrar);
        textemailcadastrar = findViewById(R.id.textemailcadastrar);
        textsenhacadastrar = findViewById(R.id.textsenhacadastrar);
        textcelularcadastrar = findViewById(R.id.textcelularcadastrar);
        buttoncadastrar = findViewById(R.id.buttoncadatrar);

    }

}