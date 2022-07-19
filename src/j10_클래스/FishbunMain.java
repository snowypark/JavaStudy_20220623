package j10_클래스;

public class FishbunMain {

	public static void main(String[] args) {
		
		new FishBun();
		
		FishBun fishBun = new FishBun();  // 생성
		FishBun fishBun2 = new FishBun();  // 생성
		//주소값 리턴
				
		System.out.println(fishBun);
		System.out.println(fishBun2);

		fishBun.material = "팥";
		fishBun2.material = "슈크림";
		
		System.out.println(fishBun.material);
		System.out.println(fishBun2.material);
		
	}

}




 