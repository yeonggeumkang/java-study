package study01;

public class Reference {
	public static void main(String[] args) {
		String var1 = "����";
		String var2 = "����";
		String var3 = new String("����");
		String var4 = "����";
		//���⼭ var1,2,4�� ���� var3�� �ٸ� (==����)
		//���ڿ� ���� ������ ������ ����
		boolean result0 = (var2==var4);
		boolean result = var1.equals(var3);
		System.out.println(result0 +" "+ result);
		
		//5.6 �迭Ÿ��(p.149)
		
		//�������� ���� ���
		int intArray[];
		int[] intArray2;
	
		String[] strArray = null;
		int intArray3[] = {0,1,2,3};
		
		strArray = new String[] {"��", "��","��"};
		strArray[0] = "������ �ٲ�";
		
		//�������迭
		int[][] scores = new int[2][3];
		scores[0] = new int[2];
		scores[1] = new int[3];
		
		int[][] scores2 = {{90,88}, {100,70}};
		
		//��ü�� �������ϴ� �迭 (String) ���ڿ��� �ƴ� ���ڿ��� ����� string ��ü�� �ּҸ� ������
		strArray = new String[] {"java", "C++", "C#"};
		
	
	}

}
