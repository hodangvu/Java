package bt;

import java.util.Scanner;

public class btmang2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Nhập độ dài của mảng
	        System.out.print("Nhập độ dài mảng: ");
	        int length = scanner.nextInt();

	        int[] arr = new int[length];

	        // Nhập các phần tử vào mảng
	        for (int i = 0; i < length; i++) {
	            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
	            arr[i] = scanner.nextInt();
	        }

	        // Xuất mảng
	        System.out.println("Mảng vừa nhập là:");
	        for (int i = 0; i < length; i++) {
	            System.out.print(arr[i] + " ");
	        }

	        // Tính tổng các phần tử trong mảng
	        int sum = 0;
	        for (int i = 0; i < length; i++) {
	            sum += arr[i];
	        }

	        // Tìm giá trị lớn nhất và nhỏ nhất trong mảng
	        int max = arr[0];
	        int min = arr[0];
	        for (int i = 1; i < length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }

	        // Tính trung bình cộng các phần tử trong mảng
	        double average = (double) sum / length;

	        // In kết quả
	        System.out.println("\nSum: " + sum);
	        System.out.println("Max: " + max);
	        System.out.println("Min: " + min);
	        System.out.println("Average: " + average);
	    }
	}
