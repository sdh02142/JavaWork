package ex0803.ch05;

public class Page201_07 {

	public static void main(String[] args) {
		//7번
		int [] arr = {1, 5, 3, 8, 2};
		int num = 0;
		
		for(int i = 0; i < arr.length;i++) {
			if(arr[i]>=num) num=arr[i];
		}
		System.out.println(num);
	}

}
