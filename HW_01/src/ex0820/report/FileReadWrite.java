package ex0820.report;

import java.io.File;
import java.util.Scanner;

public class FileReadWrite {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = "src/ex0820/";
		while(true){
	         System.out.println("--------------------------------------");
			 System.out.println("1.프로필 저장     2.프로필 불러오기      3.종료");
			 System.out.println("--------------------------------------");

	         System.out.print("메뉴 선택 > ");
			 int menuChoice = Integer.parseInt( sc.nextLine());

			 switch(menuChoice){
	             case 1 : 
	            	 System.out.print("이름 > ");
	            	 String name = sc.nextLine();
	            	 path += (name+".txt");
	            	 File file = new File(path);
	             	 if(file.exists()) {
	             		 System.out.println("중복된 이름");
	             		 break;
	             	 } else {
	             		 System.out.print("상품가격 > ");
	             		 int weight = Integer.parseInt(sc.nextLine());

	             		 System.out.print("상품가격 > ");
	             		 int password = Integer.parseInt(sc.nextLine());
	             		 
	             		 break;
	             	 }
					 
				 case 2 : 
				     break;
				 case 3 :  
					 System.out.println("다음에 또 이용해주세요. 프로그램 종료합니다.");
					 System.exit(0); //프로그램종료 메소드 
				 break;
				 default: System.out.println("메뉴는 1 ~ 3만 입력해주세요.");
			 }//switch문
		  }//while문
	}

}
