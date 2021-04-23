package com.example.mariobros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Big_Mushroom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big__mushroom);
        Button bmb = findViewById(R.id.bmb);
        Button bpp = findViewById(R.id.bpp);
        Button bum = findViewById(R.id.bum);
        Button bg = findViewById(R.id.bg);
        Button bbo = findViewById(R.id.bbo);

        bmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mario= new Intent(Big_Mushroom.this, MainActivity.class);
                startActivity(Mario);
            }
        });

        bpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Piranha= new Intent(Big_Mushroom.this, Piranha_Plant.class);
                startActivity(Piranha);
            }
        });

        bum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Up= new Intent(Big_Mushroom.this, Up_Mushroom.class);
                startActivity(Up);
            }
        });

        bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Goomba= new Intent(Big_Mushroom.this, Goomba.class);
                startActivity(Goomba);
            }
        });

        bbo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BobOmb= new Intent(Big_Mushroom.this, Bob_Omb.class);
                startActivity(BobOmb);
            }
        });
    }
}