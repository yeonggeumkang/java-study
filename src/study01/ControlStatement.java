package study01;

public class ControlStatement {
	public static void main(String[] args) throws Exception {
		//4�� switch��(p119)
		String position = "����";
		
		switch(position) {
			case"����":
				System.out.println("������ 700����");
				break;
			case "����":
				System.out.println("������ 500����");
				break;
			default:
				System.out.println("300����");
		}
		
		//for�� : 1���� 10���� ���
		for(int i=1; i<=10; i++) {
			System.out.print(i);
		}
		
		/*for�� �ʱ�ȭ�� ����
		int i=1;
		for(; i<20; i++) {
			System.out.print(i);
		}*/
		
		//for�� : �ʱ�ȭ��; ���ǽ�; ������ : ������ ���� �� ����
		System.out.println();
		for (int i=1,j=10; i<=15 || j>0; i++, j--) {
			System.out.println(i+" "+j);
		}
		
		//while�� : while�� ���� ������ ���� ���� �̸� �����ؾ߸� ��!!!!!###
		int i=1;
		while(i<10) {
			System.out.print(i);
			i++;
		}
		
		//Ű����� while�� ���� (p.127)
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if (keyCode !=13 && keyCode!= 10) {
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("����: ");
			}
			
			keyCode = System.in.read(); //Ű������ Ű �ڵ带 ����
			
			if (keyCode == 49) {
				speed++;
				System.out.println("����ӵ� :"+speed);
			} else if (keyCode == 50) {
				speed--;
				System.out.println("����ӵ� :"+speed);
			} else if (keyCode == 51) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

}
