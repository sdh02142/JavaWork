package ex0730.ch04;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean r = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		String inputValue = "";
		
		int num = 0;
		int money = 0;
		
		while (r) {
			System.out.println("================================");
			System.out.println("1. 입금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("================================");
			System.out.print("선택> ");
			
			inputValue = sc.nextLine();
			
			num = Integer.parseInt(inputValue);
			
			switch(num) {
				case 1 : 
					System.out.print("입금> ");
					inputValue = sc.nextLine();
					
					money = Integer.parseInt(inputValue);
					balance += money;
					System.out.println("현재 잔액> " + balance);
					break;
				case 2 : 
					System.out.print("출금> ");
					inputValue = sc.nextLine();
					
					money = Integer.parseInt(inputValue);
					balance -= money;
					System.out.println("현재 잔액> " + balance);
					break;
				case 3 : 
					System.out.println("현재 잔액> " + balance);
					break;
				case 4 : 
					r=false;
					break;
				default : System.out.println("올바른 숫자를 입력해주세요.");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
