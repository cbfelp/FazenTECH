package com.example.testeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cadastr(View view){
        startActivity(new Intent(this, com.example.testeapp.cadastusuario.class));
    }
    public void entrar(View view){
        startActivity(new Intent(this, com.example.testeapp.product.class));
    }
}