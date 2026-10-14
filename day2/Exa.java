package day3;

public class Exa {
	int a;
	String b;
	float c;
	Exa(){}
	Exa(int a){
		this.a=a;
	}
	Exa(int a,String b){
		this.a=a;
		this.b=b;
	}
	Exa(int a,String b,float c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public static void main(String [] args) {
		Exa obj=new Exa();
		Exa obj1=new Exa(10);
		Exa obj2=new Exa(10,"moni");
		Exa obj3=new Exa(10,"moni",7.5f);
		System.out.println(obj.a);
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		System.out.println(obj3.a);
	}
	

}
