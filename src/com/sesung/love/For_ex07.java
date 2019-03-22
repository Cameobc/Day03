package com.sesung.love;

import java.util.Scanner;

public class For_ex07 {

	public static void main(String[] args) {
		//게임
		//FPS - 
		//총알 30(탄창1개
		//탄창 3개

		//총 선택(총 3번 물어봄)
		//1.단발 1회 1발
		// --탕(30번)
		//2.점사 1회 3발
		//--타타탕(10번)
		Scanner sc = new Scanner(System.in);

		for(int i=1;i<4;i++) {
			System.out.println("어떤 방식을 선택하시겠습니까?");
			System.out.println("1번 단발 2.점사");
			int select = sc.nextInt();
			for(int j=1;j<31;j++) {
				if(select==1) {
					System.out.println("탕");					
				}
				for(int e=1;e<11;e++) {
					if(select==2) {
						System.out.println("타타탕");
					j=31;
					}
				}  // for e
			} //for j

		}//for i
		System.out.println("종료되었습니다.");}

}
