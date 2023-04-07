package Display;

import java.util.Scanner;

import User.User;

public class Display {
	Scanner sc = new Scanner(System.in);
	public void init() {
		System.out.println("** 포켓몬 세계에 오신 것을 환영합니다 **");
	}
	
	// 유저 이름 입력
	public void inputUserName(User user) {
		System.out.print("당신의 이름을 입력해주세요 : ");
		user.inputUserName(sc.nextLine());
		System.out.println("당신의 이름이 " + user.getUserName() + "(이)가 맞습니까?");
		System.out.print("네(1) 아니오(2) : ");
		confirmUserName(user);
	}
	
	// 유저 이름 확인
	public void confirmUserName(User user) {
		int nameConfirm = Integer.parseInt(sc.nextLine());
		if(nameConfirm == 1) {
			return;
		}else if(nameConfirm == 2) {
			inputUserName(user);
		}
	}
	
	// 환영 인사
	public void welcome(User user) {
		System.out.println("반갑다! " + user.getUserName() + "!");
		System.out.println("포켓몬 세계로 출발!");
	}
}
