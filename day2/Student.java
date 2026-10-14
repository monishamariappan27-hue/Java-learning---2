package day3;

public class Student {
	String name;
	int regno;
	int age;
	int mark1;
	int mark2;
	int mark3;
	double sem_fees;
	void totalmark(int mark1,int mark2,int mark3) {
		int totalmark=mark1+mark2+mark3;
		System.out.println("Total mark:   "+totalmark);
	}
	void yearofborn() {
		int birthyear = 2026 - age;
		System.out.println("Year of Born: "+birthyear);
	}
	void display() {
		System.out.println("Stu name:     "+ name);
		System.out.println("Stu regno:    "+ regno);
	}
	void totalfees() {
		double totfee=8*sem_fees;
		System.out.println("Total fees:   " +totfee);
	}
	{
		System.out.println("-----------------------");
	}
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.name="moni";
		stu1.regno=11;
		stu1.age=19;
		stu1.mark1=98;
		stu1.mark2=89;
		stu1.mark3=90;
		stu1.sem_fees=5000.00;
		stu1.display();	
		stu1.totalmark(stu1.mark1,stu1.mark2,stu1.mark3);
		stu1.yearofborn();
		stu1.totalfees();
		Student stu2 = new Student();
		stu2.name="neha";
		stu2.regno=12;
		stu2.age=20;
		stu2.mark1=92;
		stu2.mark2=98;
		stu2.mark3=78;
		stu2.sem_fees=6000.00;
		stu2.display();
		stu2.totalmark(stu2.mark1,stu2.mark2,stu2.mark3);
		stu2.yearofborn();
		stu2.totalfees();
		Student stu3 = new Student();
		stu3.name="shuruthi";
		stu3.regno=13;
		stu3.age=18;
		stu3.mark1=90;
		stu3.mark2=95;
		stu3.mark3=79;
		stu3.sem_fees=4000.00;
		stu3.display();
		stu3.totalmark(stu3.mark1,stu3.mark2,stu3.mark3);
		stu3.yearofborn();
		stu3.totalfees();
	}

}
