package com.sesung.love;

public class For_ex08 {

	public static void main(String[] args) {
		
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
			switch(i) {
			case 3:
				i=10;
				break;
			case 12:
				break;
			}
		}
		System.out.println("종료");

	}

}
