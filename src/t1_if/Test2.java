package t1_if;

public class Test2 {
	public static void main(String[] args) {
		
		// 논리 연산자(!, &&, ||[필터])
		
		int su1 = 1, su2 = 53, su3 = 90, max = -99;
		
		if(su1 > su2) {
			if(su1 > su3) {
				max = su1;
			}
			else {
				max = su3;
			}
		}
		else {
			if(su2 > su3) {
				max = su2;
			}
			else {
				max = su3;
			}
		}
		System.out.println("수1 : "+su1+" , 수2 : "+su2+" , 수3 : "+su3+" , max : " + max);
	}
}
