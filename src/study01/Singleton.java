package study01;

public class Singleton {
	//단 하나의 객체만 생성될 수 있는 클래스 : 싱글톤
	// 생성자를 외부에서 호출할 수 없어야 하므로 생성자에 private 접근 제한자를 붙인다.
	
	private static Singleton singleton = new Singleton();
	
	//생성자
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
