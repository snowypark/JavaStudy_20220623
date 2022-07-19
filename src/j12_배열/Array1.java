package j12_배열;

public class Array1 {

	public static void main(String[] args) {
		
		//배열 생성
		String[] names = new String[10];
		
		names[0] = "이름1";
		names[1] = "이름2";
		names[2] = "이름3";
		names[3] = "이름4";
		
		int index = 0;
		
		System.out.println(names[0]);
		System.out.println(names[1-1]);
		System.out.println(names[index]);
		
		for( int i = 0; i < 10; i++) {
			System.out.println(names[i]);
		}
		

	}

}
