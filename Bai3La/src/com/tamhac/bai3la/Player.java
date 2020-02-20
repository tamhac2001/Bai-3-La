package com.tamhac.bai3la;

import java.util.ArrayList;

public class Player {
	private int curentMoney;
	private int totalValue;
	private int finalValue;
	private ArrayList<Integer> cardValue = new ArrayList<Integer>(3);
	private ArrayList<String> playerCard = new ArrayList<String>(3);
	
	
	public void earnCard(String card) {
		playerCard.add(card);
		if(card=="I"||card=="J"||card=="K") {
			cardValue.add(10);
		}
		else {
			cardValue.add(Integer.parseInt(card));
		}
		this.totalValue+=cardValue.get(cardValue.size()-1);
	}
	public ArrayList<String> getCard() {
		return playerCard;
	}
	public int getFinalValue() {
		this.finalValue=totalValue%10;
		return finalValue;
	}
	public void showCard() {
		System.out.print("Cac la bai cua nguoi choi lan luot la:");
		System.out.println(playerCard);
		System.out.print("So nut cua nguoi choi la:");
		System.out.println(finalValue);
	}

}//end class Player
class Banker extends Player{
	public void showCard() {
		System.out.print("Cac la bai cua nha cai lan luot la:");
		System.out.println(getCard());
		System.out.print("So nut cua nha cai la:");
		System.out.println(getFinalValue());
	}
}

