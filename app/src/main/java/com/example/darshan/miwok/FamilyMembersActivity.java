package com.example.darshan.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Father","ete",R.drawable.family_father));
        words.add(new Word("Mother","eta",R.drawable.family_mother));
        words.add(new Word("Son","angsi",R.drawable.family_son));
        words.add(new Word("Daughter","tune",R.drawable.family_daughter));
        words.add(new Word("Older brother","tacchi",R.drawable.family_older_brother));
        words.add(new Word("Younger brother","chalitti",R.drawable.family_younger_brother));
        words.add(new Word("Older sister","tete",R.drawable.family_older_sister));
        words.add(new Word("Younger sister","kollitti",R.drawable.family_younger_sister));
        words.add(new Word("Grandmother","ama",R.drawable.family_grandmother));
        words.add(new Word("Grandfather","pappa",R.drawable.family_grandfather));
        WordAdapter adapter = new WordAdapter(this,words,R.color.color_family_members);
        ListView listNumbers = (ListView) findViewById(R.id.listView);
        listNumbers.setAdapter(adapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return false;
    }
}
