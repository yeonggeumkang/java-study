package study01;

import java.util.Scanner;

public class ControlStatement2 {
	
public static void main(String[] args) {
		
		//scanner 사용 예시
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램 종료는 q");
		
		Scanner scanner = new Scanner(System.in); //스캐너 객체 생성
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));
		
		System.out.println("프로그램 종료");
		
		//continue를 사용한 for문
		for (int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue; //홀수인 경우는 밑의 코드를 실행하지 않고 for문 계쏙 진행.
			}
			System.out.println(i);
		}
	}

}
