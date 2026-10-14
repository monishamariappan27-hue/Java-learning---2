package day4;

import java.util.Scanner;

public class Flt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        float arr[] = new float[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextFloat();
        }
        for(int i =0; i<arr.length;i++) {
        	System.out.println(arr[i]);
        }
	}

}
