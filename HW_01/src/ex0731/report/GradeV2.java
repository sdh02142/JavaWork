package ex0731.report;

import java.util.Scanner;

class GetGrade{
	private int totalPoint(int a, int b, int c) {
		return a+b+c;
	}
	
	private double avgPoint(int total, int sub) {
		double avg = (total*1.0)/sub;
		avg = avg - avg%0.01;
		return avg;
	}
	
	private char grade(double a) {
		char grade = switch ((int)(a/10)) {
		case 10, 9 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		default -> 'F';
		};
		return grade;
	}
	
	public void GradePresent(String name, int kor, int eng, int math) {
		int totalPoint = this.totalPoint(kor, eng, math);
		double avg = this.avgPoint(totalPoint, 3);
		char grade = this.grade(avg);
		
		System.out.println("이름 : "+ name + "\n국어 : " + kor + "\n영어 : " + eng + "\n수학 : " + math + "\n총점 : " + totalPoint + "\n평균 : " + avg + "\n학점 : " + grade);
	}
}


/*
 * 성적프로그램 ver2
   : 성적프로그램이 계속 반복한다.
   
   :  1. 성적표구하기     2. 종료 라는 메뉴를 만든다.
         그리고 그 메뉴에 따라 기능을 실행한다.
 

성적구하는 기능을 담당하는 클래스 
   1) 국어, 영어, 수학 점수를 인수받아 총점을 구하여
      총점을 리턴하는 메소드 작성
      (접근제한자 private)

   2) 총점과 과목수(int) 를 인수로받아 평균을 구하여
      평균을 리턴하는 메소드 작성 
      (접근제한자 private)

   3) 평균을 인수로 받아 등급을 구하여 등급을 리턴해주는
       메소드 작성한다(접근제한자 private)
   
   4) 이름, 국어, 영어, 수학 점수를 인수로 받아
      총점 , 평균 ,등급 을 구하여 그 결과를 화면에 출력하는
      메소드를 선언하세요.
      (접근제한자 public,
       총점과 평균 , 등급은 이미 만들어진 1) , 2) ,3) 메소드를 호출
       하여 그 결과를 통해 얻어온다)

   

  : 메인 메소드를 가지고 있는 클래스는 따로 만든다.
      - 메인메소드안에서 메뉴를 출력하고 메뉴 선택(1. 성적표구하기     2. 종료 )에 따라 
         성적표를 구하거나 종료를한다.
            * 1번 메뉴를 선택하면 이름, 국어,영어,수학 점수를 키보드로 입력받는다.

               2번 메뉴를 선택하면 프로그램을 종료한다. 
 * */
public class GradeV2 {

	public static void main(String[] args) {
		boolean r = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		String inputValue = "";
		
		int num = 0;
		
		while (r) {
			System.out.println("================================");
			System.out.println(" 1. 성적표 구하기  |     2. 종료");
			System.out.println("================================");
			System.out.print("선택> ");
			
			inputValue = sc.next();
			
			num = Integer.parseInt(inputValue);
			
			switch(num) {
				case 1 : 
					GetGrade gg = new GetGrade();
					
					System.out.print("이름> ");
					inputValue = sc.next();
					String name = inputValue;
					
					System.out.print("국어> ");
					inputValue = sc.next();
					int kor = Integer.parseInt(inputValue);
					
					System.out.print("영어> ");
					inputValue = sc.next();
					int eng = Integer.parseInt(inputValue);
					
					System.out.print("수학> ");
					inputValue = sc.next();
					int math = Integer.parseInt(inputValue);
					
					System.out.println();
					gg.GradePresent(name, kor, eng, math);
					break;
				case 2 : 
					r=false;
					break;
				default : System.out.println("1과 2 둘 중 하나의 숫자를 입력해주세요.");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
