package cal;

public class CalTest1 {

	public static void main(String[] args) {
		//String id = "root"; // 비교 연산자 사용 불가 . 비교 연산자는 기초형 비교만 할 수 있다.
		
		int id = 1000; 
		int pw = 1111;
		
		if ((id == 1000) && (pw == 1111)) {
			// 조건은 비교연산자의 결과가 맞으면, boolean true, 틀리면 false
			// true 일 때, 실행.
			System.out.println("로그인 허락...ok..");
		}
		else if (id == 700) {
			System.out.println("예외");
		}
		else {
			System.out.println("로그인 불허...not..");
		}
		// 논리 연산자: 조건이 다 맞아야 true (and, &&), 조건이 하나라도 맞으면 true(or, ||)
		
		// <프로그램 전체 제어>
		// 프로그램은 순차적으로 실행이 기본.
		// 조건에 따라 다르게 분기해서 처리(조건문: if, if~else),
		// 조건에 따라 반복해서 처리(반복문: for, while),
		// while(true){   무한반복
		// 			if(조건) break;}  무한반복 탈출
		
		// 입력
		// 제어문
	}
}
