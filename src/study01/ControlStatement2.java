package study01;

import java.util.Scanner;

public class ControlStatement2 {
	
public static void main(String[] args) {
		
		//scanner ��� ����
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷� ����� q");
		
		Scanner scanner = new Scanner(System.in); //��ĳ�� ��ü ����
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));
		
		System.out.println("���α׷� ����");
		
		//continue�� ����� for��
		for (int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue; //Ȧ���� ���� ���� �ڵ带 �������� �ʰ� for�� ��� ����.
			}
			System.out.println(i);
		}
	}

}
