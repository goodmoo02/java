package control;

import java.lang.*; // java/lang/ ���� ���� ��� ���(��ǰ)�� ���ڴٴ� �ǹ�. - �⺻������ �� ����.  1. package 2. import 3. class
import java.util.Date; // java/util/ ���� - ���� ����� ��Ƶ� ����
import java.util.Calendar;
public class ObjectTest {

	public static void main(String[] args) {
		// ��ü ���� ��� - ��ǰ�� ���� ����� ����. ( �� ����� ���ε��� ���� ����.)
		Date date = new Date(); // ���� import �� ��ǰ�� �� ���� (new)�� �ٿ�  Date()�� �����Ѵ�.
//		Calendar calendar = new Calendar();
		int hour = date.getHours(); // declarecated? �� ���� ����� �ִٴ� �ǹ�.
		int minute = date.getMinutes();
		int second = date.getSeconds();
		int month = date.getMonth();
		int year = date.getYear(); // 1900���� �������� ����.
		int week = date.getDay(); // 1 - ������, 2 - ȭ����, 3 - ������ ...
		int day = date.getDate();
		day = 
		System.out.println("���� �ð��� " + hour);
		System.out.println("����� " + (1900 + year) + "�� " + month + "�� " + day + "�� " + hour + "�� " + minute + "�� " + second + "�� �Դϴ�.");
		
	}

}
