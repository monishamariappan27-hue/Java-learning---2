package day4;

import java.util.Scanner;

public class avgele {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			}
		int avg = sum / n;
		System.out.println("sum "+sum);
		System.out.println("avg "+avg);
		}
	
		
	}


