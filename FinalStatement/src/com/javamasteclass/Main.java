package com.javamasteclass;

public class Main {

    public static void main(String[] args) {

        SomeClass one = new SomeClass("One");
        SomeClass two = new SomeClass("Two");
        SomeClass three = new SomeClass("Three");
        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        System.out.println(Math.PI);

        // variable Password(pw) with value : 654321
        int pw = 12345;
        //pass it as apramater
        Password password = new Password(pw);
        //storung the Password and return the handshake Password
        password.storePassword();

        //login
        password.letMeIn(123456);
        password.letMeIn(530865);
        password.letMeIn(654321);
        password.letMeIn(12345);

}

}
