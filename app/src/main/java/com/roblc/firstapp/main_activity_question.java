package com.roblc.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class main_activity_question extends AppCompatActivity {


    //VILLE est une clé qui sert à transmettre la valeur selectionnée
    final String VILLE = "ville";

    // réponses associées aux questions (première valeur du tableau doit être la bonne réponse !!!)
    final String [] rep1= {"Paris", "Rennes", "Toulouse", "Lille"};
    final String [] rep2= {"Paris", "Rennes", "Toulouse", "Lille"};
    final String [] rep3= {"Paris", "Rennes", "Toulouse", "Lille"};
    final String [] rep4= {"Paris", "Rennes", "Toulouse", "Lille"};
    final String [] rep5= {"Paris", "Rennes", "Toulouse", "Lille"};
    final String [] rep6= {"Paris", "Rennes", "Toulouse", "Lille"};
    final String [] rep7= {"Paris", "Rennes", "Toulouse", "Lille"};
    final String [] rep8= {"Paris", "Rennes", "Toulouse", "Lille"};
    final String [] rep9= {"Paris", "Rennes", "Toulouse", "Lille"};
    final String [] rep10= {"Paris", "Rennes", "Toulouse", "Lille"};

    final Question q1 = new Question("Quelle est la capitale de la France ? ", rep1);
    final Question q2 = new Question("Quelle est la capitale de la France ? ", rep2);
    final Question q3 = new Question("Quelle est la capitale de la France ? ", rep3);
    final Question q4 = new Question("Quelle est la capitale de la France ? ", rep4);
    final Question q5 = new Question("Quelle est la capitale de la France ? ", rep5);
    final Question q6 = new Question("Quelle est la capitale de la France ? ", rep6);
    final Question q7 = new Question("Quelle est la capitale de la France ? ", rep7);
    final Question q8 = new Question("Quelle est la capitale de la France ? ", rep8);
    final Question q9 = new Question("Quelle est la capitale de la France ? ", rep9);
    final Question q10 = new Question("Quelle est la capitale de la France ? ", rep10);

    final Question [] geographie ={q1,q2,q3,q4,q5,q6,q7,q8,q9,q10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_questions);

        final Button reponse1 = (Button) findViewById(R.id.button1);
        final Button reponse2 = (Button) findViewById(R.id.button2);
        final Button reponse3 = (Button) findViewById(R.id.button3);
        final Button reponse4 = (Button) findViewById(R.id.button4);

        int n = (int) Math.random()*geographie.length;
        Question questionAleat= geographie[n];

        // on affecte au textView la question
        TextView questionTitle = (TextView) findViewById(R.id.textTitle);
        questionTitle.setText(questionAleat.getTitre());

        // on affecte les différentes réponses aux boutons
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setText(questionAleat.getRepAleat());

        Button button2 = (Button) findViewById(R.id.button1);
        button1.setText(questionAleat.getRepAleat());

        Button button3 = (Button) findViewById(R.id.button1);
        button1.setText(questionAleat.getRepAleat());

        Button button4 = (Button) findViewById(R.id.button1);
        button1.setText(questionAleat.getRepAleat());



        //on définit ce qu'il va se passer quand l'action clickSurBouton1 est déclenchée
        View.OnClickListener clickSurBouton1  = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //quand on clique sur le bouton 1 on passe a l'activite resultat (reponse1Activity)
                // en passant comme parametre le texte du bouton 1
                Intent intent = new Intent(main_activity_question.this, activity_resultats.class);
                intent.putExtra(VILLE, reponse1.getText().toString());
                startActivity(intent);
            }
        };

        //on définit ce qu'il va se passer quand l'action clickSurBouton2 est déclenchée
        View.OnClickListener clickSurBouton2  = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_activity_question.this, com.roblc.firstapp.activity_resultats.class);
                intent.putExtra(VILLE, reponse2.getText().toString());
                startActivity(intent);
            }
        };

        //on définit ce qu'il va se passer quand l'action clickSurBouton3 est déclenchée
        View.OnClickListener clickSurBouton3  = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_activity_question.this, com.roblc.firstapp.activity_resultats.class);
                intent.putExtra(VILLE, reponse3.getText().toString());
                startActivity(intent);
            }
        };

        //associe au bouton reponse l'action clickSurBouton1
        reponse1.setOnClickListener(clickSurBouton1);
        reponse2.setOnClickListener(clickSurBouton2);
        reponse3.setOnClickListener(clickSurBouton3);


    }


}
