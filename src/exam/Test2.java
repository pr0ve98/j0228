package exam;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {

		/*
		 * 두개의 숫자를 입력받아서 두개 숫자 사이에 값들을 모두 더하는 프로그램을 작성하되, 이때 5개항씩 그 결과를 출력시켜주시오. (마지막에
		 * 남은 값이 있으면 그합까지도 마지막에 출력할수 있어야함) 여기서 두개의 숫자는 임의의 숫자를 입력할수 있기에 첫번째숫자가 더 큰 숫자가
		 * 먼저 입력될수도 있다.
		 */

		Scanner sc = new Scanner(System.in);
		
		int su1, su2;
		int tot = 0, cnt = 0;
		int temp = 0; // 교환할 때 값을 저장해줄 변수
		int total = 0; // 마지막 총합 변수
		int startSu; // su의 초기값
		
		System.out.print("첫번째 수를 입력하세요. ");
		su1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요. ");
		su2 = sc.nextInt();
		
		System.out.println("첫번째 수 : "+su1+" ,  두번째 수 : "+su2);
		
		if(su1 > su2) { // 두수 교환
			temp = su1; // ex. su1=30, su=2일때 temp=30
			su1 = su2; // su1 = 2
			su2 = temp; // su2 = 30
		} // 여기에 도달하면 su1은 항상 작은수가 된다
		
		startSu = temp = su1; // startSu, temp를 su1값으로 지정해줌
		
		while(su1 <= su2) { // su1값이 0이 아니므로 <= 기호
			tot += su1; // 5개항 합
			total += su1; // 총합
			cnt++;
			
			if(cnt % 5 == 0) {
				System.out.println(temp + " ~ " +su1+" : " +tot);
				tot = 0; // 5개항의 합이라 값이 다음으로 넘어가면 안되니 클리어해준다
				temp = su1 + 1; // 다음 줄은 마지막 숫자가 아니고 1 증가해서 시작해야 하므로 +1 해줌
			}
			su1++;
		}
		if(cnt % 5 != 0) // 입력값이 5로 딱 떨어지지 않아 나머지가 생겼을 때 그 나머지의 합
			//System.out.println(temp +" ~ "+su1+" : "+tot); // 46열에서 su1에 1이 추가되어 나오므로 
		System.out.println(temp +" ~ "+ --su1 +" : "+tot); // 여기서 su1값에 -1
		System.out.println("총합 ("+startSu+"~"+su2+"): " + total);
		
		sc.close();
	}
}
