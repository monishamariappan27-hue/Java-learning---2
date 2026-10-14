package day3;

public class Laptop {
	String bn;
	int sn;
	double price;
	String colour;
	Laptop(String bn,int sn,double pri){
		this.bn=bn;
		this.sn=sn;
		price=pri;
	}
	Laptop(String bn,int sn,double pri,String col){
		this.bn=bn;
		this.sn=sn;
		price=pri;
		colour=col;
	}
	public static void main(String[] args) {
		Laptop obj=new Laptop("victus",100,12000.0,"blue");
		Laptop obj1 = new Laptop("Macbook",200,90000);
		System.out.println(obj.bn);
		System.out.println(obj.sn);
		System.out.println(obj.price);
		System.out.println(obj.colour);
		System.out.println(obj1.bn);
		System.out.println(obj1.colour);
	}

}
