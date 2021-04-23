package com.example.mariobros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Up_Mushroom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_up__mushroom);
        Button bmb = findViewById(R.id.bmb);
        Button bpp = findViewById(R.id.bpp);
        Button bbm = findViewById(R.id.bbm);
        Button bg = findViewById(R.id.bg);
        Button bbo = findViewById(R.id.bbo);

        bmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mario= new Intent(Up_Mushroom.this, MainActivity.class);
                startActivity(Mario);
            }
        });

        bpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Piranha= new Intent(Up_Mushroom.this, Piranha_Plant.class);
                startActivity(Piranha);
            }
        });

        bbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Big= new Intent(Up_Mushroom.this, Big_Mushroom.class);
                startActivity(Big);
            }
        });

        bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Goomba= new Intent(Up_Mushroom.this, Goomba.class);
                startActivity(Goomba);
            }
        });

        bbo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BobOmb= new Intent(Up_Mushroom.this, Bob_Omb.class);
                startActivity(BobOmb);
            }
        });
    }
}