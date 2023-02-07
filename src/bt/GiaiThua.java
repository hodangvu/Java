package bt;

import java.util.Scanner;

public class GiaiThua {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap gia tri n: ");
		n = sc.nextInt(); 
		GiaiThua(n); 
	}
	public static void GiaiThua(int n) {
		int ketqua = 1;
		for(int i = 1; i<= n; i++) ketqua = ketqua * i;
		System.out.println("Giai thua la: " + ketqua);
	}
}
