package ex0812;

public class ThrowsException {
	public void aa(int i) throws ArithmeticException{
		System.out.println("aa() Start");
		try {
		this.bb(i);
		} finally {
			System.out.println("aa() End");
			}
	}
	
	public void bb(int i) throws ArithmeticException, NumberFormatException {
		System.out.println("bb() Start");
		try { // -> 직접 처리 방식
		int result = 100/i; // ArithmeticException 발생 가능성 있음.
 		System.out.println("result = " + result);
		//} catch() {
			
		} finally {
		System.out.println("bb() End");
		}
	}
	
	public static void main(String[] args) throws ArithmeticException{
		System.out.println("*** main Start ***");
		
		ThrowsException te = new ThrowsException();
		try {
		te.aa(1);
		} catch (ArithmeticException e) {
			System.out.println("Exception 발생");
			e.printStackTrace();
		}
		System.out.println("*** main End ***");
	}

}
