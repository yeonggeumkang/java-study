package study01;

public class SingletonExample {
	
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		//생성자로 생성할 수 없고 이렇게 getInstance로 객체를 가져와야만 함.
		
		if(obj1 == obj2) {
			System.out.println("같은 싱글톤 객체입니다.");
		} else {
			System.out.println("다른 싱글톤 객체입니다.");
		}
		
		//getInstance는 하나의 싱글톤 객체를 리턴하므로 obj1과 obj2는 같은 인스턴스를 가지고 있음.
	}

}
