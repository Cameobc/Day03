package com.iu.while1;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bBuger=0; //수량 or 총가격
		int cBuger=0;
		int potato=0;
		int salad=0;
		int count=0; //수량
		int select=0;
		boolean check=true; //반복문의 조건


		while(check) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("햄버거");
			System.out.println("1. 불고기 버거 : 3500원");
			System.out.println("2. 치킨 버거 : 3200원");
			System.out.println("추가");
			System.out.println("3. 감자튀김 : 1000원");
			System.out.println("4. 샐러드 : 2000원");
			select = sc.nextInt();
			System.out.println("수량을 입력하세요.");
			count = sc.nextInt();
			switch(select) {
			case 1 :
				bBuger=bBuger+count*3500;
				break;
			case 2:
				cBuger=cBuger+count*3200;
				break;
			case 3:
				potato=potato+count*1000;
				break;
			case 4:
				salad=salad+count*2000;
			default:
				break;
			}

			System.out.println("추가주문은1 아니면0");
			select=sc.nextInt();
			if(select==0) {
				break;
			}
		}
		System.out.println("불고기 : "+bBuger);
		System.out.println("치킨 : "+cBuger);
		System.out.println("감자튀김 : " +potato);
		System.out.println("샐러드" + salad);

	}
}