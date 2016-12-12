package com.erikarumbold.pract3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Description: Displays information about the purpose of the app. Button allows user to return
 *      to character creation page.
 * Created by erikarumbold on 10/19/16.
 */

public class AboutActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void goCreate(View view){
        finish();
    }
}
