package ex0803.ch05;

public class Page201_07 {

	public static void main(String[] args) {
		//7번
		int [] arr = {1, 5, 3, 8, 2};
		// 주어진 배열 내의 값들은 자연수 범위이나,
		// 코드 전체적인 시점에서 보다 유연한 최소값 설정은
		// Integer 내의 최소값 설정을 추천.
		int num = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length;i++) {
			if(arr[i]>=num) num=arr[i];
		}
		System.out.println(num);
	}

}
