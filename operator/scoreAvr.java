package org.java.operator;

import java.util.Scanner;

public class scoreAvr {
	public static void main(String[] args) {
		System.out.println("점수의 총점과 평균을 구하여 콘솔에 출력하시오");

		Scanner scn = new Scanner(System.in);
		System.out.println("국어 점수 (정수)");
		int kor = scn.nextInt();
		
		System.out.println("국어: " + kor + "점");
		System.out.println("영어 점수 (정수)");
		int eng = scn.nextInt();
		
		System.out.println("영어: " + eng + "점");
		System.out.println("수학 점수 (정수)");
		int math = scn.nextInt();
		
		System.out.println("수학: " + math + "점");
		int sum = kor + eng + math;
		float avg = (float) (sum) / 3;
		
		System.out.println("점수의 합계는" + sum + "점 입니다.");
		System.out.println("점수의 평균은" + avg + "점 입니다.");

		scn.close();
	}
}
