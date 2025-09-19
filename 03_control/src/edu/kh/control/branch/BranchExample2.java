package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample2 {
	
	public void RSPGame() {
	// 가위바위보 게임
			// 몇 판할지 입력받음
			// 입력받은 판 수 만큼 반복
			
			// 컴퓨터 : Math.random() : 0.0 ~ 1.o 사이 난수 생성
			// 1 ~ 3 사이 난수 생성
			// 1이면 가위, 2이면 바위, 3이면 보 지정
			// 컴퓨터와 플레이어 가위바위보 판별
			// 플레이어 승! / 졌습니다 ㅠㅠ / 비겼습니다
			// 매판마다 - 현재기록 : 2승 1무 0패 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[가위 바위 보 게임~!]");
		
		System.out.print("몇 판? : ");
		int round = sc.nextInt();
		
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		for(int i = 1; i <= round; i++) {
			System.out.println("\n" + i + "번째 게임");
			
			System.out.print("가위/바위/보 중 하나 입력 :");
			String str = sc.next();
		}
		
	}
}
