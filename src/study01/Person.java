package study01;

public class Person {
	
	final String nation = "Korea"; //final ��ü�� ���� Ȯ����, ���Ŀ� ������ �� ����.
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn; //���⼭ �ʱⰪ �����ϸ� ���Ŀ� ���� �Ұ�
		this.name = name;
	}

}
