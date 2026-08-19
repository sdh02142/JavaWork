package ex0803.array;

class ArrayValue{
	//정수형 10개 저장하는 배열선언(선언과 동시에 임의값 지정)
	int [] i = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

   /*printArrayvalue 메소드작성
       => 메소드 안에서 위에 선언된 배열방의 값을 출력한다.
   
	*/			
	public void printArrayvalue(int[] a) {
		for(int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
	}
}

/////////////////////////////////////////////////
class ArrayValueExam{
	public static void main(String args []){
        // ArrayValue에 있는 printArrayvalue메소드 호출
		ArrayValue av = new ArrayValue();
		av.printArrayvalue(av.i);
	}
}