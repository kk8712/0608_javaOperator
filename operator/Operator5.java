package org.java.operator;

import java.util.Scanner;

public class Operator5 {

	public static void main(String[] args) {

		System.out.println("���� ������");

		int num = 10;
		int sum = 20 + 299;

		Scanner scn = new Scanner(System.in);
		System.out.println("ù��° ���� �Է�");
		int num2 = scn.nextInt();
		System.out.println("�ι�° ���� �Է�");
		int num3 = scn.nextInt();

		System.out.println(num2 + num3);
		System.out.println(num);
		System.out.println(sum);
		
		scn.close();

	}
}
