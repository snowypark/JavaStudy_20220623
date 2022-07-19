package j13_상속;

import java.util.Scanner;

public class Aclass {

	String str;
	int number;
	Scanner scanner;
	
	
	public Aclass() {
		System.out.println("A 생성");
		str = "김땡땡";
		number = 1000;
		scanner = new Scanner(System.in);
	}
	
	
	public String inputString() {
		System.out.println("문자열입력: ");
		return scanner.nextLine();
	}
	
	
	public void printInfo() {
		System.out.println("str = " + str);
		System.out.println("number = " + number);
		
	}
	
}
