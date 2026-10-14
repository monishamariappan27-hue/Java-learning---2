package day4;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int count1=0;
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count = count+1;
			}
			else {
				count1=count1+1;
			}
		}
		System.out.println("Even "+count);
		System.out.println("odd "+count1);
	

	}

}
