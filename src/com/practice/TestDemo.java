package com.practice;

public class TestDemo {

	public static void main(String[] args) {
		Demo d = null;
		try {
			d = new Demo();
			System.out.println(d.divide(10, 0));
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {

			System.out.println("Closed.");
		}

	}
}
