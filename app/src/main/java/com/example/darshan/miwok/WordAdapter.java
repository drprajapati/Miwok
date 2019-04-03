package com.example.darshan.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.darshan.miwok.R.*;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;
    public WordAdapter(Context context, int resource, ArrayList<Word> words) {
        super(context, resource);
    }

    public WordAdapter(Activity context, ArrayList<Word> word,int color) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0 , word);
        mColorResourceId = color;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    layout.item_list, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView defaultNameTextView = (TextView) listItemView.findViewById(id.default_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        defaultNameTextView.setText(currentWord.getDefaultTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView miwokNameTextView = (TextView) listItemView.findViewById(id.miwok_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        miwokNameTextView.setText(currentWord.getMiwokTranslation());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        ImageView miwokImages = (ImageView) listItemView.findViewById(id.image_view);
        /**
         * Check wheather the image in phrase activity should be displayed or not
         */

        if (currentWord.hasImage()) {
            miwokImages.setImageResource(currentWord.getImageResourceId());
            miwokImages.setVisibility(View.VISIBLE);
        }
        else{

            miwokImages.setVisibility(View.GONE);
        }
        /**
        *Background Color images for each layout
        */
        View textContainer = listItemView.findViewById(id.container);
        int color =ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
