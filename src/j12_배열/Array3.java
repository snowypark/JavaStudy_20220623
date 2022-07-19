package j12_배열;

import j10_클래스.Phone;

public class Array3 {

	public static void main(String[] args) {
		//클래스배열
	
		Phone[] phones = new Phone[10]; //주소값 넣는 배열
		Phone p = new Phone(); //주소
		
		for(int i = 0; i < phones.length; i++) {
			System.out.println(phones[i]);
		}
		
		for(int i = 0; i < phones.length; i++) {
		phones[i] = new Phone();
		}
		
		
		
		phones[2].setCompany("삼성");
		phones[5].setCompany("LG");
		phones[7].setCompany("애플");
		
		
		
		for(int i = 0; i < phones.length; i++) {
			System.out.println(phones[i]);
		}
		
		for(int i = 0; i < phones.length; i++) {
			phones[i].showInfo();
			System.out.println(i);
		}
		
		for(int i= 0; i< phones.length; i++) {
			if(phones[i].getCompany() == null ) {
				continue;
			}
			phones[i].showInfo();
			
			}
		}
		
		

	}


