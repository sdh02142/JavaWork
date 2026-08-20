package ex0820.report;

import java.util.Scanner;

import ex0805.constructor.goods.sol.EndView;
import ex0805.constructor.goods.sol.Goods;

public class FileReadWrite {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
	         System.out.println("---------------------------------------------------------------------------");
			 System.out.println("1.등록     2.전체검색      3.상품코드검색    4. 수정하기   5. 삭제하기   9.종료");
			 System.out.println("----------------------------------------------------------------------------");

	         System.out.print("메뉴 선택 > ");
			 int menuChoice = Integer.parseInt( sc.nextLine());

			 switch(menuChoice){
	             case 1 : 
					 this.inputInsert() ; break;
				 case 2 : 
					 Goods [] goodsArr = service.selectAll(); 
				     EndView.printSelectAll(goodsArr);
				      break;
				 case 3 : 
					 this.inputSelectByCode();
					 break;
				 case 4 : 
					 this.inputUpdate() ; 
					 break;
				 case 5:
					 this.inputDeleteCode();
						break;	 
				 case 9 : 
					 System.out.println("다음에 또 이용해ㅜㅈ세요. 프로그램 종료합니다.");
					 System.exit(0); //프로그램종료 메소드 
				 break;
				 default: System.out.println("메뉴는 1~4 or 9 만 입력해주세요.");

			 }//switch문

		  }//while문
	}

}
