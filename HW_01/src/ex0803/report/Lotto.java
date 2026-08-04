package ex0803.report;

public class Lotto {
	public void checkDouble(int [] a) {
		int check = 0;
		for(int i = 0; i<a.length; i++) {
			check = a[i];
			for(int j = 0; j<a.length; j++) {
				if(check == a[j]) a[j] = (int)(Math.random()*46 + 1);
			}
		}
		
	}
	
	public void makeLotto(int [] a) {
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*46 + 1);
		}
	}
	
	public void sortLotto(int [] a) {
		for(int j = 0; j < a.length-1; j++) {
			for(int i = 0; i < a.length-1-j; i++) {
				if(a[i] < a[i+1]) {
					int temp = a[i+1];
					a[i+1] = a[i];
					a[i] = temp;
				}
			}
		}
	}
	
	public void displayLotto(int [] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Lotto l = new Lotto();
		int [] lotto = new int[6];
		
		l.makeLotto(lotto);
		l.checkDouble(lotto);
		l.sortLotto(lotto);
		l.displayLotto(lotto);
	}

}
