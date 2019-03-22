package com.sesung.love;

import java.util.Scanner;

public class For_ex8 {
	//for문 2개만 가지고 만들어보기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		for(int i =0;i<3;i++) {
			int count=10;
			String sound="타타탕";
			System.out.println("1. 단발");
			System.out.println("2. 점사");
			int select = sc.nextInt();
			if(select==1) {
				count=30;
				sound="탕";
			}else{

			}
			for(int j=0;j<count;j++) {
				System.out.println(j+1+sound);			
			}
		}
		System.out.println("종료되었습니다.");}
}