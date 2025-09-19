package edu.kh.control.practice;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		int count = 0;
		int win = 0;

		System.out.println("===주사위 맞히기 게임 시작===");
		System.out.println("1~6 사이 숫자를 맞혀보세요. (종료를 원하면 \"종료\" 입력)");
		int random = (int) (Math.random() * 6 + 1);
		System.out.println(random);

		while (true) {
			System.out.print("숫자 입력 >> ");
			input = sc.next();
			count++;

			if (input.equals("종료")) {
				if (count == 0) {
					System.out.println("\n" + "===게임 종료===");
					System.out.println("총 시도 횟수: 0번");
					System.out.println("정답 횟수: 0번");
					System.out.println("게임을 플레이하지 않았습니다.");
					break;
				} else {
					System.out.println("게임을 종료합니다.");
					System.out.printf("총 시도 횟수: %d번\n", count);
					System.out.printf("정답 횟수: %d번\n", win);
					int rate = (win * 100) / count;
					System.out.println("정답률: " + rate + "%");
					break;
				}
			}

			if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5") || input.equals("6")) {
				int num1 = Integer.parseInt(input);

				if (num1 < random) {
					System.out.println("틀렸습니다. 더 큰 수를 입력하세요.\n");
				} else if (num1 > random) {
					System.out.println("틀렸습니다. 더 작은 수를 입력하세요.\n");
				} else {
					System.out.println("정답입니다! 🎉");
					System.out.println("새로운 주사위 숫자가 생성되었습니다.\n");
					random = (int) (Math.random() * 6 + 1);
					System.out.println(random);
					win++;
				}
			} else {
				System.out.println("잘못된 입력입니다. 1~6 사이 숫자를 입력하세요. \n");
			}
		}
	}
}
