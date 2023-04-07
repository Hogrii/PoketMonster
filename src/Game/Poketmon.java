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
}
