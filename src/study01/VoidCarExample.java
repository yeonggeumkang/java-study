package study01;

public class VoidCarExample {

	public static void main(String[] args) {
		VoidCar myCar = new VoidCar();
		myCar.setGas(5); 
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.\n");
			myCar.run();
			System.out.println("운행종료.");
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("가스를 주입할 필요가 없습니다.");
		} else {
			System.out.println("가스를 주입하세요.");
		}

	}

}
