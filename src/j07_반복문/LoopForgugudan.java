package j07_반복문;

public class LoopForgugudan {

	public static void main(String[] args) {

		
		
		
		for (int i = 0;  i < 8 ; i++) {
			int dan = i + 2;
			System.out.println(dan + "단");
			
			for (int j = 0 ; j <9 ; j++) {
				int num = j + 1;
				System.out.println( dan + " * " + num + " = " + j*num);
				
			}
					
			System.out.println();
			
		
		}

	}

}
