package study01;

public class CarGS {

	//�ʵ�
	private int speed;
	private boolean stop;
	
	//������
	
	//�޼ҵ�
	
	//Getter 
	public int getSpeed() {
		return speed;
	}
	
	//Setter
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return; //�޼ҵ� ���� 
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
