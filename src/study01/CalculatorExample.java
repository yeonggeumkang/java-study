package study01;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		myCal.powerOn();
		myCal.powerOff();
		
		//매개변수의 수를 모를 경우 exam(p.220)
		int[] values1 = {1,2,3};
		int result1 = myCal.sum1(values1);
		System.out.println("result1 : "+result1);
		
		int result2 = myCal.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2 : "+result2);
		
		int result3 = myCal.sum2(1,2,3);
		System.out.println("result3 : "+result3);
		
	}
}
