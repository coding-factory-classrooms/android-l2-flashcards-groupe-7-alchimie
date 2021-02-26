package com.team7.flashcard_alchimie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView scoreView = findViewById(R.id.scoreTextView);
        TextView difficultyView = findViewById(R.id.difficultyTextView);
        TextView pourcentageView = findViewById(R.id.pourcentTextView);

        Intent srcIntent = getIntent();
        String score = srcIntent.getStringExtra("score");
        String difficulty = srcIntent.getStringExtra("difficulty");
        String pourcent = srcIntent.getStringExtra("pourcent");

        Button menu = findViewById(R.id.homeButton);

        scoreView.setText(score);
        difficultyView.setText(difficulty);
        pourcentageView.setText(pourcent);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, HomePageActivity.class);
                startActivity(intent);
            }
        });
    }
}