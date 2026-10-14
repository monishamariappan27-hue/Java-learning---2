package day4;

import java.util.Scanner;

public class Evenidx {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}

}
