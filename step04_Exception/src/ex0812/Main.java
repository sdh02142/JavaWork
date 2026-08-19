package ex0812;

public class Main {

	public static void main(String[] args) {
		int n = 0;
		int error = 0;
		
//		String[] strArray = {"10", "2a"};
		
	while(true) {
		int random = (int)(Math.random()*55 + 1);
		try {
			new ShoppingMall().inputAge(random);
		} catch (AgeCheckException e) {
			System.out.println(e.getMessage());
			error += e.error;
		} finally {
			n++;
			if(n > 9) {
				System.out.println("오류 발생 회수 : " + error);
				break;
			}
		}
//		try {
//			error = Integer.parseInt(strArray[n]);
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Out of Index");
//		} catch(NumberFormatException e) {
//			System.out.println("Can't convert Int");
//		} finally {
//			System.out.println(error);
//		}
//		
//		n++;
	}
	}

}
