package com.example.mariobros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bob_Omb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bob__omb);
        Button bmb = findViewById(R.id.bmb);
        Button bpp = findViewById(R.id.bpp);
        Button bum = findViewById(R.id.bum);
        Button bbm = findViewById(R.id.bbm);
        Button bg = findViewById(R.id.bg);

        bmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mario= new Intent(Bob_Omb.this, MainActivity.class);
                startActivity(Mario);
            }
        });

        bpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Piranha= new Intent(Bob_Omb.this, Piranha_Plant.class);
                startActivity(Piranha);
            }
        });

        bum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Up= new Intent(Bob_Omb.this, Up_Mushroom.class);
                startActivity(Up);
            }
        });

        bbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Big= new Intent(Bob_Omb.this, Big_Mushroom.class);
                startActivity(Big);
            }
        });

        bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Goomba= new Intent(Bob_Omb.this, Goomba.class);
                startActivity(Goomba);
            }
        });
    }
}