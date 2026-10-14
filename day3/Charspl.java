package day4;

import java.util.Scanner;

public class Charspl {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int countu=0;
		int countl=0;
		int countd=0;
		int counts=0;
		int n=sc.nextInt();
		char arr[]=new char[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next().charAt(0);
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>='A' && arr[i]<='Z') {
				countu=countu+1;
			}
			else if(arr[i]>='a' && arr[i]<='z') {
				countl=countl+1;
			}
			else if(arr[i]>='0' && arr[i]<='9') {
				countd=countd+1;
			}
			else {
				counts=counts+1;
			}
			
	}
		System.out.println("upper case "+countu);
		System.out.println("lowwer case "+countl);
		System.out.println("digit "+countd);
		System.out.println("spl "+counts);
	}
}


