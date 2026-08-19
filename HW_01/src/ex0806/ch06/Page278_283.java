package ex0806.ch06;

public class Page278_283 {

	public static void main(String[] args) {
		/**
		 * 1. 3번
		 * 2. 4번
		 * 3. 4번
		 * 4. 3번
		 * 5. 1번
		 * 6. 4번
		 * 7. 2번
		 * 8. 2번
		 * 9. 2번
		 * 10. 4번
		 * 11. 3번
		 * 12. 필드, 생성자, 메서드
		 * */
		// 13. 
//		class Member{
//			String name;
//			String id;
//			String password;
//			int age;
//		}
		
		// 14. 
//		class Member{
//			String name;
//			String id;
//			String password;
//			int age;
//			
//			public Member(String name, String id) {
//				super();
//				this.name = name;
//				this.id = id;
//			}	
//		}
		
		//15. 
//		class MemberService{
//			public boolean login(String id, String password) {
//				if(id.equals("hong") && password.equals("12345")) return true;
//				else return false;
//			}
//			
//			public void logout(String id) {
//				System.out.println(id + "님이 로그아웃 되었습니다.");
//			}
//		}
		
		//16. 
//		class Printer{
//			public void println(String s) {
//				System.out.println(s);
//			}
//			public void println(int i) {
//				System.out.println(i);
//			}
//			public void println(boolean b) {
//				System.out.println(b);
//			}
//			public void println(double d) {
//				System.out.println(d);
//			}
//		}
		
		// 17.
//		class Printer{
//		public static void println(String s) {
//			System.out.println(s);
//		}
//		public static void println(int i) {
//			System.out.println(i);
//		}
//		public static void println(boolean b) {
//			System.out.println(b);
//		}
//		public static void println(double d) {
//			System.out.println(d);
//		}
//	}

		// 18.
//		class ShopService{
//		    private static ShopService ss  = new ShopService();
//		    //외부에서 객체생성 막는다.
//		    private ShopService(){  }//현재클래스내에서 접근가능!!
//		    
//		  //현재 객체를 직접생성해서 리턴해준다.
//		    public static ShopService getInstance( ){
//		       return ss;
//		  }
//		}
		
		// 19.
//		public class AccountDto {
//			public static final int MIN_BALANCE = 0;
//			public static final int MAX_BALANCE = 1000000;
//			
//			private int accountSeq;
//			private String accountNumber;
//			private int balance;
//			private int userSeq;
//			
//			public AccountDto(){}
//
//			public AccountDto(int accountSeq, String accountNumber, int balance, int userSeq) {
//				super();
//				this.accountSeq = accountSeq;
//				this.accountNumber = accountNumber;
//				this.balance = balance;
//				this.userSeq = userSeq;
//			}
//
//			public int getAccountSeq() {
//				return accountSeq;
//			}
//
//			public void setAccountSeq(int accountSeq) {
//				this.accountSeq = accountSeq;
//			}
//
//			public String getAccountNumber() {
//				return accountNumber;
//			}
//
//			public void setAccountNumber(String accountNumber) {
//				this.accountNumber = accountNumber;
//			}
//
//			public int getBalance() {
//				return balance;
//			}
//
//			public void setBalance(int balance) {
//				if(balance >= AccountDto.MIN_BALANCE && balance <= AccountDto.MAX_BALANCE) this.balance = balance;
//			}
//
//			public int getUserSeq() {
//				return userSeq;
//			}
//
//			public void setUserSeq(int userSeq) {
//				this.userSeq = userSeq;
//			}
//		}
	}

}
