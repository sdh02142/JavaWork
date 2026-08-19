package ex0729.제어문;

public class IfExam02 {

	public static void main(String[] args) {
		//발생한 난수가 1이면 일요일, 2이면 월요일, 3이면 화요일, 4이면 수요일
		// 5이면 목요일 6이면 금요일, 이외의 수는 토요일 출력한다.
		//1~ 12사이 난수 발생 해서 변수에 담는다.
		int i = (int)(Math.random()*12 + 1);
		System.out.println(i);
		if (i == 1) System.out.println("일요일");
		else if (i == 2) System.out.println("월요일");
			else if (i == 3) System.out.println("화요일");
			else if (i == 4) System.out.println("수요일");
			else if (i == 5) System.out.println("목요일");
			else if (i == 6) System.out.println("금요일");
			else System.out.println("토요일");
		
		String d = (i == 1) ? "일" : (i == 2) ? "월" : (i == 3) ? "화" : (i == 4) ? "수" : (i == 5) ? "목" : (i == 6) ? "금" : "토";
		System.out.println(d + "요일");
	}

}
