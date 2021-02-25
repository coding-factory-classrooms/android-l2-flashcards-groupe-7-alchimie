package com.team7.flashcard_alchimie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Intent srcIntent = getIntent();

        String versionName = BuildConfig.VERSION_NAME;
        TextView versionTextView = findViewById(R.id.versiontextView);
        versionTextView.setText(versionName);

    }
}