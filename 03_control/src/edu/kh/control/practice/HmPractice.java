package edu.kh.control.practice;

import java.util.Scanner;

public class HmPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("===ATM 프로그램 시작===");
		int money = 10000;
		System.out.print("현재 잔액: " + money + "원\n\n");
		int input = 1;

		while (input != 4) {

			System.out.println("메뉴를 선택하세요 : ");
			System.out.println("1. 입금하기");
			System.out.println("2. 출금하기");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");
			System.out.print(">> ");

			input = sc.nextInt();
			System.out.println();

			if (input < 1 || input > 4) {
				System.out.println("잘못된 입력입니다. 1~4번 중에서 선택하세요.\n");
			} else if (input == 1) {
				System.out.print("입금할 금액을 입력하세요: ");
				int money2 = sc.nextInt();
				money += money2;
				System.out.print("입금 완료! 현재 잔액: " + money + "원\n\n");
			} else if (input == 2) {
				System.out.print("출금할 금액을 입력하세요: ");
				int money3 = sc.nextInt();
				if (money < money3) {
					System.out.printf("잔액 부족! 현재 잔액은 %d원입니다.\n\n", money);
				} else {
					money -= money3;
					System.out.printf("출금 완료! 현재 잔액: %d원\n\n", money);
				}
			} else if (input == 3) {
				System.out.printf("현재 잔액은 %d원입니다.\n", money);
			}
		}
		System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다!");

	}
}
