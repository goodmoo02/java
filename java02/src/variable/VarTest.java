package variable;

public class VarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte time = 15; // = ���Կ�����, �Ҵ翬����
		// ������Ÿ�� ������ = ��;
		int seconds = 51245315;
		
		final double PI = 3.14123457; // ��� (final)�� ������, ���������� ���Ŀ� ������� �ʴ´�. �Ϲ�������, ��� �������� �빮�ڷ� ǥ����.
		// PI = 3; //(error �߻�); ����� ���� ������ �� ����.
		
		char lastName = '��';
		boolean lunch = true;
		
		// �� ���� �̻� - ��ƹ��� ��Ʈ��(String, ���ڿ�)
		
		String name = "��ƹ���"; // String => "" �⺻���� �ƴϹǷ�, ù���ڰ� �빮����.
		
		System.out.println("���� ������ " + time + "�� �Դϴ�.");
		System.out.println("���� " + seconds + "�� ��� �߽��ϴ�.");
		System.out.println("PI�� ���� " + PI + " �Դϴ�.");
		System.out.println("���� " + lastName + "�� �Դϴ�.");
		System.out.println("���� ������ �Ծ���: " + lunch);
		System.out.println("���� ��ü �̸��� " + name + " �Դϴ�.");
		
		
	}

}
