package study01;

public class Hello {
	public static void main(String[] agrs) {
		
		//1강 Hello.java
		System.out.println("Hello, world!");
		
		//2강 변수 선언과 초기화(p35)
		int value=10;
		int result = value+10;
		System.out.println(result);
		
		//변수의 사용 범위 : 변수는 선언된 블록 내에서만 사용 가능
		int v1 = 15;
		if(v1>10) {
			int v2 = v1-10;
			System.out.println("v2="+v2);
		}
		//int v3 = v1+v2+5;
		
		//char타입 변수의 유니코드
		char c1 = 'A';
		int uniCode = c1;
		int uniCode2 = 'B';
		System.out.println(uniCode+" "+uniCode2);
		
		//3강 증감연산자(++,--)
		int x=1;
		int y=1;
		int result1 = ++x + 10;
		int result2 = y++ + 10;
		System.out.println(result1+" "+result2);
		System.out.println(y);
			//++x는 다른 연산 수행 전에 증가시키고, y++은 연산 수행 후에 증가시킴.
		
		//3장 삼항 연산자(p101)
		int score = 100;
		char grade = (score>90)?'A' : (score>80)?'B' : 'C';
		System.out.println(score+"점은 "+grade+"등급입니다.");		
		
	}

}
