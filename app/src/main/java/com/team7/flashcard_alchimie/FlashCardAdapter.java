package com.team7.flashcard_alchimie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FlashCardAdapter extends RecyclerView.Adapter<FlashCardAdapter.ViewHolder> {

    private List<FlashCard> flashcard;

    public FlashCardAdapter(List<FlashCard> flashcard) {
        this.flashcard = flashcard;
    }






    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_main, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        FlashCard flashCard = flashcard.get(position);
        holder.symbol.setImageResource(flashCard.getImage());
        holder.question.setText(flashCard.getQuestion());
        holder.answer.setText(flashCard.getAnswers() + "");


    }

    @Override
    public int getItemCount() {
        return flashcard.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        final ImageView symbol;
        final TextView question;
        final TextView answer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            symbol = itemView.findViewById(R.id.imageView);
            question = itemView.findViewById(R.id.questionTextView);
            answer = itemView.findViewById(R.id.radioGroup);
        }
    }
}
