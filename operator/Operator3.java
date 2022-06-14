package org.java.operator;

public class Operator3 {

	public static void main(String[] args) {
		System.out.println("논리 연산자");
		System.out.println("&&모든 조건이 TRUE일때 TRUE");

		String userId = "idid";
		String userPaw = "1111";
		System.out.println(userId == "idid" && userPaw == "1111");
		System.out.println(userId == "idid" && userPaw == "11112");
		System.out.println(userId == "idid2" && userPaw == "1111");
		System.out.println(userId == "idid2" && userPaw == "11112");

		if (userId == "idid" && userPaw == "1111") {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

		System.out.println("||조건이 하나이상 TRUE일때 TRUE");
		System.out.println(userId == "idid" || userPaw == "1111");
		System.out.println(userId == "idid" || userPaw == "11112");
		System.out.println(userId == "idid2" || userPaw == "1111");
		System.out.println(userId == "idid2" || userPaw == "11112");

		if (userId != "idid" || userPaw != "1111") {
			System.out.println("로그인 실패");
		} else {
			System.out.println("로그인 성공");
		}

	}
}
