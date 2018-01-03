package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> phrasesWords = new ArrayList<Word>();
        phrasesWords.add(new Word("Where are you going?","minto wuksus?"));
        phrasesWords.add(new Word("What is your name?", "tinnә oyaase'nә?"));
        phrasesWords.add(new Word("My name is...","oyaaset..."));
        phrasesWords.add(new Word("How are you feeling?","michәksәs?"));
        phrasesWords.add(new Word("I’m feeling good.","kuchi achit"));
        phrasesWords.add(new Word("Are you coming?", "әәnәs'aa?"));
        phrasesWords.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        phrasesWords.add(new Word("I’m coming.", "әәnәm"));
        phrasesWords.add(new Word("Let’s go.","yoowutis"));
        phrasesWords.add(new Word("Come here.", "әnni'nem"));

        WordAdapter phrasesAdapter = new WordAdapter(this, phrasesWords);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(phrasesAdapter);
    }
}
