package com.team7.flashcard_alchimie;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;

public class FlashCardsDifficulty {

    ArrayList<FlashCard> randomFlashCardsEasy() {

        ArrayList<String> answersArgent = new ArrayList<>();
        answersArgent.add("terre");
        answersArgent.add("or");
        answersArgent.add("argent");
        Collections.shuffle(answersArgent);

        ArrayList<FlashCard> flashCards = new ArrayList<>();

        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.lune_argent, answersArgent, "argent"));
/*
        flashCards.add(flashCard = new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.pierre_philosophale_, answersPierrePhilosophale, "pierre philosophale"));
        flashCards.add(flashCard = new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.plomb_saturne, answersPlomb, "plomb"));
        flashCards.add(flashCard = new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.salpetre, answersSalpetre, "salpetre"));
        flashCards.add(flashCard = new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.soufre, answersSoufre, "soufre"));
        flashCards.add(flashCard = new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.terre, answersTerre, "terre"));
        flashCards.add(flashCard = new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.vitrol, answersVitrol, "vitrol"));
*/

        Collections.shuffle(flashCards);

        return flashCards;
    }

    ArrayList<FlashCard> randomFlashCardsMedium() {

        ArrayList<String> answersArgent = new ArrayList<>();
        answersArgent.add("terre");
        answersArgent.add("or");
        answersArgent.add("argent");
        Collections.shuffle(answersArgent);
        ArrayList<String> answersMercure = new ArrayList<>();
        answersMercure.add("mercure");
        answersMercure.add("or");
        answersMercure.add("argent");
        Collections.shuffle(answersMercure);
        ArrayList<String> answersAir = new ArrayList<>();
        answersAir.add("terre");
        answersAir.add("air");
        answersAir.add("argent");
        Collections.shuffle(answersAir);
        ArrayList<String> answersArcenic = new ArrayList<>();
        answersArcenic.add("terre");
        answersArcenic.add("or");
        answersArcenic.add("arcenic");
        Collections.shuffle(answersArcenic);
        ArrayList<String> answersCuivre = new ArrayList<>();
        answersCuivre.add("cuivre");
        answersCuivre.add("or");
        answersCuivre.add("argent");
        Collections.shuffle(answersCuivre);
        ArrayList<String> answersEau = new ArrayList<>();
        answersEau.add("terre");
        answersEau.add("eau");
        answersEau.add("argent");
        Collections.shuffle(answersEau);
        ArrayList<String> answersEtain = new ArrayList<>();
        answersEtain.add("terre");
        answersEtain.add("or");
        answersEtain.add("etain");
        Collections.shuffle(answersEtain);
        ArrayList<String> answersOr = new ArrayList<>();
        answersOr.add("terre");
        answersOr.add("or");
        answersOr.add("argent");
        Collections.shuffle(answersOr);


        ArrayList<FlashCard> flashCards = new ArrayList<>();

        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.lune_argent, answersArgent, "argent"));
        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.mercure, answersMercure, "mercure"));
        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.air, answersAir, "air"));
        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.arsenic, answersArcenic, "arsenic"));
        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.cuivre_venus, answersCuivre, "cuivre"));
        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.eau, answersEau, "eau"));
        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.etain_jupiter, answersEtain, "etain"));
        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.or_soleil, answersOr, "or"));
