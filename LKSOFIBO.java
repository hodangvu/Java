package bt;

import java.util.Scanner;

public class LKSOFIBO {
	public static boolean FIBO(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        scanner.close();

        int a = 1, b = 1, c = 0;
        System.out.print("Fibonacci nhỏ hơn n la số nguyên tố: ");
        while (c < n) {
            c = a + b;
            a = b;
            b = c;	
            if (c < n && FIBO(c)) {
                System.out.print(c + " ");
            }
        }
    }
}
