package ex0821;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializableLoadExam {
	public SerializableLoadExam() {
		// 객체 저장
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/ex0821/save.txt"))){
//			Member m1 = (Member)ois.readObject();
//			Member m2 = (Member)ois.readObject();
//			Member m3 = (Member)ois.readObject();
			List<Member> list = (List<Member>)ois.readObject();
			
//			System.out.println(m1);
//			System.out.println(m2);
//			System.out.println(m3);
			
			System.out.println(list);
			System.out.println(list.size());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new SerializableLoadExam();
	}
}
