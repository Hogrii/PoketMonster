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
	}
}
