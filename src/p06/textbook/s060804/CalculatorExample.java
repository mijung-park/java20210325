package p06.textbook.s060804;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator calc1 = new Calculator();
		
		// 정사각형의 넓이구하기
		double result1 = calc1.areaRectangle(10);
		
		// 직사각형의 넓이구하기
		double result2 = calc1.areaRectangle(10, 20);
		
		// 결과출력
		System.out.println("정사각형의 넓이: " + result1);
		System.out.println("직사각형의 넓이: " +result2);
	}
}
