package com.team7.flashcard_alchimie;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class FlashCard implements Parcelable {
    String question;
    int image;
    ArrayList<String> answers;
    String goodAnswer;

    public FlashCard(String question, int image, ArrayList<String> answers, String goodAnswer) {
        this.question = question;
        this.image = image;
        this.answers = answers;
        this.goodAnswer = goodAnswer;
    }

    protected FlashCard(Parcel in) {
        question = in.readString();
        image = in.readInt();
        answers = in.createStringArrayList();
        goodAnswer = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(question);
        dest.writeInt(image);
        dest.writeStringList(answers);
        dest.writeString(goodAnswer);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<FlashCard> CREATOR = new Creator<FlashCard>() {
        @Override
        public FlashCard createFromParcel(Parcel in) {
            return new FlashCard(in);
        }

        @Override
        public FlashCard[] newArray(int size) {
            return new FlashCard[size];
        }
    };
}
