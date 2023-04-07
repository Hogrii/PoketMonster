package Game;

import Display.Display;
import PoketMon.WildPoketmon;
import User.User;

public class Poketmon {
	Display display = new Display();
	User user = new User();
	WildPoketmon wildPoketmon = new WildPoketmon();
	
	public void gameRun() {
		display.init();
		display.inputUserName(user);
		display.welcome(user);
		while(true) {
			String menu = display.menu();
			if(menu.equals("1")) {
				int randomPoketmon = wildPoketmon.appearPoketmon();
				String poketmon = display.appearPoketmon(wildPoketmon, randomPoketmon);
				catchPoketmon(poketmon);
			}else if(menu.equals("2")) {
				System.out.println("미구현");
			}else if(menu.equals("3")) {
				System.out.println("미구현");
			}else if(menu.equals("4")) {
				System.out.println("미구현");
			}else if(menu.equals("0")) {
				System.exit(0);
			}else {
				
			}
		}
	}
	
	// 야생포켓몬 잡기
	public void catchPoketmon(String poketmon) {
		String catchMenu = display.catchMenu();
		if(catchMenu.equals("1")) {
			user.throwBall();
			user.catchPoketmon(poketmon);
			display.catchPoketmon(poketmon);
		}else if(catchMenu.equals("2")) {
			
		}else {
			
		}
	}
}
