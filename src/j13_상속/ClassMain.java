package j13_상속;

public class ClassMain {

	public static void main(String[] args) {
		
		new Aclass();		
		System.out.println();
		
		
		B_1class b1 =  new B_1class(); // Aclass 부모클래스 먼저 실행
		b1.inputString();
		System.out.println();
		
		new B_2class();
		System.out.println();

	}

}

//super 사용 -> 상위 클래스를 가져옴
//상속 받으면 한묶음 취급
