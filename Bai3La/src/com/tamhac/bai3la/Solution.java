package com.tamhac.bai3la;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void findWinner(int bankerFinalValue, ArrayList<Integer> normalPlayerFinalValue) {
		for(int i=0;i<normalPlayerFinalValue.size();i++) {
			if(normalPlayerFinalValue.get(i)>bankerFinalValue) {
				System.out.println("Player "+(i+1)+ " win ");
			}
			else {
				System.out.println("Player "+(i+1)+" lose");
			}
		}
	}

	public static void main(String[] args) {
		
		Game game=new Game();
		game.start();
		//Get number of player
		Scanner sc=new Scanner(System.in);
		byte playerNum=sc.nextByte();
		//game.setPlayerNum(playerNum);
		ArrayList<Integer> normalPlayerFinalValueList = new ArrayList<Integer>(playerNum);
		game.newGame();
		Player banker=new Banker();
		Player[] normalPlayer=new Player[playerNum];
		for(int i=0;i<playerNum;i++) {
			normalPlayer[i]= new Player();
		}
		//earn card
		for(int i=0;i<3;i++) {
			banker.earnCard(game.giveCard());
			for(Player p : normalPlayer)
			{
				p.earnCard(game.giveCard());
			}
		}
		//calculate and showCard
		banker.getFinalValue();
		banker.showCard();
		for(Player p : normalPlayer) {
			//System.out.println(p);
			p.getFinalValue();
			normalPlayerFinalValueList.add(p.getFinalValue());
			p.showCard();
		}
		findWinner(banker.getFinalValue(), normalPlayerFinalValueList);
		
	}
}
