package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자만 입력해주세요.");

		}
	}

	public void practice2() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = num; i >= 1; i--) {
				System.out.println(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자만 입력하세요");
		}
	}

	public void practice3() {

		System.out.print("정수를 하나 입력하세요 :");
		int input = sc.nextInt();

		String result = "";
		int sum = 0;

		for (int i = 1; i <= input; i++) {
			sum += i;
			if (i == input) {
				result += i;
			} else {
				result += i + " + ";
			}
		}
		System.out.printf("%s = %d", result, sum);
	}

	public void practice4(){
		
		System.out.print("첫 번째 숫자 : ");
		int num = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		    int num2 = sc.nextInt();
		if(num < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else { //정상인 경우
			
			//일단 start에 첫 번째 숫자, end에 두번째 숫자 대입
			int start = num;
			int end = num2;
			
			// 만약 첫 번째 숫자가 크다면 start, end의 값 바꾸기
			if(num > num2) {
				start = num2;
				end = num;
			}
			for(int i = start; i <= end; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice5(){
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("=========="+ dan + "단=================");
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
			
		}
	}
	
	public void practice6() {
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("=========="+dan+"단=========");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
	}
	
	public void practice7() {
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count = 0; // 갯수세기용
		
		for(int i = 1; i <= input; i++) {
			
			// 2의 배수 또는 3의 배수인 경우 출력
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				
				// 2와 3의 공배수 == 2로도 나누어 떨어지고,
				// 3으로 나누어 떨어진다
				if(i % 2 == 0 && i % 3 == 0) {
					count++;
				}
				
			}
		}
		
		System.out.println("\ncount : " + count);
		
	}
}