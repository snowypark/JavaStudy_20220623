package j05_입력;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		
		
		String name = null;
		int age =0;
		String birthday =null;
		String phone =null;
		String email=null;
		String address=null;
		char gender = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("이름: "); 
		name = scanner.next();
		
		System.out.print("나이: "); 
		age = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("생년월일: "); 
		birthday = scanner.nextLine();
		//nextLine() 이전에 다른 line 없으면 버퍼 지우는 nextLine() 삽입.
		
		
		System.out.print("연락처: "); 
		phone = scanner.next();
		
		System.out.print("이메일: "); 
		email = scanner.next();
		
		scanner.nextLine();
		System.out.print("주소: "); 
		address = scanner.nextLine();
				
		System.out.print("성별: "); 
		gender = scanner.next().charAt(0);
		
		System.out.println();
		System.out.println("이름: "+name);		
		System.out.println("나이: "+age);
		System.out.println("생년월일: "+birthday);
		System.out.println("연락처: "+phone); // 0000 0000 공백 형식X(버퍼 넘어감)
		System.out.println("이메일: "+email);
		System.out.println("주소: "+address);
		System.out.println("성별: "	+gender);
		
		//알트 + 클릭으로 한번에 수정
	}

}
