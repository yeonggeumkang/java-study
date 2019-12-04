package study01;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
	
		Student s2 = new Student();
		System.out.println("s2변수가 또다른 stu 객체를 참조합니다.");
		//이 main method는 Student.java 파일에 포함되어도 되지만
		// 실제 프로그래밍에서는 다른 java파일에 존재하는 경우가 많다.
		// => 라이브러리와 실행 클래스의 분리.
	}
}
