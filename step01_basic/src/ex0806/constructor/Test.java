package ex0806.constructor;

class Test{
    private static Test t  = new Test();
    //외부에서 객체생성 막는다.
    private Test(){  }//현재클래스내에서 접근가능!!
    
  //현재 객체를 직접생성해서 리턴해준다.
    public static Test getInstance( ){
       return t;
  }
}