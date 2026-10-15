package day5; 
class Father1{ 
	void work() { 
		 System.out.println("Working");
	} 
}        
class Son1 extends Father1{ 
	void play() { 
		System.out.println("playing"); 
	} 
}  
class Son2 extends Father1{ 
	void college() { 
		System.out.println("going college"); 
	} 
}  
public class Hierachical { 
	public static void main(String[] args) { 
		Son1 obj = new Son1(); 
		Son2 obj2 = new Son2(); 
		obj.work(); 
		obj2.work(); 
		obj.play(); 
	} 
} 
 