package com.example.indrico.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    EditText nilai1, nilai2, hasil;
    Button btntambah, btnkali, btnkurang, btnbagi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nilai1 = findViewById(R.id.editNilai1);
        nilai2 = findViewById(R.id.editNilai2);
        hasil = findViewById(R.id.editHasil);
        btntambah = findViewById(R.id.btn_tambah);
        btnkali = findViewById(R.id.btn_kali);
        btnkurang = findViewById(R.id.btn_kurang);
        btnbagi = findViewById(R.id.btn_bagi);
        //nilai1.setText("Indrico");
        //nilai2.setText("20161000005");
        //Pas button tambah di tekan.


        btntambah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int n1= 0, n2 = 0, hs = 0;
                n1 = Integer.valueOf(nilai1.getText().toString());
                n2 = Integer.parseInt(nilai2.getText().toString());
                hs = n1+n2;
                hasil.setText(String.valueOf(hs));
            }
        });

        btnkali.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int n1= 0, n2 = 0, hs = 0;
                n1 = Integer.valueOf(nilai1.getText().toString());
                n2 = Integer.parseInt(nilai2.getText().toString());
                hs = n1*n2;
                hasil.setText(String.valueOf(hs));
            }
        });

        btnbagi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int n1= 0, n2 = 0, hs = 0;
                n1 = Integer.valueOf(nilai1.getText().toString());
                n2 = Integer.parseInt(nilai2.getText().toString());
                if (n2==0)
                {
                    n2 = 1;
                }
                hs = n1/n2;
                hasil.setText(String.valueOf(hs));
            }
        });

        btnkurang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int n1= 0, n2 = 0, hs = 0;
                n1 = Integer.valueOf(nilai1.getText().toString());
                n2 = Integer.parseInt(nilai2.getText().toString());
                hs = n1-n2;
                hasil.setText(String.valueOf(hs));
            }
        });
    }
}
