package Tool;

public class ToolBox {
	private int monsterBall;
	
	public ToolBox() {
		this.monsterBall = 15;
	}
	
	// 몬스터볼 개수 확인
	public int getMonsterBall() {
		return this.monsterBall;
	}
	
	// 몬스터볼 사용시
	public void throwMonsterBall() {
		this.monsterBall--;
	}
}
