package t3_while;

public class Test6 {
	public static void main(String[] args) {
		
		/* 1~100까지의 합 10항씩의 합을 출력하시오
			1~10: 55
			11~20: 210
			21~30: _
			.
			.
			.
		*/
		int i = 0, tot = 0;
		
		while(i < 100) {
			i = i + 1;
			tot = tot + i;
			if((i % 10) == 0) {
				System.out.println((i-9)+" ~ " +i+ " 합은 "+ tot +"입니다.");
				tot = 0; //clear 작업이 필요없으면 없애고 다시 시작
			}
		
		}
	}
}
