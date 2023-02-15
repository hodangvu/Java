package bt;

import java.util.Scanner; 

public class LKNSONTDT {
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhap n: ");
	        int n = scanner.nextInt();
	        scanner.close();

	        int count = 0;
	        int num = 2;
	        while (count < n) {
	            if (LKSONTDT(num)) {
	                System.out.print(num + " ");
	                count++;
	            }
	            num++;
	        }
	    }
	    public static boolean LKSONTDT(int num) {
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
	}
