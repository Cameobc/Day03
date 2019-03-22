package com.sesung.love;

import java.util.Scanner;

public class For_ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//id, pw
		int id =1234;
		int pw=5678;
		String result ="가까운 은행에 방문하세요.";
		for(int i =0;i<5;i++) {
			System.out.println("아이디를 입력하세요.");
			int nId = sc.nextInt();
			System.out.println("비밀번호를 입력하세요.");
			int nPw = sc.nextInt();
		
			if(id==nId && pw==nPw) {
				result ="로그인 성공";
			
				break;
			}
			
		}	
		System.out.println(result);
		
	}
}	
		
	
		
		//최대 5번의 로그인 기회
		//로그인 성공 or 가까운 은행을 방문하세요.
		//1.계좌조회
		//2.계좌이체
		//3. 대출
	
			
