package ex0820.report;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		Scanner sc = new Scanner(System.in);
		while(true){
			String path = "src/ex0820/";
			
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
	             	 } else {
	             		 System.out.print("몸무게 > ");
	             		 int weight = Integer.parseInt(sc.nextLine());

	             		 System.out.print("비밀번호 > ");
	             		 int password = Integer.parseInt(sc.nextLine());
	             		 try{
	             			fos = new FileOutputStream(path);
	             			String text = weight + ":" + password;
	             			fos.write(text.getBytes());
	             		 } catch(Exception e) {
	             			 e.printStackTrace();
	             		 } finally {
	             			try {
	            				if(fos != null) fos.close();
	            			} catch(IOException e) {
	            				e.printStackTrace();
	            			}
	             		 }
	             	 }
	             	break;
				 case 2 : 
					 System.out.print("이름 > ");
	            	 String name01 = sc.nextLine();
	            	 path += (name01+".txt");
	            	 File file01 = new File(path);
	             	 if(file01.exists()) {
	             		 try{
	             			fis = new FileInputStream(path);
	             			int len = fis.available(); // 읽을 수 있는 byte 수 반환
	            			
	            			byte [] b = new byte[len];
	            			fis.read(b);
	            			String str = new String(b);
	            			String [] arr = str.split(":");
	            			
	            			System.out.println(name01+"님의 몸무게는 "+arr[0]+"kg이고 비밀번호는 "+arr[1]+"입니다.");
	             		 } catch(Exception e) {
	             			 e.printStackTrace();
	             		 } finally {
	             			try {
	            				if(fis != null) fis.close();
	            			} catch(IOException e) {
	            				e.printStackTrace();
	            			}
	             		 }
	             	 } else {
	             		System.out.println("존재하지 않는 이름");
	             	 }
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
