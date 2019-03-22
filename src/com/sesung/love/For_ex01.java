package com.sesung.love;

import java.util.Scanner;

public class For_ex01 {

	public static void main(String[] args) {
		//1-10까지의 합을 구하세요.
		//for이용.
//		//0+1+2+3+4+5...+10
//		int hap = 0;
//		hap = hap+1;
//		hap = hap+2;
//		hap = hap+3;
//		hap = hap+10;
		//hap = hap+n
//		int hap=0;
//		int num=3;
//		int count=20;		
//		for(int i=num;i<count;i++) {
//			hap=hap+i; // 누적함수
//		}
//		System.out.println(hap);
//
//		System.out.println("=============");
		//초시계 
		//원하는 초를 입력받기
		//입력한 초가 되면 스탑
		//0-59초까지 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 초를 입력해주세요.");
		int cho = sc.nextInt();
		for(int i=0;i<60;i++) {
			System.out.println(i);
			if(i==cho) {
				System.out.println("ok");
				i=59; //break;
			}
			
		}
		
	}

}
