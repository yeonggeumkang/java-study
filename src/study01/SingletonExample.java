package study01;

public class SingletonExample {
	
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		//�����ڷ� ������ �� ���� �̷��� getInstance�� ��ü�� �����;߸� ��.
		
		if(obj1 == obj2) {
			System.out.println("���� �̱��� ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� �̱��� ��ü�Դϴ�.");
		}
		
		//getInstance�� �ϳ��� �̱��� ��ü�� �����ϹǷ� obj1�� obj2�� ���� �ν��Ͻ��� ������ ����.
	}

}
