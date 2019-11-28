package study01;

public class ControlStatement {
	public static void main(String[] args) throws Exception {
		//4강 switch문(p119)
		String position = "과장";
		
		switch(position) {
			case"부장":
				System.out.println("부장은 700만원");
				break;
			case "과장":
				System.out.println("과장은 500만원");
				break;
			default:
				System.out.println("300만원");
		}
		
		//for문 : 1부터 10까지 출력
		for(int i=1; i<=10; i++) {
			System.out.print(i);
		}
		
		/*for문 초기화식 생략
		int i=1;
		for(; i<20; i++) {
			System.out.print(i);
		}*/
		
		//for문 : 초기화식; 조건식; 증감식 : 여러개 있을 수 있음
		System.out.println();
		for (int i=1,j=10; i<=15 || j>0; i++, j--) {
			System.out.println(i+" "+j);
		}
		
		//while문 : while문 내의 변수는 시작 전에 미리 선언해야만 함!!!!!###
		int i=1;
		while(i<10) {
			System.out.print(i);
			i++;
		}
		
		//키보드로 while문 제어 (p.127)
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if (keyCode !=13 && keyCode!= 10) {
				System.out.println("1.종속 | 2.감속 | 3.중지");
				System.out.println("선택: ");
			}
			
			keyCode = System.in.read(); //키보드의 키 코드를 읽음
			
			if (keyCode == 49) {
				speed++;
				System.out.println("현재속도 :"+speed);
			} else if (keyCode == 50) {
				speed--;
				System.out.println("현재속도 :"+speed);
			} else if (keyCode == 51) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
