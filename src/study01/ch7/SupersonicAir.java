package study01.ch7;

public class SupersonicAir extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			//부모 클래스의 FLY메소드 호출
			super.fly();
			
		}
	}
}
