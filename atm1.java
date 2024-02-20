import java.util.Scanner;

class Bankaccount {
	private double Balance;
	//parametrized constructor
	public Bankaccount(double Balance) {
		this.Balance=Balance;
		}
//Deposite a money
	public void deposit(double amount) {
		Balance+=amount;
		System.out.println(amount+"amount Deposited succesfully");
		}
	//Withdraw a money
	public void withdraw(double amount) {
		if(Balance>amount) {
		Balance-=amount;
		System.out.println(amount+"amount withdraw succesfuly");
	}else {
		System.out.println("insuffiecient balance");
		}
		}
	//check balance
	public void checkBalance() {
		System.out.println("Available Balnace:"+Balance);
	}
}
	
	//Atm class
	public class Atm1{
		private Bankaccount account;
		public Atm1(Bankaccount account) {
		this.account=account;
		}
		//Atm interface 
		public void Displaychoice() {
			Scanner sc=new Scanner(System.in);
			int choice;
			do {
				System.out.println("\nAtm menu");
				System.out.println("1. Deposit ");
				System.out.println("2. withdraw");
				System.out.println("3. check balance");
				System.out.println("4. Exit");
				System.out.println("enter your choice");
				choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter amount for deposited");
				double depositeamount=sc.nextDouble();
				account.deposit(depositeamount);
				break;
			case 2:
				System.out.println("Enter amount to withdraw");
				double withdrawamount=sc.nextDouble();
				account.withdraw(withdrawamount);
				break;
			case 3:
				account.checkBalance();
				break;
			case 4:
				System.out.println("Thank you for useing Atm");
				break;
				default:
					System.out.println("enter valid choice");
			}}
			while(choice!=4);
				sc.close();
		}
		public static void main(String arg[]) {
		Bankaccount bc=new Bankaccount(1000);//Initial amount 1000
		Atm1 a=new Atm1(bc);
		a.Displaychoice();
		}
	}
	


