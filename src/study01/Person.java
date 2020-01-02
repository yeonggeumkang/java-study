package study01;

public class Person {
	
	final String nation = "Korea"; //final 객체는 값을 확정함, 이후에 변경할 수 없음.
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn; //여기서 초기값 저장하면 이후에 수정 불가
		this.name = name;
	}

}
