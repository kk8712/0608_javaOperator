package org.java.operator;

import java.util.Scanner;

public class ASCIIEx2 {
	public static void main(String[] args) {
		System.out.println("65~90 && 97~122 숫자 입력");
		Scanner scn = new Scanner(System.in);
		int alpa = scn.nextInt();
		if (alpa > 64 && alpa < 91) {
			System.out.println("입력값 : " + alpa);
			System.out.println("입력값 : " + (char) alpa);

			int upalpa = alpa + 32;
			System.out.println("소문자 : " + upalpa);
			System.out.println("소문자 : " + (char) upalpa);
		} else if (alpa > 96 && alpa < 123) {
			System.out.println("입력값 : " + alpa);
			System.out.println("입력값 : " + (char) alpa);

			int downalpa = alpa - 32;
			System.out.println("대문자 : " + downalpa);
			System.out.println("대문자 : " + (char) downalpa);
		} else {
			System.out.println("다시 65~90 && 97~122 숫자 입력하세요");
		}
		scn.close();
	}
}
