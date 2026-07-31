package ex0729.ch03;

/**
 * @author 주우진
 * 날짜 : 2026-07-29
 * 주제 : chapter 03
 * */

public class Page109_110 {

	public static void main(String[] args) {
		/*
		 * 1. 31
		 * 2. 가
		 * 3. pancils / students | pancils % students
		 * 4. value/100*100
		 * 5. 1, 2, 3
		 * 6. true, false
		 * 7. Double.isNaN(z)
		 * */
		int a = 1;
		int b = 4;
		int i = 7;
		double c = (double)((a + b)*i/2);
		double d = (double)(a + b)*i/2;
		System.out.println(c); // 계산이 다 이루어져서 int형의 값이 나오고 그 뒤에 형변환이 이루어지므로 소수점 밑 값이 표현되지 않음.
		System.out.println(d);
	}

}
