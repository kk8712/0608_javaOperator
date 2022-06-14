package org.java.operator;

public class Operator9 {
	public static void main(String[] args) {
		
		System.out.println("단항 연산자");
		
		int i =10;
		
		//선처리 후증가
		System.out.println(i++);
		System.out.println(i);
		
		//선증가 후처리
		System.out.println(++i);
		
		//선처리 후감소
		System.out.println(i--);
		System.out.println(i);
		
		//선감소 후처리
		System.out.println(--i);
		
		for(int a=1; a<10; a++) {
			System.out.print(a);
		}
		System.out.println();
		for(int a=1; a<10; ++a) {
			System.out.print(a);
		}
	}
}
