package study01;

public class CalculatorS6 {
	
	//�ν��Ͻ� ���� - ��ü(�ν��Ͻ�)���� �ʿ��ϹǷ�
	String color;
	static double bi = 3.14159; //�ν��Ͻ� ���� �ʿ����� �ʰ�, Ŭ���� ��ü���� ����ȴٸ� ���� �ʵ�� �����Ѵ�.
	
	//�ν��Ͻ� �޼ҵ� ����
	void setColor(String color) {
		this.color = color;
	}
	
	//���� �޼ҵ� ����
	static int plus(int x, int y) {
		return x+y;
	}
	
	
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	//����� �ʿ��� �ʱ�ȭ �۾��� ���� ����� ����Ѵ�
	static {
		// Ŭ������ �޸𸮷� �ε��� �� �ڵ������� ����Ǵ� ����.
		info = company+"-"+model;
	}
	
	//main �޼ҵ� ���� static �����̹Ƿ�, Ŭ���� �ε� �� �ڵ� ���� (��. �Ϲ����� ���� �ڵ� ����)
	
}
