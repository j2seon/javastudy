package oopstudy;

public class BankAccount {
	private int balance; //�ݾ�
	private Person owner; // ������
	
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

	
	//������¿��� �ʿ��Ѱ�? �Ա� ��� ��ü!
	
	//�Ա�: �Աݵ� �׼� �������θ� ����
	boolean deposit(int amount) {
		if(amount<0 || owner.getCashAmount()<amount) {
			System.out.println("�Աݽ����Դϴ�. �ܰ�: "+balance+"��, ����: "+owner.getCashAmount()+"��");
			System.out.println(false);
			return false;
		}else {
			balance+=amount;
			owner.setCashAmount(owner.getCashAmount()- amount);
			System.out.println(amount+"�� �Ա��Ͽ����ϴ�. �ܰ�: "+balance+"��, ����: "+owner.getCashAmount()+"��");
			System.out.println(true);
			return true;
		}
	}
	//��� : ��ݵ� �׼� �������θ� ����
	boolean withdraw(int amount) {
		if(amount<0 || balance<amount) {
			System.out.println("��� �����Դϴ�. �ܰ�: "+balance+"��, ����: "+owner.getCashAmount()+"��");
			System.out.println(false);
			return false;
		}else {
			balance-=amount;
			owner.setCashAmount(owner.getCashAmount()+amount);
			System.out.println(amount+"�� ����Ͽ����ϴ�. �ܰ�: "+balance+"��, ����: "+owner.getCashAmount()+"��");
			System.out.println(true);
			return true;
		}
		
	}
	 //�޴� ��� /��ü�� �ݾ�
	boolean transfer(Person to, int amount) {
		return transfer(to.getAccount(), amount);
	
		
	}
		//�޴� ��� ���� ��ü�� �ݾ�
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