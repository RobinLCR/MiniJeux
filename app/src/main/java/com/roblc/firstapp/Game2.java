package com.roblc.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Game2 extends AppCompatActivity {

    private TextView TextJeu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        TextJeu2 = (TextView) findViewById(R.id.game2_textView);
    }
}
