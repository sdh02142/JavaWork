package ex0821;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileReaderWriterExam {
	public BufferedFileReaderWriterExam() {
		// 문자 단위로 파일을 읽기/쓰기 -> Buffered 사용
		BufferedReader br = null;
		BufferedWriter bw = null;
		try{
			// 객체 생성
			br = new BufferedReader(new FileReader("src/ex0820/BufferedFileCopyExam.java"));
			
//			int i = 0;
//			while((i = br.read()) != -1) {
//				System.out.println("(char)" + i +" = " + (char)i);
//			} -> 한 문자(char)씩 읽기
			
			String str = null;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
			// 파일 저장
			bw = new BufferedWriter(new FileWriter("src/ex0821/save.txt"));
			bw.write("This statement is false.\n");
			bw.write("The cake is fake.");
			
			bw.newLine();
			bw.write("Potados");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// close()
				if(br != null)br.close();
				if(bw != null)bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new BufferedFileReaderWriterExam();
	}
}
