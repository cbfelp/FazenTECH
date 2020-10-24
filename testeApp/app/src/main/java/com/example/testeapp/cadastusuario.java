package com.example.testeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class cadastusuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_usuario);
    }
    public void cadastrado(View view){
        startActivity(new Intent(this, com.example.testeapp.MainActivity.class));
    }
}