package org.java.operator;


public class Operator8 {

	public static void main(String[] args) {

		System.out.println("비트 연산자");
		
		System.out.println("&");
		System.out.println(10&12);
		System.out.println(20&30);
		
		System.out.println("|");
		System.out.println(10|12);
		System.out.println(20|30);
		
		System.out.println("~");
		System.out.println(~10+" "+ Integer.toBinaryString(~10));
		
		System.out.println("shift 연산자");
		System.out.println(">>");
		System.out.println(10>>2);
		System.out.println("<<");
		System.out.println(10<<2);
		
		int i=10;
		System.out.println(i+" "+Integer.toBinaryString(i));
		System.out.println(i+" "+Integer.toBinaryString(i<<2));
		System.out.println(i+" "+Integer.toBinaryString(i>>2));

	}
}
