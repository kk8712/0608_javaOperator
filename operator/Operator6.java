package org.java.operator;


public class Operator6 {

	public static void main(String[] args) {

		System.out.println("XOR ¿¬»êÀÚ(^)");

		int num = 100;
		int num2 = 20;

		System.out.println((num == 100) + "^" + (num2 == 20) + "=" + (num == 100 ^ num2 == 20));
		System.out.println((num == 100) + "^" + (num2 == 10) + "=" + (num == 100 ^ num2 == 10));
		System.out.println((num == 200) + "^" + (num2 == 20) + "=" + (num == 200 ^ num2 == 20));
		System.out.println((num == 200) + "^" + (num2 == 10) + "=" + (num == 200 ^ num2 == 10));

	}
}
