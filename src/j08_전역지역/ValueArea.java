package j08_전역지역;

public class ValueArea {
	
	public static void main(String[] args) {
		//전역
		int num1 = 12;
		
		if(num1 > 10) {
			//지역
			int num2 = 10;
			System.out.println(num2);
			
		}else if(num1 > 9) {			
			int num2 = 9;
			
		}else if(num1 > 8) {
			int num2 = 8;
			
		}else {
			int num2 = 0;			
		}
		
		

	}

}
