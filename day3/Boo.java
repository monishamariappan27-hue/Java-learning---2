package day4;

import java.util.Scanner;

public class Boo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        boolean arr[] = new boolean[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextBoolean();
        }
        for(int i =0; i<arr.length;i++) {
        	System.out.println(arr[i]);
        }
	}

}
