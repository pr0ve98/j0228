package t3_while;

public class Test5 {
	public static void main(String[] args) {
		
		// 1-2+3-4+5-...+9-10=?
		int i = 0, tot = 0, s = -1;
		
		while(i < 10) {
			i = i + 1;
			s = s * (-1);
			tot = tot + (i*s);
		}
			System.out.println("1-2+3-4+5-...+9-10=ㅁㅁ에서 ㅁㅁ의 답은? " + tot);
	}
}