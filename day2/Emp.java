package day3;

public class Emp {
	String name;
	int empid;
	double salary;
	long phone;
	double day_salary;
	int leave_count;
	int joiningYear;
	void monthsalary(double day_salary,int leave_count) {
		double Total_sal = (30*day_salary) - (leave_count*day_salary);
		System.out.println("Total salary: " + Total_sal);
	}
	void checkLeave() {
	    if (leave_count > 3) {
	        System.out.println(name + " took more leaves");
	    } else {
	        System.out.println(name + " took less leaves");
	    }
	}
	void displayContact() {
	    System.out.println("Employee: " + name);
	    System.out.println("Phone:    " + phone);
	}
	void calculateExperience(int joiningYear) {
	    int experience = 2026 - joiningYear;
	    System.out.println("Experience: " + experience + " years");
	}
	{
		System.out.println("----------------------");
	}
	public static void main(String[] args) {
		Emp per1=new Emp();
		per1.name="moni";
		per1.empid=101;
		per1.salary=250.45;
		per1.phone=10123678904l;
		per1.day_salary=100.00;
		per1.leave_count=5;
		per1.joiningYear=2011;
		per1.displayContact();
		per1.monthsalary(per1.day_salary,per1.leave_count);
		per1.checkLeave();
		per1.calculateExperience(per1.joiningYear);
		Emp per2=new Emp();
		per2.name="shera";
		per2.empid=102;
		per2.salary=250.25;
		per2.phone=10123668904l;
		per2.day_salary=150.00;
		per2.leave_count=3;
		per2.joiningYear=2009;
		per2.displayContact();
		per2.monthsalary(per2.day_salary,per2 .leave_count);
		per2.checkLeave();
		per2.calculateExperience(per2.joiningYear);
		Emp per3=new Emp();
		per3.name="shuruthi";
		per3.empid=103;
		per3.salary=3000.25;
		per3.phone=10133668904l;
		per3.day_salary=200.00;
		per3.leave_count=4;
		per3.joiningYear=2007;
		per3.displayContact();
		per3.monthsalary(per3.day_salary,per3 .leave_count);
		per3.checkLeave();
		per3.calculateExperience(per3.joiningYear);

	}

}
