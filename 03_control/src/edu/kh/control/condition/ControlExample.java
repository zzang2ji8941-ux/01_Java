package edu.kh.control.condition;

import java.util.Scanner;

public class ControlExample { //기능 제공용 클래스

	Scanner sc = new Scanner(System.in);// 필드 (클래스 들어오자마자 정역에 만들어주는 변수)
	
	// 메서드 (+ 생성자)
	public void ex1() {
		
		// if 문
		// 조건식이 true 일 때만 내부 코드 수행
		
		// 입력받은 정수가 양수인지 검사
		// 양수라면 "양수입니다" 출력
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수입니다");
			
			
		}
		
		if(input <= 0) {
			System.out.println("양수가 아니다");
		}
		
		
	}
	
	public void ex2() {
		//if - else문 
		// 조건식 결과가 true면 if 구문,
		// false면 else 구문 수행됨
		
		// 홀짝 검사
		// 입력받은 정수값이
		// 홀수이면 "홀수입니다" 출력
		// 짝수이면 "짝수입니다" 출력
		// 0이면 "0입니다" 출력
		// 중첩 if문 사용
		
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		
		if(input % 2 != 0) { // 홀수라면 
			System.out.println("홀수입니다");
		} else { // 짝수거나 0인 경우
			
			//중첩 if문
			if(input == 0) {
				System.out.println("0 입니다");
			} else {
				System.out.println("짝수입니다");
				
			}
			
			
			
		}
		
		
	}
	
	public void ex3() {
		// if(조건식) - else if(조건식) - else
		
		// 양수인지 음수인지 0인지 판별
System.out.print("정수 입력 : ");
int input = sc.nextInt();

if(input > 0) {
	System.out.println("양수입니다");
} else if (input < 0) {
	System.out.println("음수입니다");
} else {
	System.out.println("0 입니다");
	
}
		
		
	}
	
	public void ex4() {
		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
        // 겨울/여름에는 온도(temperature) 입력받기
		// 1,2,12 겨울 (-15도 이하 : "한파 경보"/ -12도 이하 : "겨울 한파 주의보" )
		// 3-5 봄
		// 6-8 여름  (35도 이상 : "여름 폭염 경보" / 33도 이상 : "여름 폭염 주의보")
		// 9-11 가을
		// 1-12 사이가 아닐 땐 "해당하는 계절이 없습니다" 출력
		
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		
		String season; // 계절명을 저장할 변수
		
		if (month == 1 || month == 2 || month == 12) {
			season = "겨울";
			
			System.out.print("온도 입력 : ");
			int temperature = sc.nextInt();
			
			if(temperature <= -15) {
				// 겨울 한파 경보
				season += "한파 경보";
				// season = season + "한파 경보";
			} else if(temperature <= -12) {
				season += "한파 주의보";
			}
			
		} else if (month >= 3 && month <=5) {
		    season = "봄";
		    
		} else if(month >=6&&month <=8) {
			season = "여름";
			
			System.out.print("온도 입력 : ");
			int temperature = sc.nextInt();
			
			if(temperature>=35) {
				season += "폭염 경보";
			}else if(temperature >=33 ) {
				season += "폭염 주의보";
			}
		} else if (month >=9 && month <=11) {
			season = "가을";
		}else {
			season = "해당하는 계절이 없습니다";
		}
		
		
		System.out.println(season);
		
		
		
		
	}
	
	public void ex5() {
		// 나이를 입력받아
		// 13세 이하면 "어린이 입니다"
		// 13세 초과 19세 이하면 "청소년 입니다"
		// 19세 초과 시 "성인 입니다" 출력
		
		System.out.print("나이 : ");
		int input = sc.nextInt();
		
		String result; // 결과값 담을 변수 선언
		
		/*if(input <= 13) {
			System.out.println("어린이 입니다");
		} else if(input > 19) {
			System.out.println("성인 입니다");
		} else {
			System.out.println("청소년 입니다");
		}**/
		
		if(input <=13) result = "어린이 입니다";
       else if(input <= 19) result = "청소년 입니다";
		else result = "성인 입니다";
		
		 System.out.println(result);
		
	}
	
	public void ex6() {
		// 점수(100점 만점)를 입력받아
		// 90점 이상 : A
		// 80점 이상 90점 미만 : B
		// 70점 이상 80점 미만 : C
		// 60점 이상 70점 미만 : D
		//  60점 미만 : F
		// 0점 미만, 100점 초과 : "잘못 입력하셨습니다" 출력
		
		//[실행화면]
		//점수 입력 : 60
		//D
		//--------------------
        // 점수 입력 : 120
		// 잘못 입력하셨습니다
		
		System.out.print("점수 입력: ");
		int num = sc.nextInt();
		
		String result;
		
		if(num < 0 || num > 100) {// 범위에서 벗어난 경우
			result = "잘못 입력하셨습니다";
		} else if(num >= 90) { // 100 ~ 90 사이
			result = "A";
			
		}else if(num <= 80) {
			result = "B";
					
		}else if(num <= 70) {
			result = "C";
		
	}else if(num <= 60) {
		result = "D";
		} else if(num < 60)
		result = "F";
	else {
		result = "잘못 입력하셨습니다";
	}
		System.out.println(result);
	}
	
	public void ex7() {
		// 놀이기구 탑승 제한 검사
		// 나이가 12세 이상, 키 140.0 이상일 경우에만 "탑승가능"
		// 나이가 12미만인 경우 : "적정 연령이 아닙니다"
		// 키가 140.0 미만 : "적정 키가 아닙니다"
		// 나이가 0세 미만, 100세 초과 시 : "잘못 입력하셨습니다" 
				
		// [실행화면]
		// 나이 입력 : 10
		// 키 입력 : 160
		// 적정 연령이 아닙니다
			
		// 나이 입력 : 15
		// 키 입력 : 110
		// 적정 키가 아닙니다
				
		// 나이 입력 : 15
		// 키 입력 : 160
		// 탑승 가능
				
		// 나이 입력 : 300
		// 잘못 입력하셨습니다S
		
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		
		String result;
		
		if(age < 0 || age > 100){
			result = "잘못 입력하셨습니다";
		} else {
			System.out.print("키 입력: ");
			double height = sc.nextDouble();
			
			if(age < 12) {
				result = "적정 연령이 아닙니다";
				
			} else if(height < 140.0) {
				result = "적정 키가 아닙니다";
				
			} else {
				result = "탑승 가능";
			}
			
		} // else 문 끝
		
		System.out.println(result);
	}
	
	public void ex8() {
	// 놀이기구 탑승 제한 검사 프로그램
	// 조건 - 나이 : 12세 이상
	// - 키 : 140.0cm 이상
	// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
	// 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
	// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
	// 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
	// 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
	// 나이 X , 키 X : "나이와 키 모두 적절치 않음";
	// 나이 O , 키 O : "탑승 가능"

	// [실행화면]
	// 나이 입력 : 130
	// 나이를 잘못 입력 하셨습니다

	// 나이 입력 : 30
	// 키 입력 : 300
	// 키를 잘못 입력 하셨습니다

	// 나이 입력 : 20
	// 키 입력 : 110
	// 나이는 적절하나, 키가 적절치 않음

	// 나이 입력 : 10
	// 키 입력 : 150
	// 키는 적절하나, 나이가 적절치 않음

	// 나이 입력 : 10
	// 키 입력 : 110
	// 나이와 키 모두 적절치 않음

	// 나이 입력 : 15
	// 키 입력 : 160
	// 탑승 가능!!!
	
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age < 0 || age > 100) {
			result = "나이를 잘못 입력 하셨습니다.";
		}else { // 나이를 0~100 범위로 잘 입력한 경우
			
			System.out.print("키 입력 : ");
			double height = sc.nextDouble();
			
			if(height < 0 || height >  250.0) {
			result = "키를 잘못 입력 하셨습니다.";
			
		} else {// 키를 0~ 250 사이 정상범주로 입력한 경우
			
			if( age < 12 && height >= 140.0) { // 나이 X, 키 O
			    result = "키는 적절하나, 나이가 적절치 않음";	
			} else if(age >= 12&& height < 140.0) {// 나이 O, 키 X
				result = "나이는 적절하나, 키가 적절치 않음";
			} else if(age < 12 && height < 140.0) {// 둘 다X
				result = "나이와 키 모두 적절치 않음";
				
			}else {// 둘 다 가능
				result = "탑승 가능";
				
			}
				
			}
		}
			System.out.println(result);
		}
		
	public void ex9() {
		// switch 문
		// 여러 case 중 하나를 선택하여 수행하는 조건문
		
		// 요일 번호 입력 ( 1 ~ 7 ) : 3
		// 수요일 
		
		System.out.print("요일 번호 입력 : ");
		int day = sc.nextInt();
		
		switch(day) {
		case 1 : System.out.println("월요일"); break;
		case 2 : System.out.println("화요일"); break;
		case 3 : System.out.println("수요일"); break;
		case 4 : System.out.println("목요일"); break;
		case 5 : System.out.println("금요일"); break;
		case 6 : System.out.println("토요일"); break;
		case 7 : System.out.println("일요일"); break;
		default : System.out.println("잘못된 입력입니다");
		}
		
		
	}
	
	public void ex10() {
		// 0 ~ 100 사이 점수를 입력받아
		// 10으로 나는 몫이 
		// 10, 9 라면 A
		// 8이면 B, 7이면 C, 6이면 D, 그 외(5~0) F 출력
		
		//[실행화면]
		//점수 입력(0~100):85
		//학점 B
		
		System.out.print("점수 입력(0 ~ 100) : ");
		int score = sc.nextInt();
		
		switch(score / 10) {
		case 10 : System.out.println("학점 A"); break;
		case 9 : System.out.println("학점 A"); break;
		// case 10,9 : System.out.println("학점 A"); break;//위에 코드 줄여서
		//  case 10, case 9 : System.out.println("학점 A"); break;
		case 8 : System.out.println("학점 B"); break;
		case 7 : System.out.println("학점 C"); break;
		case 6 : System.out.println("학점 D"); break;
		case 5,4,3,2,1,0 : System.out.println("학점 F"); break;
		default : System.out.println("잘못된 점수");
		}
		
		
		
	}
}