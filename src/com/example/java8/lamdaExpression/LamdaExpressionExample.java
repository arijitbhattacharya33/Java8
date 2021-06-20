package com.example.java8.lamdaExpression;


interface Lamda{
	public void lamdaMethod();
}

public class LamdaExpressionExample {

	public static void main(String[] args) {
		
		Lamda lamda = () -> System.out.println("Hello lamda!");
		lamda.lamdaMethod();
	}

}
