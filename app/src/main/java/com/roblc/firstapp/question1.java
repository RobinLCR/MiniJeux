package com.roblc.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class question1 extends AppCompatActivity {

    //VILLE est une clé qui sert à transmettre la valeur selectionnée
    final String VILLE = "ville";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_questions);

        final Button reponse1 = (Button) findViewById(R.id.button1);
        final Button reponse2 = (Button) findViewById(R.id.button2);
        final Button reponse3 = (Button) findViewById(R.id.button3);
        final Button reponse4 = (Button) findViewById(R.id.button4);


        //on définit ce qu'il va se passer quand l'action clickSurBouton1 est déclenchée
        View.OnClickListener clickSurBouton1  = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //quand on clique sur le bouton 1 on passe a l'activite resultat (reponse1Activity)
                // en passant comme parametre le texte du bouton 1
                Intent intent = new Intent(question1.this, activity_resultats.class);
                intent.putExtra(VILLE, reponse1.getText().toString());
                startActivity(intent);
            }
        };

        //on définit ce qu'il va se passer quand l'action clickSurBouton2 est déclenchée
        View.OnClickListener clickSurBouton2  = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(question1.this, com.roblc.firstapp.activity_resultats.class);
                intent.putExtra(VILLE, reponse2.getText().toString());
                startActivity(intent);
            }
        };

        //on définit ce qu'il va se passer quand l'action clickSurBouton3 est déclenchée
        View.OnClickListener clickSurBouton3  = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(question1.this, com.roblc.firstapp.activity_resultats.class);
                intent.putExtra(VILLE, reponse3.getText().toString());
                startActivity(intent);
            }
        };

        //associe au bouton reponse l'action clickSurBouton1
        reponse1.setOnClickListener(clickSurBouton1);
        reponse2.setOnClickListener(clickSurBouton2);
        reponse3.setOnClickListener(clickSurBouton3);

        mPlayButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chooseGameActivityIntent = new Intent(question1.this, question2.class);
                startActivity(chooseGameActivityIntent);
            }
        });
    }





}


