package com.team7.flashcard_alchimie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button submit;
    private RadioButton radio_button_lune;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.submitButton);
        radioGroup = findViewById(R.id.radioGroup);
        radio_button_lune = findViewById(R.id.radio_button_lune);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                if (checkedRadioButtonId == View.NO_ID){
                    Toast.makeText(MainActivity.this, "Il faut faire des choix dans la vie", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (checkedRadioButtonId == radio_button_lune.getId()){
                    Toast.makeText(MainActivity.this, "GG à toi mon bro !", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Tu pue la merde ! \nLa bonne réponse c'est " + radio_button_lune.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}