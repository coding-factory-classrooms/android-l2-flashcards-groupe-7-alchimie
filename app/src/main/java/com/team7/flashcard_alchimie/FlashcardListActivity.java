package com.team7.flashcard_alchimie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FlashcardListActivity extends AppCompatActivity {

    private List<FlashCard> flashcard;
    private FlashcardAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashcard_list);

        flashcard = new ArrayList<>();

        ArrayList<String> answersArgent = new ArrayList<>();
        answersArgent.add("terre");
        answersArgent.add("or");
        answersArgent.add("argent");

        for (int i= 0; i< 30; i++){
           flashcard.add(new FlashCard("A quoi correspond ceci en Alchimie ?", R.drawable.lune_argent,answersArgent, "argent"));
        }
        adapter = new FlashcardAdapter(flashcard);

        RecyclerView recyclerView = findViewById(R.id.);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}