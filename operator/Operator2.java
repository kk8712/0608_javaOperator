package org.java.operator;

public class Operator2 {

	public static void main(String[] args) {
		System.out.println("�� ������('����')");

		int num = 10;
		int num2 = 5;

		System.out.println("1��" + (num > num2));
		System.out.println("2��" + (num < num2));
		System.out.println("3��" + (num >= num2));
		System.out.println("4��" + (num <= num2));
		System.out.println("5��" + (num == num2));
		System.out.println("6��" + (num != num2));

		System.out.println("String ��ü ��");

		String str1 = new String();
		String str2 = new String();

		str1 = "java";
		str2 = "java";
		String str3 = "java";

		System.out.println(str1 == str2);
		System.out.println(str1 == "java");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals("java"));

		String userId = "k1";
		if (userId == "k1") {
			System.out.println("���̵� �½��ϴ�.");
		}
	}
}
