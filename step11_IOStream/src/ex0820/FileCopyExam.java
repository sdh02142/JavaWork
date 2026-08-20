package ex0820;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class FileCopyExam {
	public FileCopyExam(String readFile, String writeFile) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(readFile);
			fos = new FileOutputStream(writeFile);
			
			while(true) {
				int i = fis.read();
				if(i==-1)break;
				fos.write(i);
			}
			System.out.println("Copy Complete");
		} catch (Exception e) {
			e.printStackTrace();
			} finally {
				try {
					if(fis != null) fis.close();
					if(fos != null) fos.close();
				} catch (Exception e) {
					e.printStackTrace();
					}
			}
	}

	public static void main(String[] args) {
		String readFile = JOptionPane.showInputDialog("Input path for reading");
		String writeFile = JOptionPane.showInputDialog("Input name for saving");
		
		new FileCopyExam(readFile, writeFile);
	}

}
