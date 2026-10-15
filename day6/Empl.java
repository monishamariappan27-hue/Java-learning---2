package day6;
abstract class Emp{
	public abstract void Salary();
	public void Dept(){
		System.out.println("Data Science");
	}
}
class A extends Emp{
	public void Salary() {
		System.out.println("Total Salary : 12000");
	}
}
public class Empl {
	public static void main(String[] args) {
		A obj = new A();
		obj.Dept();
		obj.Salary();
	}

}
