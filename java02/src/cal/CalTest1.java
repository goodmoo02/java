package cal;

public class CalTest1 {

	public static void main(String[] args) {
		//String id = "root"; // �� ������ ��� �Ұ� . �� �����ڴ� ������ �񱳸� �� �� �ִ�.
		
		int id = 1000; 
		int pw = 1111;
		
		if ((id == 1000) && (pw == 1111)) {
			// ������ �񱳿������� ����� ������, boolean true, Ʋ���� false
			// true �� ��, ����.
			System.out.println("�α��� ���...ok..");
		}
		else if (id == 700) {
			System.out.println("����");
		}
		else {
			System.out.println("�α��� ����...not..");
		}
		// �� ������: ������ �� �¾ƾ� true (and, &&), ������ �ϳ��� ������ true(or, ||)
		
		// <���α׷� ��ü ����>
		// ���α׷��� ���������� ������ �⺻.
		// ���ǿ� ���� �ٸ��� �б��ؼ� ó��(���ǹ�: if, if~else),
		// ���ǿ� ���� �ݺ��ؼ� ó��(�ݺ���: for, while),
		// while(true){   ���ѹݺ�
		// 			if(����) break;}  ���ѹݺ� Ż��
		
		// �Է�
		// ���
	}
}
