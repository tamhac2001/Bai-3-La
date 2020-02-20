package com.tamhac.bai3la;

import java.util.ArrayList;
import java.util.Random;

public class Player {
	private int curentMoney;
	private int totalNum;
	private int[] cardValue = new int[3];
	private ArrayList<String> playerCard = new ArrayList<String>();
	
	public void earnCard(String card) {
		playerCard.add(card);
		
	//	this.totalNum=playerCard[0]+playerCard[1]+playerCard[2];
	}
	public void showCard() {
		System.out.print("Cac la bai lan luot la:");
		System.out.println(playerCard.toString());
	}
	public int total() {
		return totalNum;
	}
	
}
class Banker extends Player{
	
}
