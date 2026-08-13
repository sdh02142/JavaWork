package ex0812;

public class ExceptionExam {

	public static void main(String[] args) {
		System.out.println("*** Exception Test ***");
		System.out.println("args = " + args);
		try {
		System.out.println("args[0] = " + args[0]);
		
		int i = Integer.parseInt(args[0]);
		System.out.println(i);
		
		int result = 100/i;
		System.out.println(result);
		
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("e.getMessage() = " + e.getMessage());
			// e = 발생한 예외 클래스 : 발생한 예외 메세지
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
			// 예외 처리를 설계할 때는 범주가 작은 것부터 점차 큰 범주로
			// 나열해서 처리하는 것이 일반적인 코딩 설계 방식
			// 큰 범주의 예외 처리에서 로직의 오류가 잡히면 구체적인 오류 분석에
			// 어려움이 있기 때문.
		}
		
		System.out.println("*** Exception End ***");
	}

}
