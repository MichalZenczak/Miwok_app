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

    /**
     * This listener gets triggered when the {@link MediaPlayer} has completed playing the audio
     */
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

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

                // Release the mediaPlayer if it currently exists because we are about to
                //play a different sound file.
                releaseMediaPlayer();

                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, phraseWord.getAudioResourceId());
                mMediaPlayer.start();

                // Setup a listener on the media player, so that we can stop and release the
                // mediaPlayer once the sound has finished playing.
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        // When the activity is stopped, release the mediaPlayer resources because we won't be playing
        // any more sounds.
        releaseMediaPlayer();

    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }


}
