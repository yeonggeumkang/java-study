package study01;

public class Hello {
	public static void main(String[] agrs) {
		
		//1�� Hello.java
		System.out.println("Hello, world!");
		
		//2�� ���� ����� �ʱ�ȭ(p35)
		int value=10;
		int result = value+10;
		System.out.println(result);
		
		//������ ��� ���� : ������ ����� ��� �������� ��� ����
		int v1 = 15;
		if(v1>10) {
			int v2 = v1-10;
			System.out.println("v2="+v2);
		}
		//int v3 = v1+v2+5;
		
		//charŸ�� ������ �����ڵ�
		char c1 = 'A';
		int uniCode = c1;
		int uniCode2 = 'B';
		System.out.println(uniCode+" "+uniCode2);
		
		//3�� ����������(++,--)
		int x=1;
		int y=1;
		int result1 = ++x + 10;
		int result2 = y++ + 10;
		System.out.println(result1+" "+result2);
		System.out.println(y);
			//++x�� �ٸ� ���� ���� ���� ������Ű��, y++�� ���� ���� �Ŀ� ������Ŵ.
		
		//3�� ���� ������(p101)
		int score = 100;
		char grade = (score>90)?'A' : (score>80)?'B' : 'C';
		System.out.println(score+"���� "+grade+"����Դϴ�.");		
		
	}

}
