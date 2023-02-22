package bt;

import java.util.Scanner;

public class matran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhập ma trận 1:");
        int[][] matrix1 = NhapMaTran(sc);

        System.out.println("Nhập ma trận 2:");
        int[][] matrix2 = NhapMaTran(sc);

        int[][] sumMatrix = CongMaTran(matrix1, matrix2);
        System.out.println("Ma trận tổng:");
        XuatMaTran(sumMatrix);

        sc.close();
    }
    //nhập ma trận
    public static int[][] NhapMaTran(Scanner sc) {
        int dong, cot;
        System.out.print("Nhập số dòng: ");
        dong = sc.nextInt();
        System.out.print("Nhập số cột: ");
        cot = sc.nextInt();
        int[][] mt = new int[dong][cot];
        for (int i = 0; i < dong; i++)
            for (int j = 0; j < cot; j++) {
                System.out.printf("mt[%d][%d]: ", i, j);
                mt[i][j] = sc.nextInt();
            }
        return mt;
    }

    // Xuất ma trận
    public static void XuatMaTran(int[][] mt) {
        int dong = mt.length;
        int cot = mt[0].length;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("%d ", mt[i][j]);
            }
            System.out.println();
        }
    }

    // Cộng hai ma trận
    public static int[][] CongMaTran(int[][] mt1, int[][] mt2) {
        int dong = mt1.length;
        int cot = mt1[0].length;
        int[][] rs = new int[dong][cot];
        for (int i = 0; i < dong; i++)
            for (int j = 0; j < cot; j++) {
                rs[i][j] = mt1[i][j] + mt2[i][j];
            }
        return rs;
    }
}
