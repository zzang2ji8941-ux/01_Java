package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {

	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이는 ? :");
		int age = sc.nextInt();
		
		String presonType = age >=20 ? "저는 성인 입니다." : "저는 미성년 입니다.";
		System.out.println(age);
		
		boolean isTeenager = (age >=13)&&(age<=19);
		System.out.println("청소년 입니까?"+isTeenager);
		
		boolean isSeniorORchild = (age >= 65)||(age <=12);
		System.out.println("노인이거나 어린이입니까?"+ isSeniorORchild);
	    
	    //----------------------------------------------------
	    
		System.out.print("당신의 나이는 ? :");
		int age2 = sc.nextInt();
		
		String result1 = age2 >=20 ? "저는 성인 입니다." : "저는 미성년 입니다.";
		System.out.println(result1);
		
		int Num2 = 13;
		System.out.println("청소년 입니까?" + ((Num2>=13)&&(Num2<=19)));
		
		int Num3 = 13;
	    System.out.println("노인이거나 어린이입니까?" + ((Num3>=65)||(Num3<=12)));
	    
	    
	}

	

		
}
