
public class Exercise2 {
	
	private int balance;
	
	public Exercise2(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount){
		this.balance += amount;
	}
	
	public boolean withdraw(int amount){
		if(balance >= amount){
			balance -= amount;
			return true;
		}
		return false;
	}
	
	public int getBaance(){
		return balance;
	}
	
}
