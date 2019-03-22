package com.sesung.love;

import java.util.Scanner;

public class For_ex06 {

	public static void main(String[] args) {
		// 분과 초
		//0분 0초
		//0분 1초
		//0분 2초
		//0분 59초
		//1분 0초
		//59분 59초
		//분과 초를 입력받 // ex 1분 12초
		//1분 12초까지만 나오도록.
		Scanner sc = new Scanner(System.in);
		System.out.println("분을 입력하세요.");
		int min = sc.nextInt();
		System.out.println("초를 입력하세요.");
		int sec = sc.nextInt();
		boolean check = false;
		for(int i=0;i<60;i++) {
			for(int j=0;j<60;j++) {
				System.out.println(i+"분 " +j+" 초");
				if(i==min && j==sec) {
					System.out.println("OK");
					check=!check;
					break;
					//					i=60; j=60;
				} //if문
			}//안쪽for 초
			if(check) {
				break;
			}
		}//바깥쪽 for 분
	}

}
