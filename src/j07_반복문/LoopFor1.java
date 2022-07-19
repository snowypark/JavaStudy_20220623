package j07_반복문;

public class LoopFor1 {
	public static void main(String[] args) {
		
		// for ( 초기화 ; 조건 ; 후처리(++) ) { 실행문 }
		// 초기화 -> 조건 -> 실행 -> 후처리 -> 조건...반복
		
		
		for(int i = 0; i<10; i++) {
			System.out.println(i);
		}
		// 1씩 증가
				
		System.out.println();
		
		for(int i = 0; i<5; i++) {
			System.out.println(i+1);
		}
		
		System.out.println();
		
		
		int i = 0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		// 조건의 영향이 클 때
	}
}
