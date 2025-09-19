package edu.kh.control.practice;

import java.util.Scanner;

public class ControlPratice {

	Scanner sc = new Scanner(System.in);
// ctrl + shift + f = 코드 자동 정렬
	public void practice1() {
		System.out.print("숫자를 한 개 입력하세요 :");
		int input = sc.nextInt();

		String result;

		if (input <= 0) {
			result = "양수만 입력해주세요";
		} else if (input % 2 != 0) {
			result = "홀수입니다.";
		} else {
			result = "짝수입니다.";
		}
		System.out.println(result);
	}

	public void practice2() {

		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();

		System.out.print("수학 점수 : ");
		int math = sc.nextInt();

		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();

		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		//합격의 조건
		if(kor >= 40 && math >= 40 && eng >=40 && avg >=60 ) {
			System.out.println("국어 : "+ kor);
			System.out.println("수학 : "+ math);
			System.out.println("영어 : "+ eng);
			System.out.println("합계 : "+ sum);
			System.out.printf("평균 : %.1f", avg);
			System.out.println("축하합니다, 합격입니다 : ");
			
		} else {
			System.out.println("국어 : "+ kor);
			System.out.println("수학 : "+ math);
			System.out.println("영어 : "+ eng);
			System.out.println("불합격입니다.");
		}

	}

	public void practice3() {

		System.out.print("1~12 사이의 정수 입력 :");
		int month = sc.nextInt();

		switch (month) {
		// case 1,3,5,7,8,10,12 : 
		//System.out.println(month + "월은 31일까지있습니다"); break;
		// 겹치는 부분들이 있을 때 줄여서 사용하는 방법
		case 1:
			System.out.println("1월은 31일 까지 있습니다");
			break;
		case 2:
			System.out.println("2월은 28일 까지 있습니다");
			break;
		case 3:
			System.out.println("3월은 31일 까지 있습니다");
			break;
		case 4:
			System.out.println("4월은 30일 까지 있습니다");
			break;
		case 5:
			System.out.println("5월은 31일 까지 있습니다");
			break;
		case 6:
			System.out.println("6월은 30일 까지 있습니다");
			break;
		case 7:
			System.out.println("7월은 31일 까지 있습니다");
			break;
		case 8:
			System.out.println("8월은 31일 까지 있습니다");
			break;
		case 9:
			System.out.println("9월은 30일 까지 있습니다");
			break;
		case 10:
			System.out.println("10월은 31일 까지 있습니다");
			break;
		case 11:
			System.out.println("11월은 30일 까지 있습니다");
			break;
		case 12:
			System.out.println("12월은 31일 까지 있습니다");
			break;
		default:
			System.out.println(month + "월은 잘못 입력된 달입니다");
		}
	}

	public void practice4() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();

		System.out.print("몸무게(kg)를 입력해 주세요 :");
		double weight = sc.nextDouble();

	
		double bmi = weight/(height * height);
	    System.out.println("BMI 지수 : "+ bmi);
	    		
	    
		String result;

		if (bmi < 18.5) {
			result = "저체중";
		} else if (bmi >= 18.5 && bmi < 23) {
			result = "정상체중";
		} else if (bmi >= 23 && bmi < 25) {
			result = "과체중";
		} else if (bmi >= 25 && bmi < 30) {
			result = "비만";
		} else {
			result = "고도 비만";
		}

		System.out.println(result);
	}
	
	public void practice5(){
		
		System.out.print("중간 고사 점수 :");
		double midTerm = sc.nextDouble();
		
		System.out.print("기말 고사 점수 :");
		double finalTerm = sc.nextDouble();
		
		System.out.print("과제 점수 :");
		double report = sc.nextDouble();
		
		System.out.print("출석 횟수 :");
		double attendance = sc.nextDouble();
		
		//각각의 점수를 비율에 맞게 변경
	midTerm *= 0.2;
	// misTerm = midTerm * 0.2;
		finalTerm *= 0.3;
		report *= 0.3;
		System.out.println("=============결과=============");

		
		if(attendance <= 20 * 0.7) { // 출석 횟수 부족으로 인한 낙제
			
			System.out.println("Fail [출석 횟수 부족] ("+
			                (int)attendance+ "/20)");
			
		}else { // 출석 만족 시
			System.out.printf("중간 고사 점수(20) : %.1f\n", midTerm);
			System.out.printf("기말 고사 점수(30) : %.1f\n", finalTerm);
			System.out.printf("과제 점수(30) : %.1f\n", report);
			System.out.printf("출석 점수(20) : %.1f\n", attendance);
			
			double sum = midTerm + finalTerm + report + attendance;
			
			System.out.printf("총점 : %.1f\n", sum);
			
			if(sum >= 70) {
				System.out.println("PASS");
			}else {
				System.out.println("Fail [점수미달]");
			}
			
			
		}
		
	}
}
