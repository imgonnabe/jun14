package jun14;

// 사람 만들기
class Human {
	// 필드
//	String name;
//	int age;
//	String addr;
//	String ssn;

	// 생성자
	// 메소드: 되돌려주는 타입, void는 되돌려주는 값이 없을 때
	public Human what() {
		return new Human();
	}

	public boolean eat() {
		return 1 + 1 == 3;
	}

	public int sleep() {
		int num1 = 10;
		int num2 = 20;
		return num1 + num2;
	}

	public void work() {
		System.out.println(name+"Zzzzz");
		String ng = "홍길동";
		name = ng;
		System.out.println(name);

	}
	String name;
	int age;
	String addr;
	String ssn;
}

public class CM01 {
	public static void main(String[] args) {
		int num1 = 10;// 지역변수
		System.out.println(num1);// 10
		
		Human human = new Human();
		human.eat();// 인스턴스.메소드명();
		human.sleep();
		human.toString();// Object(최상위 타입)에 있다.

		System.out.println(human.sleep());// 30
		//System.out.println(human.work());// void타입이라서 return값이 없다.
		
		System.out.println(human.name);// null
		human.work();// nullZzzzz 홍길동
		System.out.println(human.name);// 홍길동
		
		int[] arr = new int[5];
		System.out.println(arr.length);
		String name = "가나다라";
		System.out.println(name.length());
		
		Apple a1 = new Apple();
		System.out.println(a1.age);
	}

}
