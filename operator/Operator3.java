package org.java.operator;

public class Operator3 {

	public static void main(String[] args) {
		System.out.println("�� ������");
		System.out.println("&&��� ������ TRUE�϶� TRUE");

		String userId = "idid";
		String userPaw = "1111";
		System.out.println(userId == "idid" && userPaw == "1111");
		System.out.println(userId == "idid" && userPaw == "11112");
		System.out.println(userId == "idid2" && userPaw == "1111");
		System.out.println(userId == "idid2" && userPaw == "11112");

		if (userId == "idid" && userPaw == "1111") {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}

		System.out.println("||������ �ϳ��̻� TRUE�϶� TRUE");
		System.out.println(userId == "idid" || userPaw == "1111");
		System.out.println(userId == "idid" || userPaw == "11112");
		System.out.println(userId == "idid2" || userPaw == "1111");
		System.out.println(userId == "idid2" || userPaw == "11112");

		if (userId != "idid" || userPaw != "1111") {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}

	}
}
