package com.javamasteclass;

import java.util.ArrayList;
class IntClass {
    private int my_value;

    public IntClass(int my_value) {
        this.my_value = my_value;
    }

    public int getMy_value() {
        return my_value;
    }

    public void setMy_value(int my_value) {
        this.my_value = my_value;
    }
}
public class Main {

    public static void main(String[] args) {
	String[] stringArray = new String[10];
	int[] intArray = new int[10];

	//you cant create an int type array list. as ArrayList<Int>. Int is premitive type.
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Jay");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.22);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
       /* for (int i = 0; i < 10; i++){
            intArrayList.add(Integer.valueOf(i));
        }
        for (int i = 0; i < 10; i++){
            System.out.println(i + " -> " + intArrayList.get(i).intValue());
        }
*/
        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue.intValue(); //myInt.intValue();
        //autoboxing
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl+=0.5){
            myDoubleValues.add(dbl);
        }
        //unboxing
        for (int i = 0; i < myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i);
            System.out.println(i + " -> " + value);
        }
    }
}
