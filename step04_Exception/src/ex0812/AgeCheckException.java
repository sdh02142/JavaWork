package ex0812;

public class AgeCheckException extends Exception {
	int error = 1;
//	AgeCheckException(){
//		super();
//	}
	
	AgeCheckException(String s){
		super(s);
	}
}
