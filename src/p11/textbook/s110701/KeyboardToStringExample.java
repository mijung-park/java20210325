package p11.textbook.s110701;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.println("입력:");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo-2); //window는 enter키를 2byte소요함. 엔터값 빼줌.
		System.out.println(str);
	}
}
