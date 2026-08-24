package ex0821;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializableSaveExam {
	public SerializableSaveExam() {
		// 객체 저장
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/ex0821/save.txt"))){
			Member m1 = new Member("a", 20, "서울");
			Member m2 = new Member("b", 30, "대전");
			Member m3 = new Member("c", 40, "부산");
			
//			oos.writeObject(m1);
//			oos.writeObject(m2);
//			oos.writeObject(m3);
			
			List<Member> list = new ArrayList<Member>();
			list.add(m1);
			list.add(m2);
			list.add(m3);
			
			oos.writeObject(list);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new SerializableSaveExam();
	}
}
