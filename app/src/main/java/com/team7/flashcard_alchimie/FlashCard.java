package com.team7.flashcard_alchimie;

import java.util.ArrayList;

public class FlashCard {
    String question;
    int image;
    ArrayList<String> answers;
    String goodAnswer;

    public FlashCard(String question, int image, ArrayList<String> answers, String goodAnswer) {
        this.question = question;
        this.image = image;
        this.answers = answers;
        this.goodAnswer = goodAnswer;
    }
}
