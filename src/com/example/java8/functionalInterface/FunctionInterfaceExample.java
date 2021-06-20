package com.example.java8.functionalInterface;

@FunctionalInterface
interface Example {
	public String getData();
}

public class FunctionInterfaceExample {
	public static void main(String[] args) {
		Example e = () -> {return "Hello!";};
		System.out.println("data: "+e.getData());
	}
}
