package com.team7.flashcard_alchimie;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button submit;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        imageView = findViewById(R.id.imageView);
        submit = findViewById(R.id.submitButton);

        Intent srcIntent = getIntent();
        ArrayList<FlashCard> flashCards = srcIntent.getParcelableArrayListExtra("flashCards");
        int numFlashCard = srcIntent.getIntExtra("numeroFlashCard", 0);

        FlashCard flashCard = flashCards.get(numFlashCard);
        imageView.setImageResource(flashCard.image);

        RadioButton goodRadioButton = null;
        for (int j = 0; j < flashCard.answers.size(); j++) {
            RadioButton myButton = new RadioButton(MainActivity.this);
            myButton.setText(flashCard.answers.get(j));
            if (myButton.getText().equals(flashCard.goodAnswer)){
                goodRadioButton = myButton;
            }
            ConstraintLayout.LayoutParams constraintLayout = new ConstraintLayout.LayoutParams(RadioGroup.LayoutParams.MATCH_PARENT, RadioGroup.LayoutParams.WRAP_CONTENT);
            float scale = getResources().getDisplayMetrics().density;
            constraintLayout.setMargins(0, (int) ((30 - 0.5f)/scale),0,0);
            myButton.setLayoutParams(constraintLayout);
            radioGroup.addView(myButton);
        }

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = new ImageView(MainActivity.this);
                image.setImageResource(flashCard.image);
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this).setView(image);
                builder.create().show();
            }
        });

        numFlashCard++;
        if(goodRadioButton==null){
            Log.e("MainActivity", "Problème ! null");
        }
        RadioButton finalGoodRadioButton = goodRadioButton;
        int finalNumFlashCard = numFlashCard;
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                if (checkedRadioButtonId == View.NO_ID){
                    Toast.makeText(MainActivity.this, "il faut choisir un réponse.", Toast.LENGTH_SHORT).show();
                    return;
                } else if (checkedRadioButtonId == finalGoodRadioButton.getId()){
                    Toast.makeText(MainActivity.this, "Bravo, c'est la bonne réponse.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Ce n'est pas la bonne réponse essaye encore.\nLa bonne réponse était : " + finalGoodRadioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                submit.setText("question suivante");
                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        intent.putExtra("flashCards", flashCards);
                        intent.putExtra("numeroFlashCard", finalNumFlashCard);
                        startActivity(intent);
                    }
                });
            }
        });
    }
}