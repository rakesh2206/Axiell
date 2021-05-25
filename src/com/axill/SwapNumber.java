package com.axill;

public class SwapNumber {

    public static void  main(String args[]) {
        int I = 20;
        int J = 34;

        I = (I+J);
        J = I-J;
        I = I-J;
        System.out.println("Value of I :" + I);
        System.out.println("Value of I :" + J);
    }
}
