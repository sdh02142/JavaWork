package ex0803.report;

public class Lotto {
	public boolean checkDouble(int [] a, int b, int num) {
		for(int i = 0; i < b; i++) {
				if(a[i] == num) return false;
		}
		return true;
	}
	
	public void makeLotto(int [] a, int b) {
		while(b < a.length) {
			int num = (int)(Math.random()*46 + 1);
			if(this.checkDouble(a, b, num)) {
				a[b] = num;
				b++;
			}
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
			if(i == a.length-1) System.out.print(a[i]);
			else System.out.print(a[i]+", ");
		}
	}
	
	public static void main(String[] args) {
		Lotto l = new Lotto();
		int [] lotto = new int[6];
		int cnt = 0;
		
		l.makeLotto(lotto,cnt);
		l.sortLotto(lotto);
		l.displayLotto(lotto);
	}

}
