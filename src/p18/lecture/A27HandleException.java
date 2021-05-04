package p18.lecture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class A27HandleException {
	public static void main(String[] args) {
		String path = "src/p18/lecture/A27HandleException.java";
		
		// try with resources
		try (
				FileInputStream fis = new FileInputStream(path);
				FileOutputStream fos = new FileOutputStream(path);
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
				){
			
			fis.read();
			bis.read();
			fos.write('a');
			bos.write('b');
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
