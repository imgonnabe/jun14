package jun14;

import java.util.Arrays;
import java.util.Scanner;

// 가위바위보
/*
 * 1. 10번 게임을 한다.
 * 2. 사용자가 1 가위, 2 바위, 3 보 중 하나 선택
 * 3. 컴퓨터는 랜덤으로 1~3을 뽑아서 비교하기
 * 4. 승패를 저장한다.
 * 5. 10번 게임이 끝나면 승률을 출력한다.
 * 예) 5승 2패 3비김  승률: 75%
 */
public class Test01 {
	public static void main(String[] args) {
		int[] arr01 = new int[10];
		String[] arr02 = new String[10];
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("숫자를 입력하세요.");
			arr01[i] = sc.nextInt();
			temp = (int) (Math.random() * 3) + 1;

			if (arr01[i] == 1 && temp == 2 || arr01[i] == 2 && temp == 3 || arr01[i] == 3 && temp == 1) {
				System.out.println("패");
				arr02[i] = "패";

			} else if (arr01[i] == 1 && temp == 3 || arr01[i] == 2 && temp == 1 || arr01[i] == 3 && temp == 2) {
				System.out.println("승");
				arr02[i] = "승";

			} else if (arr01[i] == 1 && temp == 1 || arr01[i] == 2 && temp == 2 || arr01[i] == 3 && temp == 3) {
				System.out.println("비김");
				arr02[i] = "비김";

			}
		}

		System.out.println(Arrays.toString(arr02));
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;

		for (int i = 0; i < arr02.length; i++) {
			if (arr02[i] == "승") {
				sum++;

			} else if (arr02[i] == "패") {
				sum2++;
			} else {
				sum3++;
			}
		}
		System.out.println(sum + "승 " + sum2 + "패 " + sum3 + "비김 ");
		System.out.println("승률: " + (int)((double)sum / 10 * 100) + "%");
		
		sc.close();

	}

}
