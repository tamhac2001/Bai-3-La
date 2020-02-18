package com.tamhac.bai3la;

import java.util.Scanner;

public class Solution {
	public class game{
		private byte playerNum;
		
		public void start(){
			System.out.println("Bat dau game bai 3 la...");
		}
		public byte getPlayer() {
			System.out.print("Nhap vao so nguoi choi");
			Scanner sc=new Scanner(System.in);
			playerNum=sc.nextByte();
			sc.close();
			return playerNum;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("");
	}

}
