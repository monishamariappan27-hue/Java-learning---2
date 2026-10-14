package day4;

import java.util.Scanner;

public class Change3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=5;
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		arr[3]=15;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
	}

	}
}
