package p18.textbook.ex07;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "src/p18/textbook/ex07/AddLineNumberExample.java";
		
		FileReader reader = new FileReader(filePath);
		BufferedReader br = new BufferedReader(reader);
		
		String line = null;
		int lineNum = 0;
		while((line = br.readLine()) != null) {
			System.out.println((++lineNum) + ": " + line);
		}
		
		br.close();
		reader.close();
	}
}
