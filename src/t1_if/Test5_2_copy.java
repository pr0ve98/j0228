package t1_if;

import java.util.Scanner;

public class Test5_2_copy {
	public static void main(String[] args) {
		
	//직급코드를 입력받아 직급별 명칭을 출력하시오.
	/*
	직급코드 1 : 부장, 본봉 : 4900000
	직급코드 2 : 과장, 본봉 : 3400000
	직급코드 3 : 대리, 본봉 : 2900000
	직급코드 4 : 사원, 본봉 : 2200000
	직급코드 5 : 인턴, 본봉 : 1900000
	
	시간수당(sudang) : 시간(hour)을 입력받아서 1시간당 13000원으로 계산한다.
	공제액(gongje) : (본봉(bonbong) + 수당)의 10%로 한다.
	실수령액(netpay)을 구하시오.
	단, 실수령액 = (본봉 + 수당) - 공제액
	
	*/
		Scanner sc = new Scanner(System.in);
		
		int sudang, hour, gongje, netpay, code;
		
		System.out.print("직급코드를 입력하시오. (1: 부장, 2: 과장, 3: 대리, 4: 사원, 5: 인턴): ");
		code = sc.nextInt();
		
		
		sc.close();
		
	}
}
