package com.erikarumbold.pract3;

/**
 * Description: Stores the character information input by the user on the Character Creation page
 * Created by erikarumbold on 9/28/16.
 */
public class Character {
    static final String dwarf = "dwarf";
    static final String elf = "elf";
    static final String half_orc = "Half-Orc";
    static final String human = "Human";
    static final String ranger = "Ranger";
    static final String fighter = "Fighter";
    static final String bard = "Bard";
    static final String wizard = "Wizard";

    private String mName;
    private String mRace;
    private String mClass;
    private boolean mStrength;
    private boolean mDexterity;
    private boolean mConstitution;
    private boolean mIntelligence;
    private boolean mWisdom;
    private boolean mCharisma;
    private int mAge;

    public Character(String name, String race, String cla, boolean str, boolean dex, boolean con, boolean intel, boolean wis, boolean cha, int age){
        this.mName = name;
        this.mRace = race;
        this.mClass = cla;
        this.mStrength = str;
        this.mDexterity = dex;
        this.mConstitution = con;
        this.mIntelligence = intel;
        this.mWisdom = wis;
        this.mCharisma = cha;
        this.mAge = age;
    }

    public Character(){}

    // setters
    public void setName(String nName){mName=nName;}
    public void setRace(String nRace){mRace=nRace;}
    public void setClass(String nClass){mClass=nClass;}
    public void setStrength(boolean nStrength){mStrength=nStrength;}
    public void setDexterity(boolean nDexterity){mDexterity=nDexterity;}
    public void setConstitution(boolean nConstitution){mConstitution=nConstitution;}
    public void setIntelligence(boolean nIntelligence){mIntelligence=nIntelligence;}
    public void setWisdom(boolean nWisdom){mWisdom=nWisdom;}
    public void setCharisma(boolean nCharisma){mCharisma=nCharisma;}
    public void setAge(int nAge){mAge=nAge;}

    // getters
    // return checkbox options as strings if checked
    public String getName(){return mName;}
    public String getRace(){return mRace;}
    public String getmClass(){return mClass;}
    public int getAge(){return mAge;}
    public String getStr(){
        if (mStrength){
            return "Strength";
        } else {
            return "";
        }
    }
    public String getDex(){
        if (mDexterity){
            return "Dexterity";
        } else {
            return "";
        }
    }
    public String getCon(){
        if (mConstitution){
            return "Constitution";
        } else {
            return "";
        }
    }
    public String getInt(){
        if (mIntelligence){
            return "Intelligence";
        } else {
            return "";
        }
    }
    public String getWis(){
        if (mWisdom){
            return "Wisdom";
        } else {
            return "";
        }
    }
    public String getCha(){
        if (mCharisma){
            return "Charisma";
        } else {
            return "";
        }
    }
}
