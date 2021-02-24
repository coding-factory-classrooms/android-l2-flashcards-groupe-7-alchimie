package com.team7.flashcard_alchimie;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static android.view.LayoutInflater.*;
import static androidx.appcompat.app.AlertDialog.*;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> answerss = new ArrayList<>();
        answerss.add("terre");
        answerss.add("or");
        answerss.add("argent");
        Collections.shuffle(answerss);
        FlashCard flashCard = new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.pierre_philosophale_, answerss, "argent");
        TextView question = findViewById(R.id.questionTextView);
        ImageView imageView = findViewById(R.id.imageView);
        question.setText(flashCard.question);
        imageView.setImageResource(flashCard.image);

        submit = findViewById(R.id.submitButton);
        radioGroup = findViewById(R.id.radioGroup);
        //answers = new ArrayList<>(Arrays.asList("air", "arsenic", "cuivre", "venus", "eau", "etain", "jupiter", "fer", "mars", "feu", "lune", "argent", "mercure", "or", "soleil", "pierre philosophale", "plomb", "sature", "salpetre", "soufre", "terre", "vitrol"));

        /*randomAnswers = new ArrayList<>();
        while (randomAnswers.size() < 3){
            randomInt = (int)(Math.random() * ((answers.size()) + 1));
            randomAnswers.add(answers.get(randomInt));
        }*/

        RadioButton goodRadioButton = null;
        for (int i = 0; i < flashCard.answers.size(); i++) {
            RadioButton myButton = new RadioButton(MainActivity.this);
            myButton.setText(flashCard.answers.get(i));
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
                }
                if (checkedRadioButtonId == finalGoodRadioButton.getId()){
                    Toast.makeText(MainActivity.this, "GG à toi mon bro !", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Tu pue la merde ! \nLa bonne réponse c'est " + finalGoodRadioButton.getText(), Toast.LENGTH_SHORT).show();
                }
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
}