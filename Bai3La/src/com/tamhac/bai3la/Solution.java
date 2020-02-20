package com.tamhac.bai3la;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Game game=new Game();
		game.start();
		//Get number of player
		Scanner sc=new Scanner(System.in);
		byte playerNum=sc.nextByte();
		//game.setPlayerNum(playerNum);
		game.newGame();
		Player[] player=new Player[playerNum];
		for(int i=0;i<playerNum;i++) {
			player[i]= new Player();
		}
		for(int i=0;i<3;i++) {
			for(Player p : player)
			{
				p.earnCard(game.giveCard());
			}
		}
		for(Player p : player) {
			p.showCard();
		}
		
		
	}

}
