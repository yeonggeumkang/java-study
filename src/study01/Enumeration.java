package study01;

public class Enumeration {
	// ������ ������ ���� ������ Ÿ�� : ���� Ÿ��
	// ��� �ӿ��� ���( constant)�߿��� �ϳ��� ����� �����Ѵ�.
	public static void main(String[] args) {
		Week today = Week.TUESDAY;
		Week birthday;
		System.out.println(today.ordinal()==1);
		System.out.println(today.name() == "TUESDAY");
		System.out.println(today.name() == "TuesdAY");

	}
}
