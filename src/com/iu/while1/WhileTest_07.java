package com.iu.while1;

import java.util.Scanner;

public class WhileTest_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		int level =0; // 레벨 담을 변수
		int gold = 0; // 골드 담을 변수
		int mon=3; //몬스터 수
		boolean check = true;

		while(check) {
			System.out.println("1.로그인");
			System.out.println("2.종료");
			int select = sc.nextInt();
			if(select==1) {
				//로그인 진행코드
				System.out.println("아이디를 입력하세요");
				int nId=sc.nextInt();
				System.out.println("비밀번호를 입력하세요");
				int nPw=sc.nextInt();

				if(nId==id && nPw==pw) {
					System.out.println("로그인 성공");
					check=!check;
				}else{
					System.out.println("로그인 실패");
				}
			}else {
				break;
			}

		}//while end
		//게임파트 진행, check->F 로그인 성공 check->T 로그인 실패
		if(check==false) { //!check
			for(level=1;level<15;level++) {
				if(level==5 || level==10) {
					gold=gold+ level/5*1000;
					System.out.println(level/5*1000+" Gode 지급");
				}
		
				for(int i=1;i<=level*3;i++) {
					System.out.println(i+" 번째 사냥 성공");
				}//사냥문
				System.out.println("축 레벨업!!" + (level+1));
			}//for문
			gold= gold+3000;
			System.out.println("현재 레벨 : " + level);
			System.out.println("Gold : "+gold);
		
		
		}//if문
		System.out.println("프로그램 종료");
	}//main
}
