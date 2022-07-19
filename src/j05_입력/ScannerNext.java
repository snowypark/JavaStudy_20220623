package j05_입력;

import java.util.Scanner;

public class ScannerNext {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		// null 문자열의 값이 비었다.		
		String str1 = null;
		String str2 = null;
		char c = 0;  // char = ' ' 가 불가능.
		int i = 0;
		double d = 0.0;
		boolean b = false; //기본값 F
		
		
		System.out.print("문자열(s, e) -> x): "); //복사 Ctrl + Alt + 아래 방향키
		str1 = scanner.next();
		//nextLine()은 공백을 포함시키는 문자열.  Line은 엔터(줄바꿈) 포함.
		scanner.nextLine(); // 버퍼를 비움
		
		System.out.print("문자열(s, e) -> o): ");
		str2 = scanner.nextLine();
		
		System.out.print("문자: ");
		c = scanner.next().charAt(1);
		// 문자열의 순번을 셀 때는 0을 시작으로 0,1,2,3...
		
		System.out.print("정수: ");
		i = scanner.nextInt();
				
		System.out.print("실수: ");
		d = scanner.nextDouble();
		
		System.out.print("논리: ");
		b = scanner.nextBoolean();
		
		System.out.println();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(c);
		System.out.println(i);
		System.out.println(d);
		System.out.println(b);
		
		
	}	//변수가 많을 경우 미리 상단에 선언. 출력 사이사이에 선언하면 복잡해보임.
		//버퍼라는 공간에 미리 다운 후 실행...유튜브 음악 스트리밍 등. 
		//버퍼에 받는 속도보다 재생이 빠르면 실행이 끊김...버퍼링.
		//키보드 입력에서도 버퍼 사용
		//띄어쓰기로 scanner.next 구분.
		//엔터 입력으로 버퍼를 닫음. 스페이스바가 있으면 공백을 기준으로 버퍼를 나눔.
		
}
