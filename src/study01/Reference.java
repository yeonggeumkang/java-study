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
		
		//�迭 : Ÿ��[] ������; Ȥ�� Ÿ�� ������[]; ���� �����Ѵ�
		int[] intArray = {0,1,2,3};
		String strArray[] = null; //������ ��ü�� ������ null�ʱ�ȭ�� ����
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}

}
