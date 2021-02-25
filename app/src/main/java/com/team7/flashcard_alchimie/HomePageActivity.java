package com.team7.flashcard_alchimie;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Button startQuizz = findViewById(R.id.quizzButton);
        startQuizz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup difficulty = new RadioGroup(HomePageActivity.this);
                RadioButton easy = new RadioButton(HomePageActivity.this);
                RadioButton medium = new RadioButton(HomePageActivity.this);
                RadioButton hard = new RadioButton(HomePageActivity.this);
                easy.setText("facile");
                medium.setText("moyen");
                hard.setText("difficile");
                difficulty.addView(easy);
                difficulty.addView(medium);
                difficulty.addView(hard);
                AlertDialog.Builder builder = new AlertDialog.Builder(HomePageActivity.this).setView(difficulty);
                builder.create().show();
                FlashCardsDifficulty flashCards = new FlashCardsDifficulty();
                easy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.i("HomePage", "difficulty: easy");
                        ArrayList<FlashCard> randomFlashCardsEasy = flashCards.randomFlashCardsEasy();
                        Intent intent = new Intent(HomePageActivity.this, MainActivity.class);
                        intent.putExtra("difficulty", "easy");
                        intent.putExtra("flashCards", randomFlashCardsEasy);
                        intent.putExtra("numeroFlashCard", 0);
                        startActivity(intent);
                    }
                });
                medium.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.i("HomePage", "difficulty: medium" );
                        ArrayList<FlashCard> randomFlashCardsMedium = flashCards.randomFlashCardsMedium();
                        Intent intent = new Intent(HomePageActivity.this, MainActivity.class);
                        Log.i("HomePage", "list: " + randomFlashCardsMedium);
                        intent.putExtra("difficulty", "medium");
                        intent.putExtra("flashCards", randomFlashCardsMedium);
                        intent.putExtra("numeroFlashCard", 0);
                        startActivity(intent);
                    }
                });
                hard.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.i("HomePage", "difficulty: hard");
                        ArrayList<FlashCard> randomFlashCardsHard = flashCards.randomFlashCardsHard();
                        Intent intent = new Intent(HomePageActivity.this, MainActivity.class);
                        intent.putExtra("difficulty", "hard");
                        intent.putExtra("flashCards", randomFlashCardsHard);
                        intent.putExtra("numeroFlashCard", 0);
                        startActivity(intent);
                    }
                });
            }
        });
        Button aboutButton = findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
        Button recyclerButton = findViewById(R.id.recyclerButton);
        recyclerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, FlashcardListActivity.class);
                startActivity(intent);
            }
        });
    }
}