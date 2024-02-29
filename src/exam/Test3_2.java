package exam;

import java.util.Scanner;

public class Test3_2 {
	public static void main(String[] args) {
		
		/* 2자리 숫자를 입력받아서, 입력받은 숫자를 거꾸로 1이될때까지 출력하되, 
		한줄에 5개씩 출력하는 프로그램을 만드시오.(음수도 고려하시오)
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int su, cnt = 0;
		
		System.out.print("두자리 수를 입력하세요. : ");
		su = sc.nextInt();
		
		// 양수일 때 처리
		if(su >= 10) {
		while(su >= 1) {
		System.out.print(su + "\t"); // \t tab만큼 떨어지게 만드는 명령어
		// 출력을 먼저 하고 감소를 해야 su의 값도 출력되니까 출력먼저!	
			su--;
			cnt++;
			if(cnt % 5 ==0) System.out.println();
			}
		}
		
		//음수일 때 처리
		if(su <= -10) {
			while(su <= 1) {
				System.out.print(su + "\t"); // \t tab만큼 떨어지게 만드는 명령어
				// 출력을 먼저 하고 감소를 해야 su의 값도 출력되니까 출력먼저!	
				su++;
				cnt++;
				if(cnt % 5 ==0) System.out.println();
			} // 결과가 1까지 나오는 이유는 문제에서 1까지 출력하라고 했으므로
		}
		sc.close();
	}
}
