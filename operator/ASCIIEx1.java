package org.java.operator;

public class ASCIIEx1 {
	public static void main(String[] args) {
		System.out.println('A');
		System.out.println('A'-'B'); //���� �� int������ Ÿ���� �ڵ����� int������ ����
		
		System.out.println((int)'A');
		System.out.println((int)'A'-'B');
		System.out.println((int)'A');
		
		System.out.println((char)('A'+32)); //�빮�� >>�ҹ���
		System.out.println((char)('a'-32)); //�ҹ��� >> �빮��
		System.out.println((char)('A'+'!'));
		System.out.println((char)('Z'+32));
		
		System.out.println((Integer.toBinaryString('A')));
		System.out.println((Integer.toBinaryString('A'+32)));
		System.out.println((Integer.toBinaryString('A'+'b')));
	}
}
