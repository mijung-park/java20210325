package p11.lecture.wrapper;

public class A02Equals {
	public static void main(String[] args) {
		Integer i1 = 9999999;
		Integer i2 = new Integer(9999999);
		
		int int1 = i1;
		int int2 = i2;
		
		System.out.println(i1 == i2);     // 참조타입이기때문에 참조값을 비교
		System.out.println(int1 == int2); 
		System.out.println(i1.equals(i2));
	}

}
