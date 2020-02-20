package com.tamhac.bai3la;

import java.util.ArrayList;
import java.util.Random;

public class Game {
	private byte playerNum;
	ArrayList<String> cardPack = new ArrayList<String>(52);
	int totalCardLeft=52;
	public void start() {
		System.out.println("Bat dau game bai 3 la");
		System.out.print("Moi nhap vao so nguoi choi:");
	}
	public void newGame() {
		String[] cardValue = {"1","2","3","4","5","6","7","8","9","10","I","J","K"};
		for(int i=0;i<13;i++) {
			for(int j=0;j<4;j++)
			{
				cardPack.add(cardValue[i]);
			}
		}
	}
	public String giveCard() {
		Random rd=new Random();
		String card= cardPack.get(rd.nextInt(totalCardLeft));
		cardPack.remove(card);
		totalCardLeft--;
		return card;
	}
	/*public void setPlayerNum(byte playerNum) {
		this.playerNum=playerNum;
	}*/
	
}//end class
