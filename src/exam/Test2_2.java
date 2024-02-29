package exam;

import java.util.Scanner;

public class Test2_2 {
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
		
		if(su1 > su2) { 
			temp = su1; 
			su1 = su2; 
			su2 = temp; 
		} 
		
		startSu = temp = su1; 
		
		while(su1 <= su2) { 
			tot += su1; 
			//total += su1; // 38과 39는 같은 내용으로 반복됨
			cnt++;
			
			if(cnt % 5 == 0) {
				System.out.println(temp + " ~ " +su1+" : " +tot);
				total += tot; // 그래서 여기에 추가함
				tot = 0; 
				temp = su1 + 1;
			}
			su1++;
		}
		if(cnt % 5 != 0) { // 입력값이 5로 딱 떨어지지 않아 나머지가 생겼을 때 그 나머지의 합
			total += tot; // 찌꺼기도 total에 추가해야 하므로 여기도 추가
			//System.out.println(temp +" ~ "+su1+" : "+tot); // 46열에서 su1에 1이 추가되어 나오므로 
			System.out.println(temp +" ~ "+ --su1 +" : "+tot); // 여기서 su1값에 -1
		}
		System.out.println("총합 ("+startSu+"~"+su2+"): " + total);
		
		sc.close();
	}
}
