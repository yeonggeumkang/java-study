package study01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("K5", "ȭ��Ʈ", 250);
		
		System.out.println("����ȸ��:"+myCar.company);
		System.out.println("�𵨸�:"+myCar.model);

		System.out.println("�ְ�ӵ�:"+myCar.maxSpeed);
		System.out.println("����ӵ�:"+myCar.speed);
		
		myCar.speed = 200;
		System.out.println("����ӵ�:"+myCar.speed);
	}
}
