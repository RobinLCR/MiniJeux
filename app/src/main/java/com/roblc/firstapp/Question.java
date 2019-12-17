package com.roblc.firstapp;

public class Question {

    private String titre;
    private String [] rep;


    public Question(String title, String [] Rep){
        this.titre = title;
        this.rep = Rep;

    }

    public String getTitre(){
        return this.titre;
    }

    public String getBonneRep(){
        return this.rep[0];
    }

    public String getRepAleat(){
        int n = (int) Math.random()*this.rep.length;
        String reponse = this.rep[n];
        return reponse;
    }


}
