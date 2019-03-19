package variable;

public class VarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte time = 15; // = 대입연산자, 할당연산자
		// 데이터타입 변수명 = 값;
		int seconds = 51245315;
		
		final double PI = 3.14123457; // 상수 (final)이 붙으면, 고정값으로 이후에 변경되지 않는다. 일반적으로, 상수 변수명은 대문자로 표현함.
		// PI = 3; //(error 발생); 상수는 값을 변경할 수 없다.
		
		char lastName = '김';
		boolean lunch = true;
		
		// 한 글자 이상 - 김아무개 스트링(String, 문자열)
		
		String name = "김아무개"; // String => "" 기본형이 아니므로, 첫글자가 대문자임.
		
		System.out.println("지금 시작은 " + time + "시 입니다.");
		System.out.println("현재 " + seconds + "초 경과 했습니다.");
		System.out.println("PI의 값은 " + PI + " 입니다.");
		System.out.println("성은 " + lastName + "씨 입니다.");
		System.out.println("나는 점심을 먹었다: " + lunch);
		System.out.println("나의 전체 이름은 " + name + " 입니다.");
		
		
	}

}
