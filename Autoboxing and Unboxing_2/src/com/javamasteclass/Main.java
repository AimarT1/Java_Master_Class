package com.javamasteclass;

import java.util.ArrayList;
//we created a wraper - we said int myValue is the variable that going to contain the value for this class,
//we wraped up class, we made sure the variable is not publicly available, you can use constuctor to update the value.
class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }
}
public class Main {

    public static void main(String[] args) {
        //created 2 regular array of type string and int.
        String[] stringArray = new String[10];
        int[] intArray = new int[10];

        //creating a string arraylist-
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("John");

        //creating a Intger arraylist. Extends Integer Class. simple int is primitive data type.
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(12);

        //Array list with creating a separate class for it to pass an object.
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54)); //adds an object of type int class, we give its filed/parameter a value.

       //Autoboxing  Integer is a class.
        //Acessing the integer and Double classis creating them the variables: doubleValue, inger
        // and create a new instance of that class to pass a valu to that variable.
        Integer integer = new Integer(54);
        Double doubleValue  = new Double(12.25);

        ArrayList<Integer> integerArrayListNew = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++ ){
            //Integer is the type arraylist for this variable. .valueOf - is taking the value of i as primitive type and converts it,
            //automaticli into the integer class, we can use it as a class.
            //Autoboxing . (Integer.valueOf(i)); - we convert int primitive type into Intger.
            integerArrayListNew.add(Integer.valueOf(i));
        }
        //unboxing. .intValue() - we convert Integer class, object weapper back to int primitive type.
        for (int i = 0; i<= 10; i++){
            //.get(i) - the element we want to retrive. .intValue() - converts it back from integer class into int type.
            System.out.println(i + " --> " + integerArrayListNew.get(i).intValue());

        }
        System.out.println("*********");

        //Short way of doing same thing
        //This is an Integer class and you give it a valu type of int 56 and it creates an object myIntValue.
        Integer myIntValue = 56; // in copile time it get coverted to Integer.valueOf(56); : Autoboxing
        //in copile time it get coverted to myIntValue.intValue(56) - converts it back from integer class into int type.:Unboxing
        int myint = myIntValue;

        //example
        ArrayList<Double> myDoubleValue = new ArrayList<Double>();
        for (double dbl = 0.0; dbl<= 10.0; dbl+= 0.5){
            //add the value
            myDoubleValue.add(Double.valueOf(dbl)); //autoboxing
            //Coulb be aslo myDoubleValue.add(dbl);

        }
        for (int i= 0; i<myDoubleValue.size();i ++){
            double value = myDoubleValue.get(i).doubleValue(); //unboxing
            //Coulb be aslo myDoubleValue.get(i);
            System.out.println(i + " --> " + value);
        }
    }
}
