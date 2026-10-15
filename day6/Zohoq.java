package day6;
import java.util.Scanner;
public class Zohoq {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(a>='A' && a<='Z') {
			for(char i=a;i<='Z';i++) {
				System.out.print(i+" ");
			}
		}
		else {
		for(char i=a;i<='z';i++) {
			System.out.print(i+" ");
		}
	}

}
}
