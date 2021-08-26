package overRiding;

public class BankInfo extends AxisBank {
public void saving() {
	System.out.println("My Account type is Savings ...");
}
public void fixed() {
	System.out.println("Minimum period for fixed deposit is 5 yrs...");
}
public void deposit() {
	int dpst=20000;
	System.out.println("Deposit Method from BankInfo Class");
	System.out.println("Amount credited : "+dpst);
	System.out.println("Method Overriding Successful..");
}
public static void main(String[] args) {
	AxisBank axb=new AxisBank();
	BankInfo bki=new BankInfo();
	axb.deposit();
	bki.deposit();
	bki.saving();
	bki.fixed();
}
}
