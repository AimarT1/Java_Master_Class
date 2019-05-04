package com.javamasteclass;

public class Main {

    public static void main(String[] args) {
	SimpleCalculator simpleCalculator = new SimpleCalculator();
	Person person = new Person();
	person.setAge(-5);
	System.out.println(person.getAge());

	Wall wall = new Wall(-1.25,-1.25);
		System.out.println(wall.getWidth());
		System.out.println(wall.getHeight());

    }
}
