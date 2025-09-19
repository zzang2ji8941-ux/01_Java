package edu.kh.variable.plactice;

public class CastingPratice2 {

	public static void main(String[] args) {
		
		//1)
		int age = 25;
		System.out.println("나는"+ age +"살입니다.");
		
		//2)
		int score = 90;
		score = score + 10;
		// score+= 10;
		System.out.println("최종점수 : " + score);
		
		//3)
		int a = 10;
		double b = a;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//4)
		double pi = 3.14159;
		int num = (int)pi;
		System.out.printf("pi = %.2f, num = %d\n",pi,num);

		//5)
		char ch = 'A';
		int code = ch; // 자동형변환 char -> int
		System.out.printf("문자 :%c, 코드값:%d\n", ch, code);
		
		//6)
	    final int PRICE = 5000;// 상수-> 대문자
	    int count = 3;
	    int total = PRICE*count;
	    System.out.printf("물건가격:%d원, 개수:%d개, 총액:%d원\n",PRICE,count,total);
	    
	    //7)
	    //int kor = 95;
	    //int eng = 87;
	    //int math = 90;
	    
	    int kor = 95, eng = 87, math = 90;
	    int sum = kor + eng + math;
	    double avg = sum / 3.0;
	    System.out.printf("국어:%d, 영어:%d, 수학:%d\n", kor,eng,math);
	    System.out.printf("총점:%d, 평균:%.2f\n", sum,avg);
	    
	    //8)
	    String name = "영숙";
	    int age2=28;
	    double height=165.7;
	    
	    //9)
	    System.out.printf("출연자 이름: %s\n", name);
	    System.out.printf("나이: %d세\n", age2);
	    System.out.printf("키: %.1fcm\n", height);
	    
	    System.out.printf("출연자 이름: %s\n 나이: %d세\n 키: %.1fcm\n", name,age2,height);
	    
	    //10)
	    double doubleage = age2; //자동형변환
	    System.out.println("자동형변화 된 나이(double):"+doubleage );
	    
	    //11)
	    int intHeight = (int)height; // double -> int 강제형변환
	    System.out.println("강제형변화 된 키(int):"+intHeight);
	    
	    //12)
	    int score1 = 87, score2 = 92;
	    double avgScore = (score1 + score2)/2.0;
	    System.out.printf("%s님의 매칭 점수 평균은 %.1f점입니다\n",name,avgScore );
	 
	    
	    
		
	}

}
