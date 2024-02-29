package t2_switch_case;

import java.util.Scanner;

public class Test5_3 {
	public static void main(String[] args) {
		
	//직급코드를 입력받아 직급별 명칭을 출력하시오.
	/*
	직급코드 1 : 부장, 본봉 : 5000000
	직급코드 2 : 과장, 본봉 : 4000000
	직급코드 3 : 대리, 본봉 : 3000000
	직급코드 4 : 사원, 본봉 : 2000000
	
	시간수당(sudang) : 시간(hour)을 입력받아서 1시간당 25000원으로 계산한다.
	공제액(gongje) : (본봉(bonbong) + 수당)의 10%로 한다.
	실수령액(netpay)을 구하시오.
	단, 실수령액 = (본봉 + 수당) - 공제액
	
	*/
		Scanner sc = new Scanner(System.in);
		
		int code, hour, bonbong = 0, gongje, hap, netpay;
		String jikkub;
		
		System.out.print("직급코드를 입력하세요.(1:부장, 2:과장, 3:대리, 4:사원): ");
		code = sc.nextInt();
		System.out.print("초과시간을 입력하세요.(숫자만 적어주세요): ");
		hour = sc.nextInt();
		
		switch(code) {
			case 1: //1번이랑 같냐는 뜻 | case 뒤에 실수, 비교 사용불가
				jikkub = "부장";
				bonbong = 5000000;
				break; // 1번이 맞으면 여기서 끝내라는 뜻
			case 2:
				jikkub = "과장";
				bonbong = 4000000;
				break;
			case 3:
				jikkub = "대리";
				bonbong = 3000000;
				break;
			case 4:
				jikkub = "사원";
				bonbong = 2000000;
				break;
			default: // 모두 어긋나면 default 를 수행한다
				jikkub = "비사원";
				bonbong = 0;
		}
		
		hap = bonbong + (hour * 25000);
		gongje = (int)(hap * 0.1); // /10 해도 상관없음
		netpay = hap - gongje;
		
		System.out.println("입력하신 코드 "+code+"는 "+jikkub+"이고, 본봉은 "+bonbong+", 실수령액은 "+netpay+ "입니다.");
		
		sc.close();
		
	}
}
