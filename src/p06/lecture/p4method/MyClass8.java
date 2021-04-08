package p06.lecture.p4method;

public class MyClass8 {
	
	int max(int... a) {
		if (a.length == 0) {
			return 0;
		}
		
		int mv = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(mv < a[i]) {
				mv = a[i];
			}
		}
		return mv;
	}
}
