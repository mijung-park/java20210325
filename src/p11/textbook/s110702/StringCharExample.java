package p11.textbook.s110702;

public class StringCharExample {
	public static void main(String[] args) {
		String ssn = "010624-5230123";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자 입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자 입니다.");
			break;
		default :
			System.out.println("주민등록번호를 바르게 입력해주세요.");
			break;
		
		}
	}
}
