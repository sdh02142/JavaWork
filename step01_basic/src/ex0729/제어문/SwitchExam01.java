package ex0729.제어문;

public class SwitchExam01 {

	public static void main(String[] args) {
		int i = (int)(Math.random()*12 + 1);
		System.out.println(i);
		
		switch (i) {
		case 1:
			System.out.println("일요일");
			break;
		case 2:
			System.out.println("월요일");
			break;
		case 3:
			System.out.println("화요일");
			break;
		case 4:
			System.out.println("수요일");
			break;
		case 5:
			System.out.println("목요일");
			break;
		case 6:
			System.out.println("금요일");
			break;
		default : System.out.println("토요일");
		}
		
		String[] days = {"일", "월", "화", "수", "목", "금", "토"};
		for (int j = 1; j <= 7; j++) {
			if(i == j) System.out.println(days[i-1] + "요일");
			else if (j == 7 && i >= j) System.out.println(days[6] + "요일");
		}
	}

}
