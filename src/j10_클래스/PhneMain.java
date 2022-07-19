package j10_클래스;

public class PhneMain {

	public static void main(String[] args) {
		
		
		Phone phone = new Phone("애플", "아이폰", 13, "화이트"); 
		phone.showInfo(); 
		
		System.out.println();
		
		phone.setCompany("삼성");
		phone.showInfo();
		
		System.out.println();
		
				
		System.out.println("회사명: " + phone.getCompany());
		
		
	}

}

/*
 * 클래스의 변수 -> private : 외부에서 접근 불가
 * 외부에서 변수에 접근 -> set, get
 * 외부 - set, get - 변수 접근
 * 
 * 구조화 -> 라이브러리 import + get 사용
 * 변수를 사용(출력) : get
 * 변수의 값을 변동 : set
 */
