package com.roblc.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChooseMiniGame extends AppCompatActivity {

    private TextView choseText;
    private Button mPlayButton1;
    private Button mPlayButton2;
    private Button mPlayButton3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_mini_game);
        choseText = (TextView) findViewById(R.id.chose_textView);
        mPlayButton1 = (Button) findViewById(R.id.miniGame1);
        mPlayButton2 = (Button) findViewById(R.id.miniGame2);
        mPlayButton3 = (Button) findViewById(R.id.miniGame3);

        mPlayButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chooseGameActivityIntent = new Intent(ChooseMiniGame.this, Game1.class);
                startActivity(chooseGameActivityIntent);
            }
        });

        mPlayButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chooseGameActivityIntent = new Intent(ChooseMiniGame.this, Game2.class);
                startActivity(chooseGameActivityIntent);
            }
        });

        mPlayButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chooseGameActivityIntent = new Intent(ChooseMiniGame.this, Game3.class);
                startActivity(chooseGameActivityIntent);
            }
        });
    }
}
