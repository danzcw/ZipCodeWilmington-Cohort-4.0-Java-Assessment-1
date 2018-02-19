package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String toCap = str.substring(0, 1).toUpperCase() + str.substring(1);

        return toCap;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String flip = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            flip += str.charAt(i);
        }

        return flip;
    }


    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String flip = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            flip += str.charAt(i);
        }
        String reverseToCap = flip.substring(0, 1).toUpperCase() + flip.substring(1);

        return reverseToCap;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String firstAndLast = str.substring(1, str.length() - 1);

        return firstAndLast;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] letters = str.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            char x = letters[i];
            if (Character.isUpperCase(x)) {
                letters[i] = Character.toLowerCase(x);
            } else if (Character.isLowerCase(x)) {
                letters[i] = Character.toUpperCase(x);
            }
        }
        return new String(letters);
    }
}