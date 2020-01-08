package study01;

public class CarGS {

	//필드
	private int speed;
	private boolean stop;
	
	//생성자
	
	//메소드
	
	//Getter 
	public int getSpeed() {
		return speed;
	}
	
	//Setter
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return; //메소드 종료 
		} else {
			this.speed = speed;
		}
	}
	
	
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
