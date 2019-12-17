package com.roblc.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Game1 extends AppCompatActivity {

    private TextView TextJeu1;
    private Button mPlayButton1;
    private Button mPlayButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);
        TextJeu1 = (TextView) findViewById(R.id.textResult);
        mPlayButton1 = (Button) findViewById(R.id.choix1);
        mPlayButton2 = (Button) findViewById(R.id.choix2);

        mPlayButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chooseGameActivityIntent = new Intent(Game1.this, question1.class);
                startActivity(chooseGameActivityIntent);
            }
        });

        /*mPlayButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chooseGameActivityIntent = new Intent(Game1.this, question1.class);
                startActivity(chooseGameActivityIntent);
            }
        });
        */
    }



}
