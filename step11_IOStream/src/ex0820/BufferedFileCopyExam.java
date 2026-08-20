package ex0820;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class BufferedFileCopyExam {
	public BufferedFileCopyExam(String readFile, String writeFile) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(readFile));
			bos = new BufferedOutputStream(new FileOutputStream(writeFile));
			
			while(true) {
				int i = bis.read();
				if(i==-1)break;
				bos.write(i);
			}
			System.out.println("Copy Complete");
		} catch (Exception e) {
			e.printStackTrace();
			} finally {
				try {
					if(bis != null) bis.close();
					if(bos != null) bos.close();
				} catch (Exception e) {
					e.printStackTrace();
					}
			}
	}

	public static void main(String[] args) {
		String readFile = JOptionPane.showInputDialog("Input path for reading");
		String writeFile = JOptionPane.showInputDialog("Input name for saving");
		
		new BufferedFileCopyExam(readFile, writeFile);
	}

}
