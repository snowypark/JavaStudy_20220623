package J11_접근지정자.a;

/*
 * 접근지정자
 * public
 * protected
 * private
 * default
 */

public class TestA {
//접근지정자
	
		private String name;
		 			   //멤버변수
		
		public TestA() {
			// 오버로딩 하면 기본생성자 비활성화, 사용시 추가로 기본생성자 정의 필요
		}
		
		public TestA(String name) {
			//기본생성자(오버로딩)
			//매개변수
			//우선순위 매개변수 > 멤버변수
			
			this.name = name;
			System.out.println(this);
		}
		
		public void test() {
			System.out.println(name);
		}
	
		
}
