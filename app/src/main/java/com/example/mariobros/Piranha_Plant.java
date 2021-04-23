package com.example.mariobros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Piranha_Plant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piranha__plant);
        Button bmb = findViewById(R.id.bmb);
        Button bum = findViewById(R.id.bum);
        Button bbm = findViewById(R.id.bbm);
        Button bg = findViewById(R.id.bg);
        Button bbo = findViewById(R.id.bbo);

        bmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mario= new Intent(Piranha_Plant.this, MainActivity.class);
                startActivity(Mario);
            }
        });

        bum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Up= new Intent(Piranha_Plant.this, Up_Mushroom.class);
                startActivity(Up);
            }
        });

        bbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Big= new Intent(Piranha_Plant.this, Big_Mushroom.class);
                startActivity(Big);
            }
        });

        bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Goomba= new Intent(Piranha_Plant.this, Goomba.class);
                startActivity(Goomba);
            }
        });

        bbo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BobOmb= new Intent(Piranha_Plant.this, Bob_Omb.class);
                startActivity(BobOmb);
            }
        });
    }
}