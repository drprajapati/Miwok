package com.example.darshan.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numberTextView = (TextView) findViewById(R.id.numbers_text_view);
        TextView phrasesTextView = (TextView) findViewById(R.id.phrases_text_view);
        TextView familyMembersTextView = (TextView) findViewById(R.id.family_text_view);
        TextView colorsTextView = (TextView) findViewById(R.id.color_text_view);

        numberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(v.getContext(),NumbersActivity.class);
                startActivity(intent);
            }
        });
        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),PhrasesActivity.class);
                startActivity(intent);
            }
        });
        familyMembersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),FamilyMembersActivity.class);
                startActivity(intent);

            }
        });
        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ColorsActivity.class);
                startActivity(intent);

            }
        });
    }
}
