package day4;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count1 = 0;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    count1++;
                }
            }
            if (count1 == 2) {
                count++;
            }
        }
        System.out.println(count);
	}

}
