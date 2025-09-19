package edu.kh.array.ex;

import java.util.Scanner;

public class ArrayExample2 {
Scanner sc = new Scanner (System.in);

public void ex1() {
	// 5명의 키(cm)를 입력받고 평균 구하기

	// 1번 키 입력 : 170.5
	// 2번 키 입력 : 163.7
	// ...
	// 5번 키 입력 : 167.2
	// 평균 : 177.02cm
	
	double [] height = new double[5];
	double sum =0;
	
	for(int i = 0; i < height.length; i++) {
		System.out.print((i + 1)+"번 키 입력");
		
		sum += height.length;
	}
	
	System.out.printf("\n평균 : %.2fcm",sum/height.length);
}

public void ex2() {
//입력 받은 인원 수 만큼의 점수를 입력받아 배열에 저장
		// 입력이 완료되면 점수 합계, 평균 출력

		// ex)
		// 입력 받을 인원 수 : 4
		// 1번 점수 입력 : 100
		// 2번 점수 입력 : 80
		// 3번 점수 입력 : 50
		// 4번 점수 입력 : 60

		// 합계 : 290
		// 평균 : 72.5
	System.out.print("입력 받을 인원 수 : ");
	int input = sc.nextInt();
	
	int [] score = new int [input];
	
	int sum = 0;
	
	for(int i = 0; i < score.length; i++) {
		System.out.println((i+1) + "번 점수 입력 : ");
		score[i] = sc.nextInt();
		
		sum += score[i];
	}
	System.out.printf("합계 : %d\n", sum);
	System.out.printf("평균 : %.2f", (double)sum / score.length);
}

public void ex3() {
	// 점심 메뉴 뽑기 프로그램
			String[] arr = { "김밥", "서브웨이", "햄버거", "백반", "국밥", "짜장면" };
			System.out.println("오늘의 점심 메뉴 : "+ arr[(int)(Math.random()*6)]);
			
}

public void ex4() {
	
}








}
