package p11.textbook.s110702;

public class StringSubStringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondnum = ssn.substring(7);
		System.out.println(secondnum);
	}
}
