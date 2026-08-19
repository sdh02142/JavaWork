package ex0731.scanner;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어> ");
		int kor = sc.nextInt();
		
		System.out.println("영어> ");
		int eng = sc.nextInt();
		
		System.out.println("수학> ");
		int math = sc.nextInt();
		
		System.out.println("이름> ");
		String name = sc.next();
		
		System.out.println("이름 : " + name + "\n국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math);
	}

}
