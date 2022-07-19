package j15_인터페이스.user;

import j15_인터페이스.user.service.UserService;
import j15_인터페이스.user.service.UserServiceImpl;
import j15_인터페이스.user.service.UserServiceImpl2;

public class UserControlloer {
	
	private final UserService userService;
	
	public UserControlloer() {
		this.userService = new UserServiceImpl2();  //impl(1-2)변경으로 데이터 변경 가능
	}
	
	
	public static void main(String[] args) {
		UserControlloer controlloer = new UserControlloer();
		controlloer.userService.createUser();
		System.out.println();
		
		System.out.println(controlloer.userService.getUser());
		System.out.println();
		
		controlloer.userService.updateUser();
		System.out.println();
		controlloer.userService.deleteUser();

	}

}
