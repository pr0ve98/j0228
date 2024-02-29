package exam;

import java.util.Scanner;

public class Test2_my {
	public static void main(String[] args) {

		/*
		 * 두개의 숫자를 입력받아서 두개 숫자 사이에 값들을 모두 더하는 프로그램을 작성하되, 이때 5개항씩 그 결과를 출력시켜주시오. (마지막에
		 * 남은 값이 있으면 그합까지도 마지막에 출력할수 있어야함) 여기서 두개의 숫자는 임의의 숫자를 입력할수 있기에 첫번째숫자가 더 큰 숫자가
		 * 먼저 입력될수도 있다.
		 */

		// 선생님 피드백: 수업시간에 배운 두수 교환을 활용해보세요.
		
		Scanner sc = new Scanner(System.in);

		int tot = 0, i = 0, count = 0;
		int num1 = 0;

		System.out.print("첫번째 숫자를 입력하시오. ");
		num1 = sc.nextInt();

		int num2 = 0;

		System.out.print("두번째 숫자를 입력하시오. ");
		num2 = sc.nextInt();

		if (num1 < num2) {
			i = num1;
			while (i <= num2) {
				tot = tot + i;
				count = count + 1;
				if ((count % 5) == 0) {
					System.out.println((i - 4) + " ~ " + i + " 합은 " + tot + " 입니다.");
					tot = 0;
					count = 0;
				}
				i = i + 1;
			}
		} else {
			i = num2;
			while (i <= num1) {
				tot = tot + i;
				count = count + 1;
				if ((count % 5) == 0) {
					System.out.println((i - 4) + " ~ " + i + " 합은 " + tot + " 입니다.");
					tot = 0;
					count = 0;
				}
				i = i + 1;
			}
			System.out.println((i - (i-(-1))) + " ~ " + i + " 합은 " + tot + " 입니다.");
		}

		sc.close();

	}
}