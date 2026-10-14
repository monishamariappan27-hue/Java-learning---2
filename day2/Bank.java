package day3;

public class Bank {
	String cust_name;
	double curr_bal;
	double prev_bal;
	long account_no;
	void display() {
		System.out.println("Customer name: "+cust_name);
		System.out.println("Account no: "+account_no);
		System.out.println("Previous bal: "+prev_bal);
	}
	void state() {
		if(curr_bal>prev_bal) {                  
			System.out.println("Cred/Debit: Amount Credited");
		}
		else {
			System.out.println("Cred/Debit: Amount Debited");
		}
	}
	void amtcre(){
		if(curr_bal>prev_bal) {
			double cred = curr_bal - prev_bal;
			System.out.println("The credited amt: "+ cred);
		}
		else {
			System.out.println("The credited amt: 0");
		}
	}
	void amtdep(){
		if(curr_bal<prev_bal) {
			double deb = prev_bal - curr_bal;
			System.out.println("The debited amt: "+ deb);
		}
		else {
			System.out.println("The debited amt: 0");
		}
		System.out.println("Available bal: "+curr_bal);
	}
	{
		System.out.println("----------------------------");
	}
	public static void main(String[] args) {
		Bank c1=new Bank();
		c1.cust_name="Moni";
		c1.curr_bal=5000.00;
		c1.prev_bal=2500.00;
		c1.account_no=12346765890l;
		c1.display();
		c1.state();
		c1.amtcre();
		c1.amtdep();
		Bank c2=new Bank();
		c2.cust_name="shruthi";
		c2.curr_bal=3000.00;
		c2.prev_bal=7000.00;
		c2.account_no=12456765890l;
		c2.display();
		c2.state();
		c2.amtcre();
		c2.amtdep();
		Bank c3=new Bank();
		c3.cust_name="Reens";
		c3.curr_bal=8000.00;
		c3.prev_bal=4000.00;
		c3.account_no=21456765890l;
		c3.display();
		c3.state();
		c3.amtcre();
		c3.amtdep();
		
		
	}

}
  