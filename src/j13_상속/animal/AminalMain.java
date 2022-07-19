package j13_상속.animal;

public class AminalMain {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
//		Animal human = new Human(); //업캐스팅
//		Animal tiger = new Tiger();
		Human human = new Human();
		Tiger tiger = new Tiger();
		
		System.out.println();
		
		
		animal.move(); //move()는 public 지정자.
		human.move();  //오버라이드된 형태는 유지
		tiger.move();	
		System.out.println();
		
		human.readBooks();
		tiger.hunting();
		
		
	}

}
