package study01.ch7;

public class DriverExam {
	public static void main(String[] args) {
		Driver dr = new Driver();
		Bus bus = new Bus();
		Taxi tx = new Taxi();
		Vehicle vh = new Vehicle();
		
		dr.drive(bus);
		dr.drive(tx);
		dr.drive(vh); 
		
		//�Ű����� �ڵ� Ÿ�� ��ȯ.
	}
}
