package ex0729.report;

public class Exercise04 {

	public static void main(String[] args) {
		boolean a = true;
		while (a) {
			int b = (int)(Math.random()*6+1);
			int c = (int)(Math.random()*6+1);
			
			System.out.println("(" + b + ", " + c + ")");
			
			if(b + c == 5) {
				a = false;
			}
		}
	}

}
