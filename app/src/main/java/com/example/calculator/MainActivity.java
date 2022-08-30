package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnKali, btnBagi, btnTambah, btnKurang;
    EditText edtPertama, edtKedua;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPertama =  (EditText) findViewById(R.id.edtPertama);
        edtKedua =  (EditText) findViewById(R.id.edtKedua);
        txtHasil = (TextView) findViewById(R.id.txtHasil);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilai1 = Integer.parseInt(edtPertama.getText().toString());
                int nilai2 = Integer.parseInt(edtKedua.getText().toString());
                int hasil = nilai1 + nilai2;
                txtHasil.setText(String.valueOf(hasil));
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilai1 = Integer.parseInt(edtPertama.getText().toString());
                int nilai2 = Integer.parseInt(edtKedua.getText().toString());
                int hasil = nilai1 - nilai2;
                txtHasil.setText(String.valueOf(hasil));
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilai1 = Integer.parseInt(edtPertama.getText().toString());
                int nilai2 = Integer.parseInt(edtKedua.getText().toString());
                int hasil = nilai1 * nilai2;
                txtHasil.setText(String.valueOf(hasil));
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilai1 = Integer.parseInt(edtPertama.getText().toString());
                int nilai2 = Integer.parseInt(edtKedua.getText().toString());
                int hasil = nilai1 / nilai2;
                txtHasil.setText(String.valueOf(hasil));
            }
        });

    }
}