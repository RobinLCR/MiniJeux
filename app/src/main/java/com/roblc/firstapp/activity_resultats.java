package com.roblc.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class activity_resultats extends AppCompatActivity {

    //VILLE est la clé qui sert à récuperer la variable passée par l'autre activité
    //il faut donc que le nom soit le meme que dans l'activite parente
    final String VILLE = "ville";
    private Button mPlayButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPlayButton1 = (Button) findViewById(R.id.qsuivante);


        //On charge l'activité des resultats
        setContentView(R.layout.activity_resultats);

        //On recupere la valeur de la ville qu'on a choisie
        //pour cela il faut passer par l'objet Intent qui a servi a lancer cette activité
        Intent intent = getIntent();
        String villeChoisie = intent.getStringExtra(VILLE);

        //On va afficher du texte en fonction de la ville choisie
        String resultat = "Mauvaise réponse !";
        Question question = 
        if(villeChoisie.toLowerCase().equals(question.getBonneRep())){
            resultat = "Bonne réponse !";
        }

        //On récupère la vue dans laquelle on va écrire la réponse
        //dans le fichier activity_resultat.xml elle a l'id textResultatQuestion
        TextView vueResultat = (TextView) findViewById(R.id.textResultatQuestion);

        //on écrit le résultat dans le textView de l'affichage de la réponse
        if(vueResultat != null){
            vueResultat.setText(resultat);
        }
    }
}
