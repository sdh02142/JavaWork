package ex0729.제어문;

public class IfExam01 {

	public static void main(String[] args) {
		// 1. 정수형 변수를 선언하고 적당히 초기화
		int i = (int)(Math.random()*56 + 45);
		// 2. 선언한 정수의 값이 짝수이면 "짝수", 아니면 "홀수"
//		if(i%2 == 0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		};
		String s = (i%2 == 0) ? "짝수" : "홀수";
		System.out.println(s);
		
		String s1 = (i%7 == 0) ? "7의 배수" : "7의 배수가 아님";
		System.out.println(s1);
		
//		int nansu = (int)(Math.random()*56 + 45);
		System.out.println(i);
	}

}
