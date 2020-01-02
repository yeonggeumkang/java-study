package study01;

public class CalculatorS6 {
	
	//인스턴스 변수 - 객체(인스턴스)마다 필요하므로
	String color;
	static double bi = 3.14159; //인스턴스 마다 필요하지 않고, 클래스 전체에서 공용된다면 정적 필드로 선언한다.
	
	//인스턴스 메소드 선언
	void setColor(String color) {
		this.color = color;
	}
	
	//정적 메소드 선언
	static int plus(int x, int y) {
		return x+y;
	}
	
	
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	//계산이 필요한 초기화 작업은 정적 블록을 사용한다
	static {
		// 클래스가 메모리로 로딩될 때 자동적으로 실행되는 구간.
		info = company+"-"+model;
	}
	
	//main 메소드 역시 static 구간이므로, 클래스 로딩 시 자동 실행 (즉. 일반적인 실행 코드 구간)
	
}
