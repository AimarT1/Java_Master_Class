package com.javamasteclass;

public class Series {

    public static int nSum(int n){
        return n *(n + 1) / 2;
    }
    public static int factorial(int n){
        if (n == 1 || n == 0){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
    public static int fibonacci(int n){
        if (n == 0 ||n == 1){
            return 1;
        }else {
            return n = fibonacci(n - 1) + fibonacci(n -2);
        }
    }
}
