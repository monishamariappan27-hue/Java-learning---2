package day6;

import java.util.Scanner;

public class Delarrr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=5;
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		arr[3]=0;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
	}
	}

}
