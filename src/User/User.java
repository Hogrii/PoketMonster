package User;

public class User {
	private String userName;
	
	// 유저 이름 저장
	public void inputUserName(String userName) {
		this.userName = userName;
	}
	
	// 유저 이름 반환
	public String getUserName() {
		return this.userName;
	}
}
