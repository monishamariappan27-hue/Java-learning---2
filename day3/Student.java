package day4;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
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
