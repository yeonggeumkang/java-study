package study01;

public class Car {
	
	//6.6.1 �ʵ� ����
	//maxSpeed ó�� �ʱⰪ�� �������� ���� ������, �������� ������ java�� �⺻ �ʱⰪ���� ������.
	
	
	//���� ������
	String company = "����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 300;
	
	//����
	int speed;
	
	
	//6.7������
	//��� Ŭ������ �����ڰ� �ϳ� �̻� �ݵ�� �����Ѵ�.
	// Ŭ���� ���� �����ڸ� ������ ��� �ڹ� �����Ϸ��� �⺻ �����ڸ� �ڵ� �߰���Ų��.
	
	//������(4)
	Car(String model, String color, int maxSpeed){
		//�����ڸ� ������ ���, ��ü ���� �� �⺻ ������ ȣ�� �Ұ�.
		this.model = model; //Ŭ������ �ʵ� �̸��� �Ű������� ���� ���� �ʵ� �տ� this�� ���δ�.
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//������ �����ε�
	//������(1)
	Car(){
		
	}
	
	//������(2)
	Car(String model){
		//this.model = model;
		//this.color = "����";
		//this.maxSpeed = 250;
		this(model, "����", 250); 
	}
	//������ ���� �� �Ű����� Ÿ���� �����ϸ� �� ��. �޶�� �ٸ� �����ڷ� �ν� ��.
	
	//������(3)
	Car(String model, String color){
		//this.model = model;
		//this.color = color;
		//this.maxSpeed = 250;
		this(model, color, 250);
	}
	//������ �����ε� �� �ߺ� �ڵ带 ���ϱ� ���� �����?
	//this�� ����ϴ� ��.
	//������(2) (3)���� this�� ��������ν� ������(4)�� ȣ���ϴ� ��
	
}