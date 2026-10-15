package day6;
import java.util.Arrays;
import java.util.Scanner;
public class ArrIns {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int arr1[]=new int[arr.length+1];
		int j=0;
		for(int i=0;i<arr1.length;i++) {
			if(i==3) {
				arr1[i]=15;
			}
			else {
				arr1[i]=arr[j++];
			}
	
		}	
		System.out.print(Arrays.toString(arr1));
	}

}
