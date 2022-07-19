package j07_반복문;

public class LoopWhileGugudan {

	public static void main(String[] args) {


		int dan = 0;
		
		
		while(dan<8) {
			int dan2 = dan + 2;
			int num = 0;
			System.out.println("-"+dan2+"단");
			
			while(num < 9) {
				
				int num2 = num+1;
				System.out.println(dan2 + " X " + num2 + " = " + (dan2*num2));
				num++;
				
			}
			System.out.println();
			dan++;
			
		}
		
		// while 안의 변수들 = 지역변수
		// 지역변수가 끝나고 같은 이름으로 선언 가능. 상위에 전역 변수로 지정하면 못씀
	
		
		
		
		

	}

}
