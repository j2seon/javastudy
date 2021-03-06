package oopstudy;

public class BankAccount {
	private int balance; //금액
	private Person owner; // 소유주
	
	public BankAccount(int balance){
		if(balance<0) {
			this.balance=0;
		}else {
			this.balance=balance;
		}
	}
	
	public BankAccount(Person owner) {
		this.owner=owner;
		this.balance=0;
	}
	
	public BankAccount(int balance, Person owner) {
		if(balance<0) {
			balance=0;
		}else {
		this.balance=balance;
		}
		this.owner=owner;
	}
	
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}

	
	//은행계좌에서 필요한건? 입금 출금 이체!
	
	//입금: 입금될 액수 성공여부를 리턴
	boolean deposit(int amount) {
		if(amount<0 || owner.getCashAmount()<amount) {
			System.out.println("입금실패입니다. 잔고: "+balance+"원, 현금: "+owner.getCashAmount()+"원");
			System.out.println(false);
			return false;
		}else {
			balance+=amount;
			owner.setCashAmount(owner.getCashAmount()- amount);
			System.out.println(amount+"원 입금하였습니다. 잔고: "+balance+"원, 현금: "+owner.getCashAmount()+"원");
			System.out.println(true);
			return true;
		}
	}
	//출금 : 출금될 액수 성공여부를 리턴
	boolean withdraw(int amount) {
		if(amount<0 || balance<amount) {
			System.out.println("출금 실패입니다. 잔고: "+balance+"원, 현금: "+owner.getCashAmount()+"원");
			System.out.println(false);
			return false;
		}else {
			balance-=amount;
			owner.setCashAmount(owner.getCashAmount()+amount);
			System.out.println(amount+"원 출금하였습니다. 잔고: "+balance+"원, 현금: "+owner.getCashAmount()+"원");
			System.out.println(true);
			return true;
		}
		
	}
	 //받는 사람 /이체할 금액
	boolean transfer(Person to, int amount) {
		return transfer(to.getAccount(), amount);
	
		
	}
		//받는 사람 계정 이체할 금액
	boolean transfer(BankAccount to, int amount) {
		if(amount<0 ||amount>this.getBalance()) {
			return false;
		}else 
			setBalance(getBalance()-amount);
//			balance-=amount;
			to.setBalance(to.getBalance()+amount);
			System.out.println("true - from: "+getOwner().getName()+", to: "+to.getOwner().getName()+", amount: "+amount+", balance: "+balance);
		return true;
	}
}
