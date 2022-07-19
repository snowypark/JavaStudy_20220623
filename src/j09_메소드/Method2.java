package j09_메소드;
	
	//클린코드

public class Method2 {
	
	//메소드 정의
	
	//메소드 = 클래스 안에 만든 함수
	//함수 = 클래스 안에 만들지 않은 함수, Java = 메소드(class 에서 시작)
	//C, C++는 별도 메소드/클래스 구분
	
	public static void function1() {
		System.out.println("F1 실행");
	}
		//매개변수가 없으면서 반환도 없는 메소드
		//void 공허하다, 의미가 없다, 값이 없다.
	
	
	public static void function2(int age, String name) {
		System.out.println("나이: " + age);
		System.out.println("이름: " + name);
	}
		//매개변수가 있고 반환은 없는 메소드
	
	
	public static int function3() {
		return 1000;
		
		//반환 자료형 일치 1000
		//매개변수가 없고 반환은 있는 메소드
	}
	
	public static String function4(String name) {
		
		String madeName = name + "님";
		return madeName;
		
		//매개변수와 반환이 있는 메소드
	}
	
	public static void function5(int n) {
		//리턴자료형이  void 일 때 메소드를 강제로 탈출하는 방법
		//return은 반복문을 중지 = 이후 문장 실행X. break는 빠져나옴 = 이후 문장 실행
		
		for(int i = 0; i< n; i++) {
			if(i == n - 1) {
				break;
				//return;
				
			}
			System.out.println(i);
		}
		System.out.println("function5가 정상적으로 끝이남");
		//중간에 return을 걸면 문장이 실행되지 않음.
	}
	
	public static String getName() {
		return "박소영";
	}
	public static void setName(String name) {
		String n = name;
	}
	public static String findUserByUsername(String username) {
		return "USER";
	}
	
	public static void main(String[] args) {
		
		function1();  //메소드 호출
		function2(100,"~~");  //메소드 호출, 매개변수 입력(자료형 일치)
		function2(20,"땡땡");
		
		int result = function3();
		System.out.println(result);
		System.out.println(function3()+10);
		
		System.out.println(function4("이름"));
		
		function5(5);
		System.out.println("function5 다음 실행");
		
		
		
	}

}
