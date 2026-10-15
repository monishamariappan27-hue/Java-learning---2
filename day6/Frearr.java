package day6;

import java.util.Scanner;

public class Frearr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		boolean vis[]=new boolean[n];
		for(int i=0;i<arr.length;i++) {
			if(vis[i]) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					vis[j]=true;
				}
			}
			System.out.println(arr[i]+ " " +count);
		}

	}

}
