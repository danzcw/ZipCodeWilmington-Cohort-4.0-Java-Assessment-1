package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {

        Integer sum = 0;

        for (int x = 1; x <= n; x++) {
                sum = sum + x;
        }

        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer product = 1;


        for (int x = 1; x < n; x++) {
            product = product * x;
        }


        return product;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String number = Integer.toString(val);
        String reverse = "";

        for(int i = number.length() -1; i >= 0; i--) {
            reverse += number.charAt(i);
        }
        return Integer.parseInt(reverse);



    }
}
