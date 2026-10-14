package day4;
import java.util.Scanner;
public class TwoD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int sum1=0;
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i==j) {
					sum = sum + arr[i][j];
				}
				if(i+j==arr.length-1){
					sum1 = sum1 + arr[i][j];
				}
			}}
		System.out.println(sum);
		System.out.println(sum1);
		
		
	}

}
