package ex0803.ch05;

import java.util.Scanner;

public class Page201_09 {

	public static void main(String[] args) {
		//9번
		Scanner sc = new Scanner(System.in);
		boolean r = true;
		String inputValue = "";
		int num = 0;
		int studentNum = 0;
		int[] scores = null;
		
		while (r) {
			System.out.println("=====================================================");
			System.out.println(" 1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5.종료");
			System.out.println("=====================================================");
			System.out.print("선택> ");
			
			inputValue = sc.next();
			
			num = Integer.parseInt(inputValue);
			
			switch(num) {
				case 1 : 										
					System.out.print("학생 수> ");
					inputValue = sc.next();
					studentNum = Integer.parseInt(inputValue);
					scores = new int[studentNum];
					
					System.out.println();
					break;
				case 2 : 
					if(studentNum == 0) {
						System.out.println("학생 수를 먼저 입력해주세요.");
					} else {
//						scores = new int[studentNum];
						for(int i = 0; i<scores.length; i++) {
							System.out.print("scores[" + i + "]> ");
							inputValue = sc.next();
							scores[i] = Integer.parseInt(inputValue);
						}
					}
					break;
				case 3 : 
					if(scores == null) {
						System.out.println("점수를 먼저 입력해주세요.");
					} else {
						for(int i = 0; i < scores.length; i++) {
							System.out.println("scores[" + i + "] = " + scores[i]);
						}
					}
					break;
				case 4 : 
					if(scores == null) {
						System.out.println("점수를 먼저 입력해주세요.");
					} else {
						int temp = Integer.MIN_VALUE;
						double avg = 0;
						for(int i = 0; i < scores.length;i++) {
							avg+=scores[i];
							if(scores[i]>=temp) temp=scores[i];
						}
						System.out.println("최고 점수 : " + temp);
						System.out.println("평균 점수 : " + ((avg*1.0)/scores.length));
					}
					break;
				case 5 : 
					r=false;
					break;
				default : System.out.println("1부터 5 중 하나의 숫자를 입력해주세요.");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
