package study01;

public class Calculator {
	
	//6.8�޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�");
	}
	
	//�Ű������� ���� �� ���(p.219) : �Ű� ������ �迭 Ÿ������ �����Ѵ�.
	// ... ����ؼ� �����ϸ�, �ڵ����� �迭�� �����Ǿ� �Ű������� �Ѱ���.
	int sum1(int[] values) {
		int sum = 0;
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	//���簢���� ����
	double areaRectangle(double width) {
		return width*width;
	}
	
	double areaRectangle(double width, double height) {
		return width*height;
	}
}
