package org.java.operator;

import java.util.Scanner;

public class Operator5 {

	public static void main(String[] args) {

		System.out.println("대입 연산자");

		int num = 10;
		int sum = 20 + 299;

		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 정수 입력");
		int num2 = scn.nextInt();
		System.out.println("두번째 정수 입력");
		int num3 = scn.nextInt();

		System.out.println(num2 + num3);
		System.out.println(num);
		System.out.println(sum);
		
		scn.close();

	}
}
