package study01;

public class VoidCarExample {

	public static void main(String[] args) {
		VoidCar myCar = new VoidCar();
		myCar.setGas(5); 
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�.\n");
			myCar.run();
			System.out.println("��������.");
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("������ ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("������ �����ϼ���.");
		}

	}

}
