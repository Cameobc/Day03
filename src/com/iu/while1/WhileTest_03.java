package com.iu.while1;

import java.util.Scanner;

public class WhileTest_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		boolean check=false;
		do{ {
			System.out.println("아이디를 입력하세요.");
			int yId = sc.nextInt();
			System.out.println("비밀번호를 입력하세요.");
			int yPw = sc.nextInt();
			if(yId==id && yPw==pw) {
				System.out.println("로그인 성공");
				break;
			}
		}
		}while(check);
	}

}
