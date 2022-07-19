package j07_반복문;

public class Continue {

	public static void main(String[] args) {
		
		//continue -> 다음 반복으로 넘어감
		
		for(int i = 0; i<10;i++) {
			if(i == 8) {
				System.out.println("continue 실행");
				continue;
			}
			System.out.println(i);
			
		}
		

	}

}
