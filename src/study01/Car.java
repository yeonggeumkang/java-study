package study01;

public class Car {
	
	//6.6.1 필드 선언
	//maxSpeed 처럼 초기값을 지정해줄 수도 있으나, 지정하지 않으면 java의 기본 초기값으로 설정됨.
	
	
	//고유 데이터
	String company = "기아자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 300;
	
	//상태
	int speed;
	
	
	//6.7생성자
	//모든 클래스는 생성자가 하나 이상 반드시 존재한다.
	// 클래스 내부 생성자를 생략한 경우 자바 컴파일러가 기본 생성자를 자동 추가시킨다.
	
	//생성자(4)
	Car(String model, String color, int maxSpeed){
		//생성자를 선언한 경우, 객체 생성 시 기본 생성자 호출 불가.
		this.model = model; //클래스의 필드 이름과 매개변수가 같을 경우는 필드 앞에 this를 붙인다.
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//생성자 오버로딩
	//생성자(1)
	Car(){
		
	}
	
	//생성자(2)
	Car(String model){
		//this.model = model;
		//this.color = "은색";
		//this.maxSpeed = 250;
		this(model, "은색", 250); 
	}
	//생성자 선언 시 매개변수 타입이 동일하면 안 됨. 달라야 다른 생성자로 인식 됨.
	
	//생성자(3)
	Car(String model, String color){
		//this.model = model;
		//this.color = color;
		//this.maxSpeed = 250;
		this(model, color, 250);
	}
	//생성자 오버로딩 시 중복 코드를 피하기 위한 방법은?
	//this를 사용하는 것.
	//생성자(2) (3)에서 this를 사용함으로써 생성자(4)를 호출하는 것
	
}