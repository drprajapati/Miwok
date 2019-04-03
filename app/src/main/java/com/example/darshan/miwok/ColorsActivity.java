package com.example.darshan.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red","wetetti",R.drawable.color_red));
        words.add(new Word("mustard yellow","chiwiite",R.drawable.color_mustard_yellow));
        words.add(new Word("dusty yellow","topiise",R.drawable.color_dusty_yellow));
        words.add(new Word("green","chocokki",R.drawable.color_green));
        words.add(new Word("brown","takaakki",R.drawable.color_brown));
        words.add(new Word("gray","topoppi",R.drawable.color_gray));
        words.add(new Word("balck","kululli",R.drawable.color_black));
        words.add(new Word("white","kelelli",R.drawable.color_white));
        WordAdapter adapter = new WordAdapter(this,words, R.color.color_colors);
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
