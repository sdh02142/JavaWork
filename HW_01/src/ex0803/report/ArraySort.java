package ex0803.report;

public class ArraySort {

	public static void main(String[] args) {
		int [] arr = {5, 7, 1, 2, 4, 3, 8, 9, 6, 10};
		for(int j = 0; j < arr.length-1; j++) {
			for(int i = 0; i < arr.length-1-j; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		
	}

}
