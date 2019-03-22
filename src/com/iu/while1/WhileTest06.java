package com.iu.while1;

import java.util.Scanner;

public class WhileTest06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		int l = 1; // 레벨
		int g = 0; //골드
		int m =3*l; //몬스터
			
		System.out.println("로그인을 하시겠습니까?");
		while(true){
				System.out.println("1. 로그인 / 2.종료");
				int select=sc.nextInt();
		
				if(select==1) {
					System.out.println("아이디를 입력해주세요.");
					int nId=sc.nextInt();
					System.out.println("비밀번호를 입력해주세요.");
					int nPw=sc.nextInt();
						if(nId==id && nPw==pw) {
							System.out.println("로그인 성공.");
							break;
						}//안쪽 if
				}else{  //바깥쪽 if
					break;
				}//else문
		}//while문
		
		//로그인 진행 부분
		System.out.println("게임을 실행합니다.");
		System.out.println("레벨 : "+l);
		System.out.println("Gold : "+g);
		for(l =1; l<16;l++) {
			for(int j=1;j<l*3;j++) {

				System.out.println("몬스터를 "+j+"마리 사냥하셨습니다.");
				break;
						}//안쪽  for 몬스터
			System.out.println("현래 레벨은"+l+"입니다.");
						
		}//바깥쪽 for문 레벨
//		for(g=1000;g<3001;g=) {
//			for(l=5;l<16;l=) {
				
//			System.out.println(l+"레벨 달성을 축하합니다.");	
//			}//골드 for
//			
//			System.out.println(g+"골드를 지급합니다.");
//		}//레벨 for
		
		System.out.println("프로그램을 종료합니다.");
	}//main

}//class
