package ex0820;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputExam {
	public FileInputOutputExam() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("src/ex0820/a.txt");
			// byte 단위로 파일 읽기
			/*while(true) {
				int i = fis.read();
				if( i == -1 ) break;
				System.out.println(i + " : " + (char)i);
			}*/
			// byte [](배열) 크기만큼 파일을 한번에 읽기
			
			int len = fis.available(); // 읽을 수 있는 byte 수 반환
			System.out.println("len : " + len);
			byte [] b = new byte[len];
			fis.read(b);
			
			// byte[]을 String으로 변환
			String str = new String(b);
			System.out.println(str);
			
			// 파일에 내용 저장 -> 쓰기
			fos = new FileOutputStream("src/ex0820/save.txt");
//			fos = new FileOutputStream("src/ex0820/save.txt", true);
//			fos.write(65); // A
//			fos.write(66); // B
//			fos.write(67); // C
//			
//			fos.write(13); // \
//			fos.write(10); // n
//			
//			fos.write(70); // F
//			
//			// String -> byte[]로 변환
//			String data = "\nHello World!";
//			fos.write(data.getBytes());
			fos.write(b);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		new FileInputOutputExam();
	}
}
