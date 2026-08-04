package ex0803.overloading;
class Test{
     public void aa(){
    	 System.out.println(1);
     }
     public int aa(int i){
    	 System.out.println(2);
        return 4;
     }
     protected void aa(String s){
    	 System.out.println(3);
     }

     String aa(int i, String s){
    	 System.out.println(4);
       return "ddd";
    }
     
     public static void main(String[] args) {
    	//메소드 호출
    	  Test t =new Test();
    	  t.aa();
    	  t.aa(3);
    	  t.aa("하이");
    	  t.aa(3,"하이");
	}
 }

//ex)
//System.out.println(4);
//System.out.println("4");
//System.out.println(4.4);
//System.out.println(true);
//
//
//
//class PrintStream {
//
//    제한자 리턴타입 println(){
//
//    }
//}