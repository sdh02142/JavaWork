package mvc.view;

import java.util.Scanner;

import mvc.controller.ElectronicsController;
import mvc.dto.Person;

/**
   사용자의 요청을 키보드로 입력받는 클래스 
*/
public class MenuView{
    Scanner sc= new Scanner(System.in);
	ElectronicsController controller = new ElectronicsController(); // 전역변수 초기화, 생성자 호출 

	/**
	  전체 메뉴를 출력하는 메소드
	*/
	public void printMenu(){
        
		 while(true){
	           System.out.println("----------------------------------------------------------------------------------");
	           System.out.println("1. 몸무게 입력      2. 몸무게 검색      3. 몸무게 변경      4. 비밀번호 변경      5. 프로그램 종료");
			   System.out.println("----------------------------------------------------------------------------------");
			   System.out.print("메뉴선택 > ");

			   String  menu = sc.nextLine();
			   switch(menu){
	               case "1" : 
	            	 this.inputInsert();
				   break;
				   case "2" : 
	                 this.inputSearch();
				   break;
				   case "3" : 
	                 this.inputUpdate();
				   break;
				   case "4" : 
	                 this.inputUpdate();
				   break;
				   case "5" : 
	                 System.exit(0);
				   default:
					   System.out.println("메뉴를 다시 선택해주세요!!!!");

			   }//switch문끝

			 }//while문끝
	}//메소드끝

	/**
	   등록할때 키보드 입력을 처리하는 메소드
	*/
	public void inputInsert(){
		System.out.print("이름> ");
        String name = sc.nextLine();

		System.out.print("몸무게> ");
        int weight = Integer.parseInt(sc.nextLine());

		System.out.print("비밀번호> ");
        String pw = sc.nextLine();
        
		controller.insert( new Person(name, weight, pw) );
	}

	/**
	  이름과 비밀번호에 해당하는 몸무게를 출력하는 메소드
	*/
    public void inputSearch(){
    	System.out.print("이름> ");
        String name = sc.nextLine();

		System.out.print("비밀번호> ");
        String pw = sc.nextLine();
		controller.searchByModelNo(name, pw);
	}


	/**
	  모델번호에 해당하는 설명을 수정하기 위해 키보드 입력처리하는 메소드
	*/
	public void inputUpdate(){
		System.out.print("이름> ");
        String name = sc.nextLine();
        
        System.out.print("변경하려는 모델설명은? ");
        String modelDetail = sc.nextLine();
        
        System.out.print("수정하려는 전자제품 모델번호는?? ");
        int modelNo = Integer.parseInt(sc.nextLine());

		

		controller.update( new Person(modelNo , modelDetail) );

	}
	
	/**
	  모델번호에 해당하는 전자제품 삭제 위해서 모델번호 키보드입력 처리하는 메소드
	*/
  public void inputDelete(){
     System.out.print("삭제 할 전자제품 모델번호는? ");
      int modelNo = Integer.parseInt(sc.nextLine());
		controller.deleteModelNo(modelNo);

 
	}

}