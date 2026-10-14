package day4;

import java.util.Scanner;

public class Dbl {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
	        double arr[] = new double[n];
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextDouble();
	        }
	        for(int i =0; i<arr.length;i++) {
	        	System.out.println(arr[i]);
	        }
	}

}
