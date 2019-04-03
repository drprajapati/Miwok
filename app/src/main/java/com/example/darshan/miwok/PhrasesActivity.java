package com.example.darshan.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Father","ete"));
        words.add(new Word("Mother","eta"));
        words.add(new Word("Son","angsi"));
        words.add(new Word("Daughter","tune"));
        words.add(new Word("Older brother","tacchi"));
        words.add(new Word("Younger brother","chalitti"));
        words.add(new Word("Older sister","tete"));
        words.add(new Word("Younger sister","kollitti"));
        words.add(new Word("Grandmother","ama"));
        words.add(new Word("Grandfather","pappa"));
        WordAdapter adapter = new WordAdapter(this,words, R.color.color_Phrases);
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
