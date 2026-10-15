package day5;
import java.util.Scanner;
public class Nosymbol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		for(int i=0;i<n.length();i++) {
			char a=n.charAt(i);
			if((a>='a'&&a<='z')||(a>='A'&&a<='Z')||(a>='0'&&a<='9')) {
				System.out.print(a);
			}
		}
		


	}

}
