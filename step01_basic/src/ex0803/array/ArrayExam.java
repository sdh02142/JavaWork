package ex0803.array;

class ArrayExam{
	//각int,double,char,boolean ,String type별로 총 5개씩 저장하는  배열을 생성하세요
	int [] ia = new int[5];
	double [] da = new double[5];
	char [] ca = new char[5];
	boolean [] ba = new boolean[5];
	String [] sa = new String[5];

	//메소드 : printArrayValue01	
	//위의 배열들에 자동으로 초기화 된값을 출력하세요
	public void printArrayValue01(int[] a) {
		for(int j = 0; j < a.length; j++) {
			System.out.println("a[" + j + "] = " + a[j]);
		}
		System.out.println();
	}
	
	public void printArrayValue01(double[] a) {
		for(int j = 0; j < a.length; j++) {
			System.out.println("a[" + j + "] = " + a[j]);
		}
		System.out.println();
	}
	
	public void printArrayValue01(char[] a) {
		for(int j = 0; j < a.length; j++) {
			System.out.println("a[" + j + "] = " + a[j]);
		}
		System.out.println();
	}
	
	public void printArrayValue01(boolean[] a) {
		for(int j = 0; j < a.length; j++) {
			System.out.println("a[" + j + "] = " + a[j]);
		}
		System.out.println();
	}
	
	public void printArrayValue01(String[] a) {
		for(int j = 0; j < a.length; j++) {
			System.out.println("a[" + j + "] = " + a[j]);
		}
		System.out.println();
	}

	//메소드 : printArrayValue02	
	//위의 5개의 배열에서 각각 적당한 값으로 data를 할당하세요.
	public void printArrayValue02(int[] a) {
		for(int j = 0; j < a.length; j++) {
			a[j]=7;
		}
	}
	
	public void printArrayValue02(double[] a) {
		for(int j = 0; j < a.length; j++) {
			a[j]=7.14;
		}
	}
	
	public void printArrayValue02(char[] a) {
		for(int j = 0; j < a.length; j++) {
			a[j]='S';
		}
	}
	
	public void printArrayValue02(boolean[] a) {
		for(int j = 0; j < a.length; j++) {
			a[j]=true;
		}
	}
	
	public void printArrayValue02(String[] a) {
		for(int j = 0; j < a.length; j++) {
			a[j]="Test";
		}
	}	
	
	//메소드 : printArrayValue03	
	//새롭게 할당된값을 출력하세요
	public void printArrayValue03(int[] a) {
		for(int j = 0; j < a.length; j++) {
			System.out.println("a[" + j + "] = " + a[j]);
		}
		System.out.println();
	}
	
	public void printArrayValue03(double[] a) {
		for(int j = 0; j < a.length; j++) {
			System.out.println("a[" + j + "] = " + a[j]);
		}
		System.out.println();
	}
	
	public void printArrayValue03(char[] a) {
		for(int j = 0; j < a.length; j++) {
			System.out.println("a[" + j + "] = " + a[j]);
		}
		System.out.println();
	}
	
	public void printArrayValue03(boolean[] a) {
		for(int j = 0; j < a.length; j++) {
			System.out.println("a[" + j + "] = " + a[j]);
		}
		System.out.println();
	}
	
	public void printArrayValue03(String[] a) {
		for(int j = 0; j < a.length; j++) {
			System.out.println("a[" + j + "] = " + a[j]);
		}
		System.out.println();
	}
	
	//메인메소드에서
	//ArrayExam의 메소드들을 순서대로 호출하세요.
	public static void main(String[] args) {
		ArrayExam ae = new ArrayExam();
		ae.printArrayValue01(ae.sa);
		ae.printArrayValue02(ae.sa);
		ae.printArrayValue03(ae.sa);
	}
}