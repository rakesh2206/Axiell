package com.axill;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedText {
    public static void  main(String args[]) {
        String string = "AxiellTTTTest";
        char[] chars = string.toCharArray();
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (Character ch: chars){
                if(charMap.containsKey(ch)) {
                    charMap.put(ch, charMap.get(ch) + 1); //increase number of occuarnces
                } else {
                    charMap.put(ch, 1);
                }
        }
        for(Character ch:charMap.keySet()){
            if(charMap.get(ch) > 1){
                System.out.println("Char "+ch+" : "+charMap.get(ch));
            }
        }

    }
}
