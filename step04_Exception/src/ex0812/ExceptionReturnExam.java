package ex0812;

public class ExceptionReturnExam {
	
	public void aa(int i) {
		try {
			if(i == 0) {
				// return;
				System.exit(i); // 프로그램 강제 종료
								// -> 모든 코드의 실행을 무시하고 강제 종료시킴
								// -> finally 실행 안 됨.
				}
			System.out.println(i);
		} finally {
			System.out.println("aa() End");
		}	
	}
	
	public static void main(String[] args) {
		System.out.println("*** Main Start ***");
		
		new ExceptionReturnExam().aa(0);
		
		System.out.println("*** Main End ***");
	}

}
