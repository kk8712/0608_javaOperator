package org.java.operator;

import java.util.Scanner;

public class ASCIIEx2 {
	public static void main(String[] args) {
		System.out.println("65~90 && 97~122 ���� �Է�");
		Scanner scn = new Scanner(System.in);
		int alpa = scn.nextInt();
		if (alpa > 64 && alpa < 91) {
			System.out.println("�Է°� : " + alpa);
			System.out.println("�Է°� : " + (char) alpa);

			int upalpa = alpa + 32;
			System.out.println("�ҹ��� : " + upalpa);
			System.out.println("�ҹ��� : " + (char) upalpa);
		} else if (alpa > 96 && alpa < 123) {
			System.out.println("�Է°� : " + alpa);
			System.out.println("�Է°� : " + (char) alpa);

			int downalpa = alpa - 32;
			System.out.println("�빮�� : " + downalpa);
			System.out.println("�빮�� : " + (char) downalpa);
		} else {
			System.out.println("�ٽ� 65~90 && 97~122 ���� �Է��ϼ���");
		}
		scn.close();
	}
}
