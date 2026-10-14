package day4;

import java.util.Scanner;

public class Lng {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }
        for(int i =0; i<arr.length;i++) {
        	System.out.println(arr[i]);
        }
	}

}
