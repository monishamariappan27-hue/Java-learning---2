package day4;
import java.util.Scanner;
public class mergearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        int arr2[] = new int[2 * n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = arr[i];
            arr2[i + n] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        sc.close();
    }
}