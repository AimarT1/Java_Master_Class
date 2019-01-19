package com.javamasteclass;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        reversArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reversArray(int[] array){
        int[] reversedArray = array;
        for (int i = 0; i < array.length; i++){
            reversedArray[i] = array.length -i;
        }

    }
}
