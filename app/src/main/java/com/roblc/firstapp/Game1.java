package com.roblc.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Game1 extends AppCompatActivity {

    private TextView TextJeu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);
        TextJeu1 = (TextView) findViewById(R.id.game1_textView);
    }
}
