package j10_클래스;

public class FishBun {   //틀
//붕어빵
	
	
	//변수
	String material;    //재료
	String dough;       //반죽
	
	
	//FishiBun(); 는 호출
	FishBun() {  //생성자
	//반환자료형 정의X
	//생성자는 클래스명과 같음
	System.out.println("생성자 호출");
		
	}
	
	
	
	//메소드
	void showinfo() {
		System.out.println("재료: " +material);
		System.out.println("반죽: " +dough);
		
	}
	
}
