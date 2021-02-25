package com.team7.flashcard_alchimie;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button submit;
    private TextView question;
    private ImageView imageView;
    private int numeroFlashCard = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question = findViewById(R.id.questionTextView);
        imageView = findViewById(R.id.imageView);
        submit = findViewById(R.id.submitButton);
        radioGroup = findViewById(R.id.radioGroup);

        FlashCards flashCards = new FlashCards();
        ArrayList<FlashCard> listRandomFlashCards = flashCards.randomFlashCards();
        ArrayList<FlashCard> flashCardArrayList = listRandomFlashCards;

        Intent srcIntent = getIntent();
        int numFlashCard = srcIntent.getIntExtra("numFlashCard", 0);
        FlashCard flashCard = flashCardArrayList.get(numFlashCard);
        imageView.setImageResource(flashCard.image);

        if (flashCard == null){
            Log.e("randomFlashCard", "C'est la merde...");
        }

        RadioButton goodRadioButton = null;
        for (int j = 0; j < flashCard.answers.size(); j++) {
            RadioButton myButton = new RadioButton(MainActivity.this);
            myButton.setText(flashCard.answers.get(j));
            if (myButton.getText()==flashCard.goodAnswer){
                goodRadioButton = myButton;
            }
            ConstraintLayout.LayoutParams constraintLayout = new ConstraintLayout.LayoutParams(RadioGroup.LayoutParams.MATCH_PARENT, RadioGroup.LayoutParams.WRAP_CONTENT);
            float scale = getResources().getDisplayMetrics().density;
            constraintLayout.setMargins(0, (int) ((30 - 0.5f)/scale),0,0);
            myButton.setLayoutParams(constraintLayout);
            radioGroup.addView(myButton);
        }

        RadioButton finalGoodRadioButton = goodRadioButton;
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                if (checkedRadioButtonId == View.NO_ID){
                    Toast.makeText(MainActivity.this, "Il faut faire des choix dans la vie", Toast.LENGTH_SHORT).show();
                    return;
                } else if (checkedRadioButtonId == finalGoodRadioButton.getId()){
                    Toast.makeText(MainActivity.this, "GG à toi mon bro !", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Tu pue la merde ! \nLa bonne réponse c'est " + finalGoodRadioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                submit.setText("question suivante");
                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Next();
                    }
                });
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = new ImageView(MainActivity.this);
                image.setImageResource(flashCard.image);
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this).setView(image);
                builder.create().show();
            }
        });
    }

    void Next(){
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        numeroFlashCard = numeroFlashCard+1;
        intent.putExtra(String.valueOf(numeroFlashCard), numeroFlashCard);
        startActivity(intent);
    }
}