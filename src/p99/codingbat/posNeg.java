package p99.codingbat;

public class posNeg {
	public boolean posNeg(int a, int b, boolean negative) {
		 
		 
		// if ((a > 0 && b < 0) && negative == false) {
		// return true;  
		// } else if ((a < 0 && b > 0) && negative == false) {
		// return true;  
		// } else if ((a < 0 && b < 0) && negative == false) {
		//   return false;
		// } else if ((a < 0 && b < 0) && negative == true) {
		//   return true;
		// }
		//   return false;

		  
//		  if (negative) {
//		    return (a < 0 && b < 0);
//		  }
//		  else {
//		    return ((a < 0 && b > 0) || (a > 0 && b < 0));
//		  }
		  
		  
		  if (negative) {
			  return (a < 0 && b < 0);
		  } else {
			  return (a*b) < 0;
		  }
		  
		  
		}
}
