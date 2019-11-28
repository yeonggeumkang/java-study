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
		
		//배열 : 타입[] 변수명; 혹은 타입 변수명[]; 으로 생성한다
		int[] intArray = {0,1,2,3};
		String strArray[] = null; //참조할 객체가 없으면 null초기화로 생성
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}

}
