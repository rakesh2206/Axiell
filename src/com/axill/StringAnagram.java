package com.axill;

import java.util.Arrays;
import java.util.Locale;

/* the java program to check a string is a Anagram or not */

public class StringAnagram {

    public static void  main(String args[]) {
        String str1 = "Army";
        String str2 = "Mary";

        if(isAnagram(str1, str2)) {
            System.out.println("String is Anagram with string value as " + str1 + "  and  " + str2);
        }
    }

    private static boolean isAnagram(String pStr, String pStr2){

        if(pStr.length() != pStr2.length()){
            return false;
        } else {
            char[] charArrays1 = pStr.toLowerCase().toCharArray();
            char[] charArrays2 = pStr2.toLowerCase().toCharArray();
            Arrays.sort(charArrays1);
            Arrays.sort(charArrays2);
            return Arrays.equals(charArrays1,charArrays2 );
        }
    }
}
