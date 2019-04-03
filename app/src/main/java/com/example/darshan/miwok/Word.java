package com.example.darshan.miwok;

public class Word {
    //Declares two string variabels
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final  int NO_IMAGE_PROVIDED=-1;

    //Parameterized Constructor assings the private members of word class
    public Word(String defaultTranslation,String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId ){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }
    //method to getDefaultTranslation
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    //method to getMiwokTranslation
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }

}
