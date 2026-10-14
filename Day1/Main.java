package day2;

public class Main {
	public static String small(int a,int b){
        if(a<b){
            return "a is shortest";
        }
        else{
            return "b is shortest";
        }
    }
	public static void main(String[] args) {
		System.out.println(small(5,8));
	}

}
