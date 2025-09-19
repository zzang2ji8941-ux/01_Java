package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int input1 = sc.nextInt();
				
	System.out.print("사탕 개수 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("1인당 사탕 개수 :%d\n",input2/input1);
		System.out.printf("남는 사탕 개수 :%d",input2%input1);
		
	
		
	}
	
	public void practice2(){
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String str = sc.next();
		
		System.out.print("학년");
		int input = sc.nextInt();
		
		System.out.print("반:");
		int input2 = sc.nextInt();
		
		System.out.print("번호:");
		int input3 = sc.nextInt();
		
		System.out.println("성별"+"(남학생/여학생):"+"남학생");
		
		System.out.print("성적"+"(소수점 아래 둘째 자리까지) : ");
		double input4 = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s" + "남학생의 성적은"+"%.2f이다",input,input2,input3,str,input4);
	}
	
	public void practice3(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		System.out.println();
		
		int sum = kor+eng+math;
		double avg = (sum)/3.0;
		
		System.out.printf("합계 : %d\n",sum);
		System.out.printf("평균 : %.1f",avg);
		
		//각 과목이 40점 이상이고,
		//평균 60점 이상이어야 합격
		//그 외 불합격 출력
		
		boolean result = (kor >= 40)&&(eng >=40)&&(math >= 40)&&(avg>=60);
	
		System.out.println(result ? "합격" : "불합격");
	}
	
}
