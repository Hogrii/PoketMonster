package User;

import java.util.ArrayList;

public class User {
	private String userName;
	private int monsterBall;
	private ArrayList<String> catchPoketmon = new ArrayList<>();
	
	// 유저 이름 저장
	public void inputUserName(String userName) {
		this.userName = userName;
		this.monsterBall = 5;
	}
	
	// 유저 이름 반환
	public String getUserName() {
		return this.userName;
	}
	
	public void throwBall() {
		this.monsterBall--;
	}
	
	public void catchPoketmon(String catchPoketmon) {
		this.catchPoketmon.add(catchPoketmon);
	}
}
