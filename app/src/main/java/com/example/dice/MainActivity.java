package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int arpoNumero;
    private TextView arvonta;
    private Button but;
    final int MIN = (int) Math.ceil(1);
    final int MAX = (int) Math.floor(6);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but = findViewById(R.id.but);
        arvonta = findViewById(R.id.arvonta);
    }

    @SuppressLint("ShowToast")
    public void onClickArpa(View view) {

        arpoNumero = (int) Math.floor(Math.random() * (MAX - MIN + 1) + MIN);

        arvonta.setText(String.valueOf(arpoNumero));
       
    }



}