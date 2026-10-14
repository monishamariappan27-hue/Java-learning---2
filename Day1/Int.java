package day2;
import java.util.Scanner;
public class Int {
	public static String posneg(int n) {
		if(n>=0) {
			return "pos";
		}
		else {
			return "neg";
		}
	}
	public static void posfor(int n) {
		if(n<0) {
			n=n*(-1);
		}
		System.out.println(n);
	}
	public static void largest(int n,int m) {
		if(n>m) {
			System.out.println( "n is largest");
		}
		else {
			System.out.println("n is smallest");
		}
		
	}
	public static void twodig(int n) {
		if(n>=10 && n<=99 || n<= -10 && n>=-99) {
			System.out.println("two digit number");
		}
		else {
			System.out.println("not a two digit number");
		}
	}
	public static String equal(int n,int m) {
		if(n==m) {
			return "num is equal";
		}
		else {
			return "num is not equal";
		}
	}
	public static String zero(int n) {
		if(n==0) {
			return "num is zero";
		}
		else {
			return "num is not zero";
		}
	}
	public static void evenodd() {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
	}
	public static void tevenodd(int n) {
		System.out.println(n%2==0?"even":"odd");
	}
	public static void vote() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter name and age");
		String name = sc.nextLine();
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("eligible to vote");
		}
		else {
			System.out.println("not eligible to vote");
		}
	}
	public static void date() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter date,month,year");
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		if (y < 1999 || y > 2027) {
            System.out.println("Invalid year");
        }
		else if(m>12) {
			System.out.println("invalid month");
		}
		else {
			if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
				if(d>=1 && d<=31) {
					System.out.println("date valid");
				}
				else {
					System.out.println("date invalid");
				}
			}
			else if(m==4 || m== 6 || m== 9 || m==11){
				if(d>=1 && d<=30) {
					System.out.println("date valid");
				}
				else {
					System.out.println("date invalid");
				}
			}
			else {
				if(y%400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
					if(d>=1 && d<=29) {
						System.out.println("date valid");
					}
					else { 
						System.out.println("date invalid");
					}
				}
				else
				{
					if(d>=1 && d<=28) {
						System.out.println("date valid");
					}
					else {
						System.out.println("date invalid");
					}
				}
			}
		}
	}  
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println(posneg(n));
		posfor(n);		
		largest(n,m);
		twodig(n);
		System.out.println(equal(n,m));
		System.out.println(zero(n));
		evenodd();
		tevenodd(n);
		vote();
		date();
	}

}
