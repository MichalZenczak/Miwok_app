package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> phrasesWords = new ArrayList<Word>();
        phrasesWords.add(new Word("Where are you going?","minto wuksus?", R.raw.phrase_where_are_you_going));
        phrasesWords.add(new Word("What is your name?", "tinnә oyaase'nә?", R.raw.phrase_what_is_your_name));
        phrasesWords.add(new Word("My name is...","oyaaset...", R.raw.phrase_my_name_is));
        phrasesWords.add(new Word("How are you feeling?","michәksәs?", R.raw.phrase_how_are_you_feeling));
        phrasesWords.add(new Word("I’m feeling good.","kuchi achit", R.raw.phrase_im_feeling_good));
        phrasesWords.add(new Word("Are you coming?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        phrasesWords.add(new Word("Yes, I’m coming.","hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        phrasesWords.add(new Word("I’m coming.", "әәnәm", R.raw.phrase_im_coming));
        phrasesWords.add(new Word("Let’s go.","yoowutis", R.raw.phrase_lets_go));
        phrasesWords.add(new Word("Come here.", "әnni'nem", R.raw.phrase_come_here));

        final WordAdapter phrasesAdapter = new WordAdapter(this, phrasesWords, R.color.category_phrases);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(phrasesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word phraseWord = phrasesWords.get(position);

                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, phraseWord.getAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
}
