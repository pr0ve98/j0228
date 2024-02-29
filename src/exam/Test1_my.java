package exam;

public class Test1_my {
	public static void main(String[] args) {

		/*
		 * 1~100까지의 숫자중 2의 배수의 개수와 3의 배수의 개수와 5의 배수의 개수를 구하시오. 단, 중복되는 배수인 경우는 작은 숫자에
		 * 한번만 누적처리하시오.
		 * 
		 * 이때 2의 배수의 합과 3의 배수의 합을 더해서 5의 배수의 합을 뺀 결과도 마지막에 출력하시오.
		 */
		
		// 선생님 피드백: 좋아요
		

		int i = 0;
		int two = 0, three = 0, five = 0, cnt2 = 0, cnt3 = 0, cnt5 = 0;

		while (i <= 100) {
			i = i + 1;
			if (i % 2 == 0) {
				cnt2 = cnt2 + 1;
				two = two + i;
			} else if (i % 3 == 0) {
				cnt3 = cnt3 + 1;
				three = three + i;
			} else if (i % 5 == 0) {
				cnt5 = cnt5 + 1;
				five = five + i;
			}
		}

		System.out.println("2의 배수 개수는" + cnt2);
		System.out.println("3의 배수 개수는" + cnt3);
		System.out.println("5의 배수 개수는" + cnt5);

		int res = two + three - five;
		System.out.println("(2의 배수의 합) + (3의 배수의 합) - (5의 배수의 합): " + res);
	}
}