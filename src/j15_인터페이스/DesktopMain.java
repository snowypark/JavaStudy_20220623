package j15_인터페이스;

public class DesktopMain {

	public static void main(String[] args) {
		HDMI h = new Monitor();
		
		Monitor monitor = new Monitor();
		BeamProjector beamProjector = new BeamProjector();
		
		Desktop desktop = new Desktop(monitor);
			
		desktop.showInfo();
		
	
	}

}

/*
 * DI : Dependency Injection
 * 상속 : 쌍방향
 * 구현 : 기능만
 * 
 * 
 * 로그인 : ID/PW -> 서버에서 일치 확인(DB) -> 사용자 정보를 세션에 저장
 * 세션 : 저장소 -> 객체 소멸(로그아웃)
 * 웹 : 새 페이지가 열리면 기존 정보X -> 세션에 저장하면 로그인 정보가 저장되어 로그인 유지
 * 세션에 저장되는 로그인 정보가 다름
 */

