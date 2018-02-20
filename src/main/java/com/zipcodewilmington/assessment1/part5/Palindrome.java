package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

        Integer count = 0;
        for (int i = 1; i <= input.length(); i++) {
            for (int j = i - 1, k = i; j >= 0 && k < input.length(); j--, k++) {
                if (input.charAt(j) == input.charAt(k)) {
                    count++;


                }
            }
        }
        return count;


    }
}
