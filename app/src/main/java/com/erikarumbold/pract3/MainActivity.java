/*****************************************************************************************
 * File: MainActivity.java
 * Author: Erika Rumbold
 *
 * Last Modified: November 2, 2016
 *
 * Description: A mobile representation of a Dungeons and Dragons character sheet
 *
 * Assignment: Create a survey app that takes information using various widgets, two
 *             fragments, and is has different layouts for landscape and portrait
 *             orientations
 ****************************************************************************************/

package com.erikarumbold.pract3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements SurveyFragment.OnSubmitListener {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Launches "About Page" activity
     * @param
     */
    @Override
    public void activateAbout(){
        Intent launchAbout = new Intent(this, AboutActivity.class);

        startActivity(launchAbout);
    }

    /**
     * Launches activity that displays the survey results
     * @param charInfo
     */
    @Override
    public void onSubmit(String charInfo){
        DisplayFragment fragment = (DisplayFragment) getFragmentManager().findFragmentById(R.id.fragment2);

        if (fragment != null && fragment.isInLayout()){
            fragment.setText(charInfo);
        } else {
            Intent launchDisplay = new Intent(this, DisplayActivity.class);

            launchDisplay.putExtra("info", charInfo);

            startActivity(launchDisplay);
        }
    }
}
