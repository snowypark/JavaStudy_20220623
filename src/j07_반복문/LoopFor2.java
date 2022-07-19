package j07_반복문;

public class LoopFor2 {
	public static void main(String[] args) {
		
		int i = 0;
		// 전역 변수를  for 초기문 사용시 비워두고 ; 사용, 후처리 생략가능
		// for (  ;  조건  ; )
		
		for (  ; i < 10; ) {
			i++;
			System.out.println(i);
		}
		
		for ( ; i < 20; ) {
			i++;
			System.out.println(i);
		}
		
		System.out.println();
		
		
		while( i < 30) {
			i++;
			System.out.println(i);
		}
		
	}
}
