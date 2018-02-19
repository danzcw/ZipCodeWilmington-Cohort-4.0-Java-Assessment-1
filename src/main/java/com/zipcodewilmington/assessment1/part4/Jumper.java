package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

        int bigJumps = Math.round(k/j);
        int littJumps = (k % j);

        int total = bigJumps +littJumps;



        return total;
    }
}
