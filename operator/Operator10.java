package org.java.operator;


public class Operator10 {
	public static void main(String[] args) {
		
		System.out.println("3항 연산자");
		
		int i = 10;
		
		System.out.println(i>10? true : false);
		
		boolean bool = i>10 ? true : false;
		int i2 = i>10 ? 1 :0 ;
		double d = i>10 ? 1.1 :0.1;
		char ch = i>10 ? 'a' : 'b';
			System.out.println(bool+" "+i2+" "+d+ " "+ch );
			char ch2 ='a';
			char ch3 = 'b';
			System.out.println(ch3-ch2);
	}
}
