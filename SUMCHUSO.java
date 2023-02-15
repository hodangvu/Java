package bt;

import java.util.Scanner;

public class SUMCHUSO {
	public static int SUMCHUSO(int n) {
        int sum = 0;
        while (n != 0) {
            int s = n % 10;
            sum += s;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        scanner.close();

        int SUMs = SUMCHUSO(n);
        System.out.println( + SUMs);
    }
}
