package j13_상속.animal;

/*
 * @ -> 어노테이션
 * @override : 부모로부터 상속받아 재정의한 메소드이다.라는 것을 표기
 * 오버라이딩 : 매개변수도, 리턴타입이 같음
 * 오버로딩과 오버라이딩은 다름
 */


public class Human extends Animal{
	
	public Human() {
		System.out.println("사람 한명 생성");
	}
	
	
	@Override 
	public void move() {
//		super.move();
		System.out.println("사람이 두발로 걷습니다.");  //재정의
	}
	
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
	
}
