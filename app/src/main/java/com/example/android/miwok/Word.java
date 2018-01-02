package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation ;

    /**Miwok translation for the word */
    private String mMiwokTranslation;

    /**
     * Constructor
     * Create a new Word object.
     *
     * @param DefaultTranslation is the word for a language that the user is familiar with
     *                           (such as english).
     * @param MiwokTranlation is the word for miwok language.
     */


    public Word(String DefaultTranslation, String MiwokTranlation){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranlation;
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

}
