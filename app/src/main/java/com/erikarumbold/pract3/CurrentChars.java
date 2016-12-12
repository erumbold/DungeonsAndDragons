package com.erikarumbold.pract3;

import java.util.ArrayList;

/**
 * Created by erikarumbold on 10/13/16.
 */

public class CurrentChars {
    private static ArrayList<Character> currentChars = new ArrayList<>();
    private static int current = 0;

    public static Character getNextChar(){
        if (currentChars.size() == 0){
            return null;
        } else {
            if (current == currentChars.size()){
                current = 0;
            }
            Character c = currentChars.get(current);
            current++;
            return c;
        }
    }

    public static void add(Character c){currentChars.add(c);}

    public static int getCurrentSize(){return currentChars.size();}
}
