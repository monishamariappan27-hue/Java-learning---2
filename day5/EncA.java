package day5;
class Details{
	private int id=101;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
public class EncA { 
	public static void main(String[] args) {
		Details obj = new Details();
		System.out.println("ID = "+obj.getId());
		obj.setId(102);
		System.out.println("ID = "+obj.getId());
		
	}

}
