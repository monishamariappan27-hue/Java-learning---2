package day4;

import java.util.Scanner;

public class dele {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=5;
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
		int pos = 3;
		for (int i = 3; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
		n--;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
	}

}
