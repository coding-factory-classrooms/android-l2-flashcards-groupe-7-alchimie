package com.team7.flashcard_alchimie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FlashCardAdapter extends RecyclerView.Adapter<FlashCardAdapter.ViewHolder> {

    private ArrayList<FlashCard> flashCards;

    public FlashCardAdapter(ArrayList<FlashCard> flashcard) {
        this.flashCards = flashcard;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_flashcard, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FlashCard flashCard = flashCards.get(position);
        holder.symbol.setImageResource(flashCard.getImage());
        holder.answers.setText(flashCard.getAnswers().toString());
    }

    @Override
    public int getItemCount() {
        return flashCards.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        final ImageView symbol;
        final TextView answers;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            symbol = itemView.findViewById(R.id.symbolImageView);
            answers = itemView.findViewById(R.id.answersTextView);
        }
    }
}
