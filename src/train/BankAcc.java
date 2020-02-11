package train;

public class BankAcc {
	/*
	 * 1.Create a class BankAccountInstance variables: type, name, accountNumber,
	 * balance 
	 * Methods: void method deposit. Method accepts integer amount. Print
	 * “%amount is deposited to %accountNumber” and increment balance by given
	 * amount. Void method withdraw. Method accepts integer amount. Check if balance
	 * has at least equal amount of requested amount. If sufficient money in the
	 * balance then print “%amount is withdrawn from %accountNumber” and decrement
	 * balance by requested amount. If not sufficient money in the balance then
	 * print “Not sufficient balance in %accountNumber”.
	 * 
	 * Boolean return method transfer. Method accepts two parameters. 1. Integer
	 * amount 2. BankAccount type(target account where you are sending money to).
	 * Check if current account has sufficient money to send and 5% transfer fee. If
	 * account has enough money then print “%transferAmount is transferred from
	 * %accountNumber to %targetAccountNumber” and increment target account’s
	 * balance by integer and decrement balance from current account by transfer
	 * amount + 5% transfer fee.
	 */
	
	String type;
	String name;
	int accNum;
	int balance;
	
	void deposit(int amount) {
		System.out.println("Ammount is deposit to" + accNum);
		balance+=amount;
	}
	
	void withdrow(int amount) {
		if(this.balance>=amount) {
			System.out.println("Amount is withdrawn from " +this.accNum);
			 this.balance-=amount;
		}else{
			System.out.println("Not sufficient balance in "+ this.accNum);
		}
	}
		
	/* Boolean return method transfer. Method accepts two parameters. 1. Integer
	 * amount 2. BankAccount type(target account where you are sending money to).
	 * Check if current account has sufficient money to send and 5% transfer fee. If
	 * account has enough money then print “%transferAmount is transferred from
	 * %accountNumber to %targetAccountNumber” and increment target account’s
	 * balance by integer and decrement balance from current account by transfer
	 * amount + 5% transfer fee.
	 */
	
		public boolean transfer(int transferAmount, BankAcc targetAccNum ) {
			int fee = (transferAmount*5)/100;  //5% from transfer amount
			if(this.balance>=transferAmount+fee) {
				System.out.println(transferAmount + "is transferred from " + 
						this.accNum + " to " + targetAccNum);
						this.balance = balance-transferAmount;
						targetAccNum.balance +=transferAmount; 
						return true;
			}else {
				System.out.println("Not sufficient money in " + this.accNum);
			return false;
		}
	}
}
