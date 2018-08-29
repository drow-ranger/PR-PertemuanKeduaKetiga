package com.deofibrianico.mako.pr_pertemuankeduaketiga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText sisi = findViewById(R.id.etSisi);
        Button luas = findViewById(R.id.btnLuas);
        Button keliling = findViewById(R.id.btnKeliling);
        Button volume = findViewById(R.id.btnVolume);
        final TextView hasil = findViewById(R.id.tvHasil);

        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double inptSisi, outpLuas;
                String strSisi = sisi.getText().toString();
                if (!TextUtils.isEmpty(strSisi)){
                    try {
                        inptSisi = Double.parseDouble(sisi.getText().toString());
                        outpLuas = inptSisi*4*8;
                        hasil.setText(outpLuas.toString());
                        Toast.makeText(MainActivity.this, "Anda Pilih Luas", Toast.LENGTH_SHORT).show();
                    }catch (NullPointerException e){
                        Toast.makeText(MainActivity.this, "Pastikan Anda Input Angka!!!", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this, "Input Sek Boss!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double inptSisi, outpKeliling;
                String strSisi = sisi.getText().toString();
                if (!TextUtils.isEmpty(strSisi)){
                    try {
                        inptSisi = Double.parseDouble(sisi.getText().toString());
                        outpKeliling = inptSisi*12;
                        hasil.setText(outpKeliling.toString());
                        Toast.makeText(MainActivity.this, "Anda Pilih Keliling", Toast.LENGTH_SHORT).show();
                    }catch (NullPointerException e){
                        Toast.makeText(MainActivity.this, "Pastikan Anda Input Angka!!!", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this, "Input Sek Boss!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double inptSisi, outpVolume;
                String strSisi = sisi.getText().toString();
                if (!TextUtils.isEmpty(strSisi)){
                    try {
                        inptSisi = Double.parseDouble(sisi.getText().toString());
                        outpVolume = inptSisi*inptSisi*inptSisi;
                        hasil.setText(outpVolume.toString());
                        Toast.makeText(MainActivity.this, "Anda Pilih Volume", Toast.LENGTH_SHORT).show();
                    }catch (NullPointerException e){
                        Toast.makeText(MainActivity.this, "Pastikan Anda Input Angka!!!", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this, "Input Sek Boss!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });


        final EditText sisi1 = findViewById(R.id.etSisi1);
        final RadioGroup hitung = findViewById(R.id.rgHitung);
        Button calc = findViewById(R.id.btnHitung);
        final TextView hasil1 = findViewById(R.id.tvHasil1);
        String a = "index";

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = hitung.getCheckedRadioButtonId();
                Double inptSisi, outpHasil;
                String strSisi = sisi1.getText().toString();
                switch (index){
                    case R.id.rbLuas:
                        if (!TextUtils.isEmpty(strSisi)){
                            try {
                                inptSisi = Double.parseDouble(sisi1.getText().toString());
                                outpHasil = inptSisi*4*8;
                                hasil1.setText(outpHasil.toString());
                                Toast.makeText(MainActivity.this, "Anda Pilih Luas", Toast.LENGTH_SHORT).show();
                            }catch (NumberFormatException e){
                                Toast.makeText(MainActivity.this, "Pastikan Anda Input Angka!!!", Toast.LENGTH_SHORT).show();
                            }
                        }else {
                            Toast.makeText(MainActivity.this, "Input Sek Boss!!!", Toast.LENGTH_SHORT).show();
                        }
                        break;
                    case R.id.rbKeliling:
                        if (!TextUtils.isEmpty(strSisi)) {
                            try {
                                inptSisi = Double.parseDouble(sisi1.getText().toString());
                                outpHasil = inptSisi * 12;
                                hasil1.setText(outpHasil.toString());
                                Toast.makeText(MainActivity.this, "Anda Pilih Keliling", Toast.LENGTH_SHORT).show();
                            } catch (NumberFormatException e) {
                                Toast.makeText(MainActivity.this, "Pastikan Anda Input Angka!!!", Toast.LENGTH_SHORT).show();
                            }
                        }else {
                            Toast.makeText(MainActivity.this, "Input Sek Boss!!!", Toast.LENGTH_SHORT).show();
                        }
                        break;
                    case R.id.rbVolume:
                        if (!TextUtils.isEmpty(strSisi)) {
                            try {
                                inptSisi = Double.parseDouble(sisi1.getText().toString());
                                outpHasil = inptSisi * inptSisi * inptSisi;
                                hasil1.setText(outpHasil.toString());
                                Toast.makeText(MainActivity.this, "Anda Pilih Volume", Toast.LENGTH_SHORT).show();
                            } catch (NumberFormatException e) {
                                Toast.makeText(MainActivity.this, "Pastikan Anda Input Angka!!!", Toast.LENGTH_SHORT).show();
                            }
                        }else {
                            Toast.makeText(MainActivity.this, "Input Sek Boss!!!", Toast.LENGTH_SHORT).show();
                        }
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Pastikan Anda Sudah Memilih!!!", Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });

    }
}
