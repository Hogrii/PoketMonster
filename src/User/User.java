package User;

import java.util.ArrayList;

import Display.Display;
import Tool.ToolBox;

public class User {
	private String userName;
	private ArrayList<String> catchPoketmon = new ArrayList<>();
	private int money;
	private ToolBox tool;
	
	Display display = new Display();
	
	// 유저 이름 저장
	public void inputUserName(String userName) {
		this.userName = userName;
		this.money = 0;
		this.tool = new ToolBox();
	}
	
	// 유저 이름 반환
	public String getUserName() {
		return this.userName;
	}
	
	public ToolBox getTool() {
		return this.tool;
	}
	
	// 야생포켓몬 포획 시도
	public void throwBall(String poketmon) {
		if(tool.getMonsterBall() <=0) {
			display.notEnoughBall();			
		}else {
			tool.throwMonsterBall();
			catchPoketmon(poketmon);
		}		
	}
	
	// 야생포켓몬 포획
	public void catchPoketmon(String catchPoketmon) {
		this.catchPoketmon.add(catchPoketmon);
		this.money += 200;
	}
}
