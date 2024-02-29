package t3_while;

public class Test3 {
	public static void main(String[] args) {
		
		// 1~100까지의 홀수 합
		
		int i = -1, tot = 0;
		
		while(i < 99) { // 홀수를 구하는 것이면 구하는 값에 가장 가까운 홀수를 적는다
			i = i + 2;
			tot = tot + i;
		}
		
		System.out.println("1~ 100까지의 홀수 합은? " + tot);
	}
}
