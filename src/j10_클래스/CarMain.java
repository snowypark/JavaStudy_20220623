package j10_클래스;

public class CarMain {

	public static void main(String[] args) {

		/*
		 * 차량 3대
		 * 
		 * 기아자동차
		 * k2
		 * 화이트
		 * 
		 * 현대자동차
		 * 쏘나타
		 * 블랙
		 * 
		 * BMW
		 * 520d
		 * 레드
		 */
		
		Car car1 = new Car();
		car1.color = "화이트";
		car1.company = "기아자동차";
		car1.model = "k3";
		
		Car car2 = new Car();
		car2.color = "블랙";
		car2.company = "현대자동차";
		car2.model = "쏘나타";
		
		Car car3 = new Car();
		car3.color = "레드";
		car3.company = "BMW";
		car3.model ="520d";
		
		car1.showInfor();
		System.out.println();
		car2.showInfor();
		System.out.println();		
		car3.showInfor();

	}

}
