package exam;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * 1~100까지의 숫자중 2의 배수의 개수와 3의 배수의 개수와 5의 배수의 개수를 구하시오. 단, 중복되는 배수인 경우는 작은 숫자에
		 * 한번만 누적처리하시오.
		 * 
		 * 이때 2의 배수의 합과 3의 배수의 합을 더해서 5의 배수의 합을 뺀 결과도 마지막에 출력하시오.
		 */

		// 누적은 무조건 초기값을 줘야 함
		int i = 0, cnt2=0, cnt3=0, cnt5=0, tot2=0, tot3=0, tot5=0;
		
		while(i < 100) { // i를 1로 줬다면 <= 기호
			i++;
			if(i % 2 == 0) {
				cnt2++;
				tot2 += i;
			}
			else if(i % 3 == 0) {
				cnt3++;
				tot3 += i;
			}
			else if(i % 5 == 0) {
				cnt5++;
				tot5 += i;
			}
		}
		System.out.println("2의 배수의 개수 : " + cnt2);
		System.out.println("3의 배수의 개수 : " + cnt3);
		System.out.println("5의 배수의 개수 : " + cnt5);
		System.out.println("2의 배수 + 3의 배수 - 5의 배수 : " + (tot2 + tot3 - tot5));
	}
}
