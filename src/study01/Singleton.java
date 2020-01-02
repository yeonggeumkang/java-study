package study01;

public class Singleton {
	//�� �ϳ��� ��ü�� ������ �� �ִ� Ŭ���� : �̱���
	// �����ڸ� �ܺο��� ȣ���� �� ����� �ϹǷ� �����ڿ� private ���� �����ڸ� ���δ�.
	
	private static Singleton singleton = new Singleton();
	
	//������
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
