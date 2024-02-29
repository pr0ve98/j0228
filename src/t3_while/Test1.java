package t3_while;

public class Test1 {
	public static void main(String[] args) {
		
		// 1~100까지의 합
		
		int i = 0, tot = 0;
		
		while(i < 100) {
			i = i + 1; // i++, ++i, 1+=1
			tot = tot + i; // tot += i
		}
		
		System.out.println("1~ 100까지의 합은? " + tot);
	}
}
