package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        int total = 0;

        for (int x = 0; x < objectArray.length; x++) {
            if (objectArray[x].equals(objectToCount)) {
                total++;
            }
        }


        return total;
    }




    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Integer[] objectArray, Integer objectToRemove) {
        int total = 0;
        int remove = 0;

        for (int x = 0; x < objectArray.length; x++) {
            if (objectArray[x].equals(objectToRemove)) {
                total++;
            }
        }
        Integer[] newArray = new Integer[objectArray.length - total];

        for (int y = 0; y < objectArray.length; y++) {
            if(!objectToRemove.equals(objectArray[y])) {
                newArray[remove] = objectArray[y];
                remove++;
            }
        }

        return newArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Integer[] objectArray) {
        int count = 1, tempCount;
        int popular = objectArray[0];
        int hold = 0;
        for (int i = 0; i < (objectArray.length - 1); i++) {
            hold = objectArray[i];
            tempCount = 0;
            for (int x = 1; x < objectArray.length; x++) {
                if (hold == objectArray[x])
                    tempCount++;
            }  if (tempCount > count) {
                popular = hold;
                count = tempCount;
            }
        }
        return popular;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Integer[] objectArray) {
        int count = 4, tempCount;
        int popular = objectArray[0];
        int hold = 0;
        for (int i = 0; i < (objectArray.length - 1); i++) {
            hold = objectArray[i];
            tempCount = 0;
            for (int x = 0; x < objectArray.length; x++) {
                if (hold == objectArray[x])
                    tempCount++;
            }  if (tempCount < count) {
                popular = hold;
                count = tempCount;
            }
        }
        return popular;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) {
        Integer[] combined = new Integer[objectArray.length + objectArrayToAdd.length];

            System.arraycopy(objectArray, 0, combined, 0, objectArray.length);
            System.arraycopy(objectArrayToAdd, 0, combined, objectArray.length, objectArrayToAdd.length);

        return combined;
    }
}
