package study01;

public class Enumeration {
	// 한정된 값만을 갖는 데이터 타입 : 열거 타입
	// 몇개으 ㅣ열거 상수( constant)중에서 하나의 상수를 저장한다.
	public static void main(String[] args) {
		Week today = Week.TUESDAY;
		Week birthday;
		System.out.println(today.ordinal()==1);
		System.out.println(today.name() == "TUESDAY");
		System.out.println(today.name() == "TuesdAY");

	}
}
