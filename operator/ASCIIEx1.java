package org.java.operator;

public class ASCIIEx1 {
	public static void main(String[] args) {
		System.out.println('A');
		System.out.println('A'-'B'); //연산 시 int이하의 타입은 자동으로 int형으로 변경
		
		System.out.println((int)'A');
		System.out.println((int)'A'-'B');
		System.out.println((int)'A');
		
		System.out.println((char)('A'+32)); //대문자 >>소문자
		System.out.println((char)('a'-32)); //소문자 >> 대문자
		System.out.println((char)('A'+'!'));
		System.out.println((char)('Z'+32));
		
		System.out.println((Integer.toBinaryString('A')));
		System.out.println((Integer.toBinaryString('A'+32)));
		System.out.println((Integer.toBinaryString('A'+'b')));
	}
}
