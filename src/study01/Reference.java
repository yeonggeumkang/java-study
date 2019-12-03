package study01;

public class Reference {
	public static void main(String[] args) {
		String var1 = "영금";
		String var2 = "영금";
		String var3 = new String("영금");
		String var4 = "영금";
		//여기서 var1,2,4는 같고 var3은 다름 (==기준)
		//문자열 비교할 때에는 다음과 같이
		boolean result0 = (var2==var4);
		boolean result = var1.equals(var3);
		System.out.println(result0 +" "+ result);
		
		//5.6 배열타입(p.149)
		
		//여러가지 선언 방법
		int intArray[];
		int[] intArray2;
	
		String[] strArray = null;
		int intArray3[] = {0,1,2,3};
		
		strArray = new String[] {"일", "이","삼"};
		strArray[0] = "영으로 바꿈";
		
		//다차원배열
		int[][] scores = new int[2][3];
		scores[0] = new int[2];
		scores[1] = new int[3];
		
		int[][] scores2 = {{90,88}, {100,70}};
		
		//객체를 참ㅈ모하느 배열 (String) 문자열이 아닌 문자열이 저장된 string 객체의 주소를 저자함
		strArray = new String[] {"java", "C++", "C#"};
		
	
	}

}
