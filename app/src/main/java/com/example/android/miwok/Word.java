package com.example.android.miwok;

import java.lang.reflect.Constructor;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation ;

    /**Miwok translation for the word */
    private String mMiwokTranslation;

    /**An image to help visualize the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Constructor
     * Create a new Word object.
     *
     * @param DefaultTranslation is the word for a language that the user is familiar with
     *                           (such as english).
     * @param MiwokTranlation is the word for miwok language.
     *
     * @param audioResourceId the audio resource ID.
     */
    public Word(String DefaultTranslation, String MiwokTranlation, int audioResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranlation;
        mAudioResourceId = audioResourceId;
    }
    /**
     * Constructor
     * Create a new Word object.
     *
     * @param DefaultTranslation is the word for a language that the user is familiar with
     *                           (such as english).
     * @param MiwokTranlation is the word for miwok language.
     *
     * @param imageResourceId the image resource ID
     *
     * @param audioResourceId the audio resource ID.
     */

    public Word(String DefaultTranslation, String MiwokTranlation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranlation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
    /**
     * Get the default translation for the word.
     * */
    public String getDefaulTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation for the word.
     * */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    /**
     * Get the image resource ID.
     * */
    public int getImageResourceId() {return mImageResourceId;}

    /**
     * Get the audio resource ID.
     * */
    public int getAudioResourceId() {return mAudioResourceId;}

    /**
     * Returns whether or not there is an image for this word
     * */
    public boolean hasImage(){return mImageResourceId != NO_IMAGE_PROVIDED;}

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
