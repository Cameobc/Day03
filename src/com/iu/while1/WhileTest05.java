package com.iu.while1;

import java.util.Scanner;

public class WhileTest05 {

	 public static void main(String[] args) {
         // TODO Auto-generated method stub

         Scanner sc = new Scanner(System.in);

         int bBuger = 0;
         int cBuger = 0;
         int potato = 0;
         int salad = 0;
         int count = 0;// 수량
         int sum = bBuger + cBuger + potato + salad;
         boolean check = true; // 반복문의 조건	
        

         while (check) {
            System.out.println("햄버거" + "**************");
            System.out.println("1.불고기버거" + "\t" + "3500원");
            System.out.println("2.치킨버거" + "\t" + "3200원");
            System.out.println("추가" + "**************");
            System.out.println("3.감자튀김" + "\t" + "1000원");
            System.out.println("4.샐러드" + "\t" + "2000원");
            System.out.println("메뉴선택?");

            int select = sc.nextInt();
            System.out.println("수량을 입력하세요");
            count = sc.nextInt();// 수량

            switch (select) {
            
            case 1:
               System.out.println("1.불고기버거" + "\t" + "3500원");
               bBuger = bBuger + count * 3500;
               break;
            case 2:
               System.out.println("2.치킨버거" + "\t" + "3200원");
               cBuger = cBuger + count * 3200;
               break;
            case 3:
               System.out.println("3.감자튀김" + "\t" + "1000원");
               potato = potato + count * 1000;
               break;
            case 4:
               System.out.println("4.샐러드" + "\t" + "2000원");
               salad = salad + count * 2000;
               break;

            default:
               break;
            }
            System.out.println("추가 주문 하시겠습니까 1/0?");
            select = sc.nextInt();
            if (select == 0) {
               break;
            }
         }
         if(bBuger > 0)
            System.out.println("불고기버거(" + count + "개) : " + bBuger + "원");
         if (cBuger > 0)
            System.out.println("치킨버거(" + count + "개) : " + cBuger + "원");
         if(potato > 0)
            System.out.println("감자튀김(" + count + "개) : " + potato + "원");
         if(salad > 0)
            System.out.println("샐러드(" + count + "개) : " + salad + "원");
         System.out.println(sum);
      }// main end
   }// class end
