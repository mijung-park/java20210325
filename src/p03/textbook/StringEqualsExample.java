package p03.textbook;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "박미정";
		String strVar2 = "박미정";
		String strVar3 = new String ("박미정");
		
		System.out.println(strVar1);
		System.out.println(strVar2);
		System.out.println(strVar3);
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		
	}
}
