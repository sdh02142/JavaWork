package ex0804.ch05;

class A{
	double e;
	float f;
	boolean b;
}

public class Page200_201 {

	public static void main(String[] args) {
		/*
		 * 4. 2번
		 * 5. 3번
		 * 6. array.length = 3, array[2].length = 5
		 * */
//		int[] a = {};
//		int[] b;
//		b = {1,2,3};
//		int [] c = new int[3];
//		int [][] d = new int[3][2];
//		double e = new double();
//		float f;
//		A aClass = new A();
//		System.out.println(aClass.e);
//		System.out.println(aClass.f);
//		System.out.println(aClass.b);
		// 8번
		int [][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
				};
		int sum = 0;
		int cnt = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
			cnt +=array[i].length;
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + ((sum*1.0)/cnt));
	}

}
