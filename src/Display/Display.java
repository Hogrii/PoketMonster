package Display;

import java.util.HashMap;
import java.util.Scanner;

import PoketMon.WildPoketmon;
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
		System.out.println();
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
		System.out.println();
	}
	
	// 메뉴 화면
	public String menu() {
		System.out.println("1. 야생 포켓몬\t2. 포켓몬");
		System.out.println("3. 가방\t\t4. 상점\t\t0. 종료");
		System.out.print("내가 할 일은? -> ");
		String menu = sc.nextLine();
		return menu;
	}
	
	// 야생포켓몬 출현
	public String appearPoketmon(WildPoketmon wildPoketmon, int randomPoketmon) {
		System.out.println();
		HashMap<Integer, String> wildPoketmonList = wildPoketmon.getWildPoketmon();
		System.out.println("야생의 \"" + wildPoketmonList.get(randomPoketmon) + "\" 이(가) 나타났다!");
		System.out.println();
		return wildPoketmonList.get(randomPoketmon);
	}
	
	// 현재 소유 몬스터볼
	public void currentBallCnt(User user) {
		System.out.println("현재 몬스터볼 수 : " + user.getTool().getMonsterBall());
	}
	
	// 야생포켓몬 메뉴
	public String catchMenu() {
		System.out.println("1. 잡는다.\t2. 도망간다");
		String catchMenu = sc.nextLine();
		return catchMenu;
	}
	
	// 포켓몬 잡았을 때
	public void catchPoketmon(String poketmon) {
		System.out.println("야호! " + poketmon + " 을(를) 잡았다!");
	}
	
	// 포켓몬 박스로 전송
	public void moveFromBox(String poketmon) {
		System.out.println(poketmon + " 은(는) 박스로 보내졌다!");
	}
	
	// 몬스터볼이 부족할 때
	public void notEnoughBall() {
		System.out.println("몬스터볼이 부족합니다");
		System.out.println("상점에서 구매해주세요");
	}
	
	// 도망치기
	public void run() {
		System.out.println("성공적으로 도망쳤다!");
		System.out.println();
	}
}
