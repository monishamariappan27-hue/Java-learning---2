package day4;

import java.util.Scanner;

public class Str {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
        String arr[] = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        for(int i =0; i<arr.length;i++) {
        	System.out.println(arr[i]);
        }
	}

}
