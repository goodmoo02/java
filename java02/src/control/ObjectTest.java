package control;

import java.lang.*; // java/lang/ 폴더 안의 모든 기능(부품)을 쓰겠다는 의미. - 기본값으로 들어가 있음.  1. package 2. import 3. class
import java.util.Date; // java/util/ 폴더 - 편리한 기능을 모아둔 폴더
import java.util.Calendar;
public class ObjectTest {

	public static void main(String[] args) {
		// 객체 지향 언어 - 부품을 갖다 끼우는 형태. ( 각 기능을 따로따로 끼워 넣음.)
		Date date = new Date(); // 새로 import 한 부품을 쓸 때는 (new)를 붙여  Date()를 복사한다.
//		Calendar calendar = new Calendar();
		int hour = date.getHours(); // declarecated? 더 좋은 기능을 있다는 의미.
		int minute = date.getMinutes();
		int second = date.getSeconds();
		int month = date.getMonth();
		int year = date.getYear(); // 1900년을 기준으로 나옴.
		int week = date.getDay(); // 1 - 월요일, 2 - 화요일, 3 - 수요일 ...
		int day = date.getDate();
		day = 
		System.out.println("현재 시각은 " + hour);
		System.out.println("현재는 " + (1900 + year) + "년 " + month + "월 " + day + "일 " + hour + "시 " + minute + "분 " + second + "초 입니다.");
		
	}

}
