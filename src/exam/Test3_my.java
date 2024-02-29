package exam;

import java.util.Scanner;

public class Test3_my {
	public static void main(String[] args) {
		
		// 2자리 숫자를 입력받아서, 입력받은 숫자를 거꾸로 1이될때까지 출력하되, 한줄에 5개씩 출력하는 프로그램을 만드시오.
	
		// 선생님 피드백: 19번에서 27번은 내어쓰기하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int su = 0, count = 0;
		
		System.out.print("숫자를 입력하시오. (두자리): ");
		su = sc.nextInt();
		
		while (su >= 1) {
			count = count + 1;
			if(count < 5) {
				System.out.print(su + " ");
			}
			else if(count == 5) {
				System.out.println(su);
				count = 0;
			}
			su = su - 1;
		
		}
		
		sc.close();
	}
}