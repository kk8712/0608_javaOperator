package org.java.operator;

public class Operator9 {
	public static void main(String[] args) {
		
		System.out.println("���� ������");
		
		int i =10;
		
		//��ó�� ������
		System.out.println(i++);
		System.out.println(i);
		
		//������ ��ó��
		System.out.println(++i);
		
		//��ó�� �İ���
		System.out.println(i--);
		System.out.println(i);
		
		//������ ��ó��
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
