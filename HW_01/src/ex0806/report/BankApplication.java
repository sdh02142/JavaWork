package ex0806.report;

import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		final int ACCOUNT_SIZE = 100;
		Account [] account = new Account[ACCOUNT_SIZE];
		int ACCOUNT_COUNT = 0;
		
		//////////////////////////////////
		Scanner sc = new Scanner(System.in);
		
	    boolean b = true;
	    
	    while(b) {
	    	System.out.println("------------------------------------------");
	    	System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
	    	System.out.println("------------------------------------------");
	    	System.out.println("선택>");
	    	int num = Integer.parseInt(sc.nextLine());
	    	
	    	
	    	switch(num){
             case 1 : 
            	 System.out.println("----------------");
 	    		System.out.println("---- 계좌생성 ----");
 	    		System.out.println("----------------");
 	    		
 	    		System.out.println("계좌번호>");
 	    		String ac = sc.nextLine();

 	    		System.out.println("계좌주>");
 	    		String name = sc.nextLine();
 	    		
 	    		System.out.println("초기 입금액>");
 	    		int money = Integer.parseInt(sc.nextLine());

 	    		account[ACCOUNT_COUNT++] = new Account(ac, name, money);
 	    		System.out.println(name + "님의 계좌 생성 성공");
            	break;
			 case 2 : 
				 System.out.println("----------------");
		    		System.out.println("---- 계좌목록 ----");
		    		System.out.println("----------------");
		    		if(ACCOUNT_COUNT > 0) {
		    			for(int i = 0; i < ACCOUNT_COUNT; i++) {
		    				System.out.println(account[i].getAccount()+"\t"+account[i].getName()+"\t"+account[i].getMoney());
		    				}
		    		} else {
		    			System.out.println("----------------");
		    			System.out.println("- 기록된 계좌 없음 -");
			    		System.out.println("----------------");
		    		}
			      break;
			 case 3 : 
				 System.out.println("-----------------");
		    		System.out.println("------ 예금 ------");
		    		System.out.println("-----------------");
		    		if(ACCOUNT_COUNT > 0) {
		    			int k = 0;
		    			System.out.print("계좌번호>");
			    		String ac2 = sc.nextLine();
			    		
			    		System.out.println("예금액>");
			    		int svMoney = Integer.parseInt(sc.nextLine());

			    		for(int i = 0; i < ACCOUNT_COUNT; i++) {
			    			if(account[i].getAccount().equals(ac2)) {
			    				System.out.println("기존 잔고 : " + account[i].getMoney());
			    				account[i].setMoney(account[i].getMoney()+svMoney);
			    				System.out.println("예금 후 잔고 : " + account[i].getMoney());
			    				k++;
			    			}
			    		}
			    		if(k == 0) {
			    			System.out.println("----------------");
			    			System.out.println("- 검색된 계좌 없음 -");
				    		System.out.println("----------------");
			    		}
		    		} else {
		    			System.out.println("----------------");
		    			System.out.println("- 기록된 계좌 없음 -");
			    		System.out.println("----------------");
		    		}
				 break;
			 case 4 : 
				 System.out.println("-----------------");
		    		System.out.println("------ 출금 ------");
		    		System.out.println("-----------------");
		    		if(ACCOUNT_COUNT > 0) {
		    			int m = 0;
		    			System.out.print("계좌번호>");
			    		String ac2 = sc.nextLine();
			    		
			    		System.out.println("출금액>");
			    		int wdMoney = Integer.parseInt(sc.nextLine());

			    		for(int i = 0; i < ACCOUNT_COUNT; i++) {
			    			if(account[i].getAccount().equals(ac2)) {
			    				System.out.println("기존 잔고 : " + account[i].getMoney());
			    				account[i].setMoney(account[i].getMoney()-wdMoney);
			    				System.out.println("출금 후 잔고 : " + account[i].getMoney());
			    			    m++;
			    			}
			    		}
			    		if(m == 0) {
			    			System.out.println("----------------");
			    			System.out.println("- 검색된 계좌 없음 -");
				    		System.out.println("----------------");
			    		}
		    		} else {
		    			System.out.println("----------------");
		    			System.out.println("- 기록된 계좌 없음 -");
			    		System.out.println("----------------");
		    		}
				 break;
			 case 5:
				 System.out.println("다음에 또 이용해주세요. 프로그램 종료합니다.");
				 System.exit(0); //프로그램종료 메소드 
			 break;
			 default: System.out.println("메뉴는 1~5 만 입력해주세요.");

		 }
	    	
	}
	}
	}
