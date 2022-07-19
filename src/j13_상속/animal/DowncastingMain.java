package j13_상속.animal;

public class DowncastingMain {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[3];
		
		animals[0] = new Animal();
		animals[1] = new Human();
		animals[2] = new Tiger();
		
		for(int i = 0; i< animals.length; i++) {
			animals[i].move();
			System.out.println();
		
		}
		
		//upcasting이 된 후 downcasting 가능
		//downcasting은 명시적
		
		
//		Human human = (Human) animals[1];
//		human.readBooks();
		//Animal로 생성한 0번 : Animal -> Human으로 변환 불가능.(없는 주소)
		
		
		
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] instanceof Human) {  //생성된 객체가 Human인지 확인
				Human human = (Human) animals[i];
				human.readBooks();
			
			}else if(animals[i] instanceof Tiger) {
				Tiger tiger = (Tiger) animals[i];
				tiger.hunting();
			}else {
				System.out.println("Downcasting하지 않음");
			}
			
			 
			 
		   
		}

	}

}
