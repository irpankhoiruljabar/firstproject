package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int jumlah = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView texthw = findViewById(R.id.tv_hw);
        TextView textnama = findViewById(R.id.tv_nama);
        TextView textalamat = findViewById(R.id.tv_alamat);
        Button btnMove = findViewById(R.id.btn_pindah);

        texthw.setText("Selamat datang");
        textnama.setText("ujang");
        textalamat.setText("bandung");
        texthw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumlah++;
                Toast.makeText(MainActivity.this, "Anda memgklik gambar !! "+ jumlah + "kali", Toast.LENGTH_SHORT).show();
            }
        });
        textnama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Anda menekan tulisan", Toast.LENGTH_SHORT).show();
            }
        });
        textalamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Anda menekan tulisan alamat", Toast.LENGTH_SHORT).show();
            }
        });
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
               intent.putExtra("nama_key",textnama.getText());
                intent.putExtra("alamat_key",textalamat.getText());
                startActivity(intent);
//                finish();
//                onDestroy();
            }
        });
    }
}