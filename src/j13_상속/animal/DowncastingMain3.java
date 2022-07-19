package j13_상속.animal;

public class DowncastingMain3 {

	public static void main(String[] args) {
		
		/*
		 * 사람
		 * 호랑이
		 * 사람
		 * 사람
		 * 동물
		 * 
		 * 전부 move()
		 * 다운캐스팅
		 */
		
		Animal[] animals = new Animal[5];
		
		animals[0] = new Human();
		animals[1] = new Tiger();
		animals[2] = new Human();
		animals[3] = new Human();
		animals[4] = new Animal();
		System.out.println();
		
		
		for(Animal animal : animals) {
			animal.move();
		}
		
		System.out.println();
		(new Tiger()).hashCode();		
		System.out.println();
		
		
		for(Animal animal : animals) {
			if(animal instanceof Human) {
				System.out.println("사람이었습니다.");
				((Human) animal).readBooks();
				System.out.println();
			}
			else if(animal instanceof Tiger) {
				System.out.println("호랑이었습니다");
				((Tiger) animal).hunting();
				System.out.println();
				
			}
			else {
				System.out.println("동물입니다.");
				System.out.println();
			}
			
		}
		   
		

	}

}

