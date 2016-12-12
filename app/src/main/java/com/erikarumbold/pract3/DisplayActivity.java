package com.erikarumbold.pract3;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Description: Displays the user-input character information. Button allows user to return to
 *      character creation page.
 * Created by erikarumbold on 10/19/16.
 */

public class DisplayActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }

        setContentView(R.layout.fragment_results);

        TextView charInfo = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();

        String information = intent.getStringExtra("info");
        charInfo.setText(information);
    }

    public void goCreate(View view){
        finish();
    }
}
