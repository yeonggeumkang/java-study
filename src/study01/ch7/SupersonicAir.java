package study01.ch7;

public class SupersonicAir extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		} else {
			//�θ� Ŭ������ FLY�޼ҵ� ȣ��
			super.fly();
			
		}
	}
}
