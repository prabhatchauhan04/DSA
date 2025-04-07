package Basics;

import java.util.Random;

// 10 numbers generate krne hai si to ei ki range k andar 

public class RandomNumberGenerate {
    public static void main(String[] args) {
        int si = 10;
        int ei = 100;

        Random rn = new Random();

        for (int i = 0 ; i < 10 ; i++) {
            int item = rn.nextInt(ei - si + 1) + 10;
            System.out.print(item + " ");
        }
    }
}
