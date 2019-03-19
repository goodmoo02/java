package cal;

public class CalTest2 {

	public static void main(String[] args) {
		// 한 줄 지우기 ctrl + d
		
		// 산술 연산자
		int x = 200;
		int y = 100;
		System.out.println("두 수의 합은 :" + x + y + " 입니다."); // string이 있을 때는 연결 연산자 뒤에 int가 나와도 string 취급이 된다.
		System.out.println("두 수의 합은 :" + (x + y) + " 입니다."); // string이 있을 때는 산술연산자를 먼저 우선시 두기 위해 괄호로 우선순위를 둔다.
		System.out.println("두 수의 차은 :" + (x - y) + " 입니다."); // string이 있을 때는 산술연산자를 먼저 우선시 두기 위해 괄호로 우선순위를 둔다.
		System.out.println("두 수의 곱은 :" + (x * y) + " 입니다."); // string이 있을 때는 산술연산자를 먼저 우선시 두기 위해 괄호로 우선순위를 둔다.
		System.out.println("두 수의 나눗셈은 :" + (x / y) + " 입니다."); // string이 있을 때는 산술연산자를 먼저 우선시 두기 위해 괄호로 우선순위를 둔다.
		// 복사, 붙여넣기 - ctrl + alt + 화살표
		// 이동 - alt + 화살표
		
	}
}
