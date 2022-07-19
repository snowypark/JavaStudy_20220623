package j10_클래스;

/*
 * 일반 메모. *하나
 */

/**
 * 
 * @author ITPS
 * 주석 작성자 정보
 * 클래스/메소드 등 정보
 * 
 * 변수
 * company
 * model
 * color
 * 
 * 메소드
 * showInfor()
 * 000회사의 00모델 차량
 * 색상 : 000
 * 
 */


public class Car {

	String company;
	String model;
	String color;
	
	void showInfor() {
		System.out.println(company+" 회사의 "+ model+"모델 차량");
		System.out.println("색상 :"+ color);
	}
	
}
