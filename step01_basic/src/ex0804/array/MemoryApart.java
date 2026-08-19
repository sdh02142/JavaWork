package ex0804.array;

class MultiArray{
	//정수형 2차원 배열 8*9
		int multi[][] = new int[8][9];
	//메소드이름 :array99
		public void array99() {
			for(int j = 2; j<=9; j++) {
				for(int i = 1; i<=9; i++) {
					multi[j-2][i-1] = i*j;
					System.out.print(multi[j-2][i-1] + " ");
				}
				System.out.println();
			}
		}
		//for loop 를 사용하여 
		//배열에 곱한 (구구단)결과저장
		//배열에 결과를 꺼내출력

	}
	public class MemoryApart{
	//main메소드에서 
	//MultiArray객체의 array99메소드호출
		public static void main(String[] args) {
//			MultiArray ma = new MultiArray();
//			ma.array99();
			
			new MultiArray().array99();
		}
		
	}

