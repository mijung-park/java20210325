package p06.textbook.Exercise.ex15;

public class MemberService {
	String id;
	String password;
	
	boolean login(String id, String password) {
//		if (id == "hong" && password =="12345") {
//			return true;		
//		} else {
//			return false;
//		}
		return id.equals("hong") && password.equals("12345");
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

}
