package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> familyWords = new ArrayList<Word>();
        familyWords.add(new Word("father","әpә"));
        familyWords.add(new Word("mother", "әṭa"));
        familyWords.add(new Word("son","angsi"));
        familyWords.add(new Word("daughter","tune"));
        familyWords.add(new Word("older brother","taachi"));
        familyWords.add(new Word("younger brother", "chalitti"));
        familyWords.add(new Word("older sister","teṭe"));
        familyWords.add(new Word("younger sister", "kolliti"));
        familyWords.add(new Word("grandmother","ama"));
        familyWords.add(new Word("grandfather", "paapa"));

        WordAdapter familyAdapter = new WordAdapter(this, familyWords);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(familyAdapter);
    }
}
