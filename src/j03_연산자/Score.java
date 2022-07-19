package j03_연산자;

public class Score {

	public static void main(String[] args) {
		
		//++num 선 증가 : 현재 시점에서 바로 1증가
		//num++ 후 증가 : 다음 시점에서 증가(이후 실행)
			
		int score = 80;
		int temp = 0;
		int temp2 = 0;
		
		//score = score +1;
		temp = score--;
		temp2 = score;
		
		System.out.println(temp);
		System.out.println(temp2);
		System.out.println(++temp2);
		System.out.println(temp2++);
		System.out.println(temp2);

	}

}
