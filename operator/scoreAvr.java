package org.java.operator;

import java.util.Scanner;

public class scoreAvr {
	public static void main(String[] args) {
		System.out.println("������ ������ ����� ���Ͽ� �ֿܼ� ����Ͻÿ�");

		Scanner scn = new Scanner(System.in);
		System.out.println("���� ���� (����)");
		int kor = scn.nextInt();
		
		System.out.println("����: " + kor + "��");
		System.out.println("���� ���� (����)");
		int eng = scn.nextInt();
		
		System.out.println("����: " + eng + "��");
		System.out.println("���� ���� (����)");
		int math = scn.nextInt();
		
		System.out.println("����: " + math + "��");
		int sum = kor + eng + math;
		float avg = (float) (sum) / 3;
		
		System.out.println("������ �հ��" + sum + "�� �Դϴ�.");
		System.out.println("������ �����" + avg + "�� �Դϴ�.");

		scn.close();
	}
}
