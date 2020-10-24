package com.example.testeapp;
//https://www.youtube.com/watch?v=a87CqD1qm18//
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editemail, editpswd, editname, editadress, editnasc;
    Button btnsave;
    Button btnclean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editemail = (EditText)findViewById(R.id.editemail);
        editpswd = (EditText)findViewById(R.id.editpswd);
        editname = (EditText)findViewById(R.id.editname);
        editadress = (EditText)findViewById(R.id.editadress);
        editnasc = (EditText)findViewById(R.id.editnasc);

        btnsave = (Button)findViewById(R.id.btnsave);
        btnclean = (Button)findViewById(R.id.btnclean);

    }
}