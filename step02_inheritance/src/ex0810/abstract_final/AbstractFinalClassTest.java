//Error 를 수정하고 이유를 주석으로 처리하세요.
package ex0810.abstract_final;

/*final*/ class FinalClassExam{ // 상속 불가, 생성 가능
 final int i = -999999; 
}


abstract class AbstractClassExam{ // 상속 가능, 생성 불가
    abstract String abstractMethodExam(int i,String s);    
    final int finalMethodExam(int i, int j){ 
        return i+j;
    }
}


class Sample01 extends AbstractClassExam{
	String abstractMethodExam(int i,String s){
		System.out.println("return "+s+i);
		return s+i;
	}
	
	/*int finalMethodExam(int i, int j){ <- 부모 class 내의 final method의 경우, overriding 불가
		return i*j;
	}*/ 
	
}

class Sample02 extends FinalClassExam{  }


 
 class Sample03 extends AbstractClassExam{
	 String abstractMethodExam(int i, String s, String r){
		return s + i + r;
	 }
	/*abstract*/ String abstractMethodExam(int i, String s) {
		return s + i;
	};    

	void sampleMethod03(){
		System.out.println("void sampleMethod03() 호출 됨");
	}
}

class AbstractFinalClassTest{
    public static void main(String args[]){
		AbstractClassExam ace /* = new Sample03()*/; 
		FinalClassExam fce = new FinalClassExam();
		// fce.i=100000;
		Sample01 s01 = new Sample01();
		AbstractClassExam aceS01 = new Sample01();
		aceS01.abstractMethodExam(700,"_999");
	}
}
