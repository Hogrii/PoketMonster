package User;

import java.util.ArrayList;

public class User {
	private String userName;
	private int monsterBall;
	private ArrayList<String> catchPoketmon = new ArrayList<>();
	private int money;
	
	// 유저 이름 저장
	public void inputUserName(String userName) {
		this.userName = userName;
		this.monsterBall = 5;
		this.money = 0;
	}
	
	// 유저 이름 반환
	public String getUserName() {
		return this.userName;
	}
	
	// 야생포켓몬 포획 시도
	public void throwBall() {
		this.monsterBall--;
	}
	
	// 야생포켓몬 포획
	public void catchPoketmon(String catchPoketmon) {
		this.catchPoketmon.add(catchPoketmon);
		this.money += 200;
	}
}
