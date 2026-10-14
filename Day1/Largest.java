package day2;

public class Largest {
	public static String large(int a,int b){
        if(a>b){
            return "a is largest";
        }
        else{
            return "b is largest";
        }
    }
    public static void main(String[] args) {   
        System.out.println(large(5,8));
        
    }

}
