package jun14;

// split
import java.util.Arrays;

// 클래스를 선언
class Apple{
	// 필드 = 변수 = 인스턴스 변수 = 초기화하지 않아도 쓸 수 있다.
	String color;// 선언 전부터 사용가능
	int age;
	
	// 생성자 = 인스턴스를 발생하기 위한 코드 = 메소드
	public Apple() {// 클래스명과 동일
		
	}
	
	// 메소드
	// 지역변수는 초기화해야 한다. = 선언 + 값 대입까지 완료
	public void info() {
		System.out.println("색상: " + color);
		System.out.println("나이: " + age);
	}
	
}
public class String03 {
	public static void main(String[] args) {
		// String 클래스 속 split()메소드이다.
		// 지정된 형태를 찾아 자른다.
		String tel = "010-1234-5678";
		// tel.split("자를 기호"); > String 배열형태로 나온다.
		String[] telSplit = tel.split("-");// - 를 자를 기호로 사용
		System.out.println(Arrays.toString(telSplit));// [010, 1234, 5678]
		
		String pet = "R2D2가,배고프다고,합니다.";
		String[] petSplit = pet.split(",");
		System.out.println(Arrays.toString(petSplit));
		
		String test = "가 나다 라마 바 사아자 차카 타파 하";
		String[] splitTest = test.split(" ");
		System.out.println(Arrays.toString(splitTest));
		System.out.println(splitTest[4]);// 사아자
		
		// 인스턴스 만들기
		// 데이터타입 변수명 = 값;
		int num = 100;
		Apple apple = new Apple();
		Apple apple2 = new Apple();
		
		apple.color = "빨강";
		apple.info();// 색상: 빨강  나이: 0
		apple.age = 10;
		
		System.out.println(apple2.color);// null
		System.out.println(apple2.age);// 0
	}

}
