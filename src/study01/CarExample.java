package study01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("K5", "화이트", 250);
		
		System.out.println("제조회사:"+myCar.company);
		System.out.println("모델명:"+myCar.model);

		System.out.println("최고속도:"+myCar.maxSpeed);
		System.out.println("현재속도:"+myCar.speed);
		
		myCar.speed = 200;
		System.out.println("현재속도:"+myCar.speed);
	}
}
