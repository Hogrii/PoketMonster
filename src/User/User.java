package User;

import java.util.ArrayList;
import java.util.List;

import Display.Display;
import PoketMon.PoketmonBox;
import Tool.ToolBox;

public class User {
	private String userName;
	private List<String> catchPoketmon = new ArrayList<>();
	private int money;
	private ToolBox tool;
	private PoketmonBox poketmonBox;
	
	Display display = new Display();
	
	// 유저 이름 저장
	public void inputUserName(String userName) {
		this.userName = userName;
		this.money = 0;
		this.tool = new ToolBox();
		this.poketmonBox = new PoketmonBox();
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
	public void catchPoketmon(String poketmon) {
		if(this.catchPoketmon.size()>5) {
			poketmonBox.setPoketmonBox(poketmon);
			display.catchPoketmon(poketmon);
			display.moveFromBox(poketmon);
		}else {
			this.catchPoketmon.add(poketmon);
			display.catchPoketmon(poketmon);
		}
		this.money += 200;
	}
}
