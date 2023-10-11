package calc;

import java.util.Arrays;

public class Calc {
	// 필드
	// 생성자
	// 메소드
	int plus(int num1, int num2) {
		System.out.println("출력문: 계산을 시작합니다.");
		return num1 + num2;

	}

	public static void main(String[] args) {
		Calc calc = new Calc();

		String name = "가나다라마";
		int result = calc.plus(15, name.length());
		System.out.println(result);// 출력문: 계산을 시작합니다. 20

		Lotto lotto = new Lotto();
		lotto.choose();
		// lotto.sort();
		// lotto.print();

	}

}

class Lotto {
	int[] lottoNum = new int[6];

	// 로또 번호 뽑는 메소드
	public int[] choose() {
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (lottoNum[i] == lottoNum[j]) {
					i--;
					break;
				}
			}
		}
		return sort();

	}

	public int[] sort() {
		Arrays.sort(lottoNum);
		return print();
	}

	public int[] print() {
		for (int i = 0; i < lottoNum.length; i++) {
			System.out.print(lottoNum[i]);
			System.out.print(", ");
		}
		return lottoNum;
	}
}
