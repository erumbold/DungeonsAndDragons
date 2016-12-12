package com.erikarumbold.pract3;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;

/**
 * Created by erikarumbold on 11/1/16.
 */

public class SurveyFragment extends Fragment {

    private EditText nameET;
    private RadioGroup raceRG;
    private RadioGroup classRG;
    private CheckBox strengthCB;
    private CheckBox dexterityCB;
    private CheckBox constitutionCB;
    private CheckBox intelligenceCB;
    private CheckBox wisdomCB;
    private CheckBox charismaCB;
    private SeekBar ageSBR;
    private Button submitBtn;
    private Button aboutBtn;

    private Character chara;

    /**
     * Description: This function is called when the app is launched, displaying the fragment in
     * the main activity and calling the function to initialize all relevant pointers and listeners.
     *
     * @param savedInstanceState Output: none
     */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_survey, container, false);

        chara = new Character();

        nameET = (EditText) view.findViewById(R.id.name);
        raceRG = (RadioGroup) view.findViewById(R.id.raceGroup);
        classRG = (RadioGroup) view.findViewById(R.id.classGroup);
        strengthCB = (CheckBox) view.findViewById(R.id.strength);
        dexterityCB = (CheckBox) view.findViewById(R.id.dexterity);
        constitutionCB = (CheckBox) view.findViewById(R.id.constitution);
        intelligenceCB = (CheckBox) view.findViewById(R.id.intelligence);
        wisdomCB = (CheckBox) view.findViewById(R.id.wisdom);
        charismaCB = (CheckBox) view.findViewById(R.id.charisma);
        ageSBR = (SeekBar) view.findViewById(R.id.ageBar);
        submitBtn = (Button) view.findViewById(R.id.button);
        aboutBtn = (Button) view.findViewById(R.id.abt);

        nameET.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                chara.setName(nameET.getText().toString());
    ;

        raceRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedID) {
                switch (checkedID) {
                    case R.id.dwarf:
                        chara.setRace(Character.dwarf);
                        break;
                    case R.id.elf:
                        chara.setRace(Character.elf);
                        break;
                    case R.id.half_orc:
                        chara.setRace(Character.half_orc);
                        break;
                    case R.id.human:
                        chara.setRace(Character.human);
                        break;
                }
            }
        });

        classRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedID) {
                switch (checkedID) {
                    case R.id.ranger:
                        chara.setClass(Character.ranger);
                        break;
                    case R.id.fighter:
                        chara.setClass(Character.fighter);
                        break;
                    case R.id.bard:
                        chara.setClass(Character.bard);
                        break;
                    case R.id.wizard:
                        chara.setClass(Character.wizard);
                        break;
                }
            }
        });

        strengthCB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                chara.setStrength(isChecked);
            }
        });
        dexterityCB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                chara.setDexterity(isChecked);
            }
        });
        constitutionCB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                chara.setConstitution(isChecked);
            }
        });
        intelligenceCB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                chara.setIntelligence(isChecked);
            }
        });
        wisdomCB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                chara.setWisdom(isChecked);
            }
        });
        charismaCB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                chara.setCharisma(isChecked);
            }
        });
        ageSBR.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                chara.setAge(seekBar.getProgress() + 10);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity) getActivity();
                activity.activateAbout();
            }
        });
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String charInfo = createCharacter();
                MainActivity activity = (MainActivity) getActivity();
                activity.onSubmit(charInfo);
            }
        });

        return view;
    }

    public interface OnSubmitListener{
        public void activateAbout();
        public void onSubmit(String charInfo);
    }

    /**
     * Creates string of user input character information to be passed to the DisplayActivity
     * @return charInfo
     */
    public String createCharacter(){
        chara.setName(nameET.getText().toString());
        String charInfo = "Name: " + chara.getName() + "\n";
        charInfo += "Race: " + chara.getRace() + "\n";
        charInfo += "Class: " + chara.getmClass() + "\n";
        charInfo += "Age: " + chara.getAge() + "\n";
        charInfo += "Possesses: "+ "\n";
        if (!chara.getStr().equals("")){charInfo += chara.getStr() + "\n";}
        if (!chara.getDex().equals("")){charInfo += chara.getDex() + "\n";}
        if (!chara.getCon().equals("")){charInfo += chara.getCon() + "\n";}
        if (!chara.getInt().equals("")){charInfo += chara.getInt() + "\n";}
        if (!chara.getWis().equals("")){charInfo += chara.getWis() + "\n";}
        if (!chara.getCha().equals("")){charInfo += chara.getCha();}

        return charInfo;
    }
}
