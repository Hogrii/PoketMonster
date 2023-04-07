package PoketMon;

import java.util.ArrayList;
import java.util.List;

public class PoketmonBox {
	private List<String> poketmonBox;
	
	public PoketmonBox() {
		this.poketmonBox = new ArrayList<>();
	}
	public void setPoketmonBox(String poketmon) {
		this.poketmonBox.add(poketmon);
	}
}
