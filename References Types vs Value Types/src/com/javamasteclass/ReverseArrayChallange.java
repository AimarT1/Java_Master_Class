package com.javamasteclass;

import java.util.Arrays;

public class ReverseArrayChallange {

    public static void main(String[] args) {
        //Creating an array with given values
        int[] array = {2,7,9,23,69};
        //have to inizialize inbuilt method "Arrays.toString()" to print the input out as an array.
        System.out.println("My array: " + Arrays.toString(array));
        //calling the reverse method first and pass it the variable array
        reverse(array);
        System.out.println("My reversed array: " + Arrays.toString(array));
    }

    private static void reverse(int[] array){

        // loon arrray muutuja "reversedArray" mis võtab endale algse sisisetatud array väärtuse.
        int[] reversedArray = array.clone();
        //System.out.println(Arrays.toString(reversedArray));//for testing
        //vÕiks ka olla "for (int i = 0; i < reversedArray.length; i++)"
        for (int i = 0; i < array.length; i++){
           //System.out.println(Arrays.toString(array));//for testing
            //"-1"lahutab viimasel kohal oleva elemendi ja paneb lahutatud elemendid reverse arraysse, kuniks elementide arva saab täis.
            //"-i"  ehk ligu a element edasi järgmisele kohale.(kasutab i väärtust mis kasvab kuniks pole väiksem "array.length" elementide arvust , tänu sellele liigub järjest kohavõrra edasi.)
           array[i] = reversedArray[array.length -1 -i];
           //System.out.println(i);//for testing
           System.out.println(array[i]);//for testing

        }
    }
}
//.. should throw out of bounc exeption
//  for (int i = 0; i < array.length; i++){
//                array[i] = array.length -i;
//           }
