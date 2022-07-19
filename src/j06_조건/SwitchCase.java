package j06_조건;

public class SwitchCase {

	public static void main(String[] args) {
		
		//switch 변수 값부터 case 시작
		// : 콜론으로 케이스 구분
		// 디폴트는 해당 케이스가 없으면 실행(Else) , 가장 마지막에 적음
		
		int select = 0;
		String select2 = "2";
		char select3 = '2';
		
		// int switch
		switch(select) {
		case 1:
			System.out.println("숫자 1을 선택 하였습니다.");
			break;
		case 2:	
			System.out.println("숫자 2를 선택 하였습니다.");
			break;
		case 3:
			System.out.println("숫자 3을 선택 하였습니다.");
			break;
		default:
			System.out.println("해당 케이스가 없으면 실행");
			
		}
		
		// String switch
		switch(select2) {
		case "1":
			System.out.println("문자열 1을 선택 하였습니다.");
			break;
		case "2":	
			System.out.println("문자열 2를 선택 하였습니다.");
			break;
		case "3":
			System.out.println("문자열 3을 선택 하였습니다.");
			break;
		default:
			System.out.println("해당 케이스가 없으면 실행");
			
		}
		
		//char switch
		switch(select3) {
		case '1':
			System.out.println("문자 1을 선택 하였습니다.");
			break;
		case '2':	
			System.out.println("문자 2를 선택 하였습니다.");
			break;
		case '3':
			System.out.println("문자 3을 선택 하였습니다.");
			break;
		default:
			System.out.println("해당 케이스가 없으면 실행");
			
		}
		

	}

}
