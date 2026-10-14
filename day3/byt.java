package day4;

import java.util.Scanner;

public class byt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        byte arr[] = new byte[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextByte();
        }
        for(int i =0; i<arr.length;i++) {
        	System.out.println(arr[i]);
        }
	}

}
