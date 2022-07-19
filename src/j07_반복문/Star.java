package j07_반복문;

public class Star {

	public static void main(String[] args) {
		
		/*
		 *  별찍기
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 */
		
//		for(int j= 0; j<1; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for(int j= 0; j<2; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
		
		
		
		for (int i = 0; i<10 ; i++) {
			for(int j = 0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
	
		
		for (int i = 0; i<10 ; i++) {
			for(int j = 0; j<10-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	
		System.out.println("-");
		int n = 10;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-");
		
		for (int i = 0; i<10 ; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<10-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
	
		

	}

}
