package bt;

public class LKSNT5CS {

	    public static boolean LKSNT5CS(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        int start = 10000;
	        int end = 99999;

	        for (int num = start; num <= end; num++) {
	            if (LKSNT5CS(num)) {
	                System.out.print(num + " ");
	            }
	        }
	    }
	}
