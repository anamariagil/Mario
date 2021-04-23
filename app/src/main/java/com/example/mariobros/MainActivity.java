package com.example.mariobros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mario_bros);
        Button bpp = findViewById(R.id.bpp);
        Button bum = findViewById(R.id.bum);
        Button bbm = findViewById(R.id.bbm);
        Button bg = findViewById(R.id.bg);
        Button bbo = findViewById(R.id.bbo);

        bpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Piranha= new Intent(MainActivity.this, Piranha_Plant.class);
                startActivity(Piranha);
            }
        });

        bum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Up= new Intent(MainActivity.this, Up_Mushroom.class);
                startActivity(Up);
            }
        });

        bbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Big= new Intent(MainActivity.this, Big_Mushroom.class);
                startActivity(Big);
            }
        });

        bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Goomba= new Intent(MainActivity.this, Goomba.class);
                startActivity(Goomba);
            }
        });

        bbo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BobOmb= new Intent(MainActivity.this, Bob_Omb.class);
                startActivity(BobOmb);
            }
        });
    }
}