/*
        flashCards.add(flashCard = new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.pierre_philosophale_, answersPierrePhilosophale, "pierre philosophale"));
        flashCards.add(flashCard = new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.plomb_saturne, answersPlomb, "plomb"));
        flashCards.add(flashCard = new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.salpetre, answersSalpetre, "salpetre"));
        flashCards.add(flashCard = new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.soufre, answersSoufre, "soufre"));
        flashCards.add(flashCard = new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.terre, answersTerre, "terre"));
        flashCards.add(flashCard = new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.vitrol, answersVitrol, "vitrol"));
*/

        Collections.shuffle(flashCards);

        return flashCards;
    }

    ArrayList<FlashCard> randomFlashCardsHard() {

        ArrayList<String> answersArgent = new ArrayList<>();
        answersArgent.add("terre");
        answersArgent.add("or");
        answersArgent.add("argent");
        Collections.shuffle(answersArgent);
        ArrayList<String> answersMercure = new ArrayList<>();
        answersMercure.add("mercure");
        answersMercure.add("or");
        answersMercure.add("argent");
        Collections.shuffle(answersMercure);
        ArrayList<String> answersAir = new ArrayList<>();
        answersAir.add("terre");
        answersAir.add("air");
        answersAir.add("argent");
        Collections.shuffle(answersAir);
        ArrayList<String> answersArcenic = new ArrayList<>();
        answersArcenic.add("terre");
        answersArcenic.add("or");
        answersArcenic.add("arcenic");
        Collections.shuffle(answersArcenic);
        ArrayList<String> answersCuivre = new ArrayList<>();
        answersCuivre.add("cuivre");
        answersCuivre.add("or");
        answersCuivre.add("argent");
        Collections.shuffle(answersCuivre);
        ArrayList<String> answersEau = new ArrayList<>();
        answersEau.add("terre");
        answersEau.add("eau");
        answersEau.add("argent");
        Collections.shuffle(answersEau);
        ArrayList<String> answersEtain = new ArrayList<>();
        answersEtain.add("terre");
        answersEtain.add("or");
        answersEtain.add("etain");
        Collections.shuffle(answersEtain);
        ArrayList<String> answersOr = new ArrayList<>();
        answersOr.add("terre");
        answersOr.add("or");
        answersOr.add("argent");
        Collections.shuffle(answersOr);
        ArrayList<String> answersPierrePhilosophale = new ArrayList<>();
        answersPierrePhilosophale.add("pierre philosophale");
        answersPierrePhilosophale.add("or");
        answersPierrePhilosophale.add("argent");
        Collections.shuffle(answersPierrePhilosophale);
        ArrayList<String> answersPlomb = new ArrayList<>();
        answersPlomb.add("terre");
        answersPlomb.add("plomb");
        answersPlomb.add("argent");
        Collections.shuffle(answersPlomb);
        ArrayList<String> answersSalpetre = new ArrayList<>();
        answersSalpetre.add("terre");
        answersSalpetre.add("or");
        answersSalpetre.add("salpetre");
        Collections.shuffle(answersSalpetre);
        ArrayList<String> answersSoufre = new ArrayList<>();
        answersSoufre.add("terre");
        answersSoufre.add("or");
        answersSoufre.add("soufre");
        Collections.shuffle(answersSoufre);
        ArrayList<String> answersTerre = new ArrayList<>();
        answersTerre.add("terre");
        answersTerre.add("or");
        answersTerre.add("soufre");
        Collections.shuffle(answersTerre);
        ArrayList<String> answersVitrol = new ArrayList<>();
        answersVitrol.add("terre");
        answersVitrol.add("or");
        answersVitrol.add("vitrol");
        Collections.shuffle(answersVitrol);


        ArrayList<FlashCard> flashCards = new ArrayList<>();

        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.lune_argent, answersArgent, "argent"));
        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.mercure, answersMercure, "mercure"));
        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.air, answersAir, "air"));
        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.arsenic, answersArcenic, "arsenic"));
        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.cuivre_venus, answersCuivre, "cuivre"));
        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.eau, answersEau, "eau"));
        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.etain_jupiter, answersEtain, "etain"));
        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.or_soleil, answersOr, "or"));
        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.pierre_philosophale_, answersPierrePhilosophale, "pierre philosophale"));
        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.plomb_saturne, answersPlomb, "plomb"));
        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.salpetre, answersSalpetre, "salpetre"));
        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.soufre, answersSoufre, "soufre"));
        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.terre, answersTerre, "terre"));
        flashCards.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.vitrol, answersVitrol, "vitrol"));


        Collections.shuffle(flashCards);

        return flashCards;
    }
}
