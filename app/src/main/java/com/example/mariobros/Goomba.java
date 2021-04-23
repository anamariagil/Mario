package com.example.mariobros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Goomba extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goomba);
        Button bmb = findViewById(R.id.bmb);
        Button bpp = findViewById(R.id.bpp);
        Button bum = findViewById(R.id.bum);
        Button bbm = findViewById(R.id.bbm);
        Button bbo = findViewById(R.id.bbo);

        bmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mario= new Intent(Goomba.this, MainActivity.class);
                startActivity(Mario);
            }
        });

        bpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Piranha= new Intent(Goomba.this, Piranha_Plant.class);
                startActivity(Piranha);
            }
        });

        bum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Up= new Intent(Goomba.this, Up_Mushroom.class);
                startActivity(Up);
            }
        });

        bbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Big= new Intent(Goomba.this, Big_Mushroom.class);
                startActivity(Big);
            }
        });

        bbo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BobOmb= new Intent(Goomba.this, Bob_Omb.class);
                startActivity(BobOmb);
            }
        });
    }
}