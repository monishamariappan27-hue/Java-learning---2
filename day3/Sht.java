package day4;

import java.util.Scanner;

public class Sht {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        short arr[] = new short[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextShort();
        }
        for(int i =0; i<arr.length;i++) {
        	System.out.println(arr[i]);
        }
	}

}
