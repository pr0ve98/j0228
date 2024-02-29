package t1_if;

import java.util.Scanner; 

/*
		 A = 100
		 B = 200
		 B = A
		 A = B
		 -> 실행시 B가 A를 덮어써서 둘 다 100이 되어버림 (교체 X)
		 
		 A = 100
		 B = 200
		 T = ''
		 
		 T = B
		 B = A
		 A = T
		 -> 실행시 B의 값이 T로 넘어가고 A는 다시 T의 값을 받아 B = 100, A = 200(교체 O)
 */

public class Test1 {
	public static void main(String[] args) {
		
		
		// 두개의 수를 교환
		
		Scanner sc = new Scanner(System.in);
		
		int su1, su2, temp;
		
		System.out.print("첫번째 수를 입력하세요. ");
		su1 = sc.nextInt();
		
		System.out.print("두번째 수를 입력하세요. ");
		su2 = sc.nextInt();
		
		System.out.println("입력된수 su1 : "+su1+", su2 : " + su2);
		
		// 두수의 교환 (갤러리 사진 참고)
		temp = su1;
		su1 = su2;
		su2 = temp;

		System.out.println("교환된수 su1 : "+su1+", su2 : " + su2);
		sc.close();
	}
}
