package oopstudy;

public class Person {
	private String name;
	private int age;
	private int cashAmount; //���ݺ���
	private BankAccount account; //����� ����
	
	public Person(String name,int age) {
		this.name=name;
		if(age<0) {
			this.age=12;
		}else {
			this.age=age;
		}
		cashAmount=0;
	}
	
	public Person(String name, int age, int cashAmount) {
		this.name=name;
		if(age<0) {
			this.age=12;
		}else {
			this.age=age;
		}
		if(cashAmount<0) {
			this.cashAmount=0;
		}else {
			this.cashAmount=cashAmount;
		}
	}
	
	
	
	public String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCashAmount() {
		return cashAmount;
	}
	public void setCashAmount(int cashAmount) {
		this.cashAmount = cashAmount;
	}
	public BankAccount getAccount() {
		return account;
	}
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	//�޴»�� / ��ü�� �ݾ�
	boolean transfer(Person to, int amount) {
		return transfer(to.getAccount(),amount);
	}
	//�޴� ����� ����/��ü�� �ݾ�
	boolean transfer(BankAccount to, int amount) {
		if(amount<0||amount>this.getAccount().getBalance()) {
			return false;
		}
		getAccount().setBalance(getAccount().getBalance()-amount);
		to.setBalance(to.getBalance()+amount);
		System.out.println("true - from: "+this.getName() +", to: "+to.getOwner().getName()+", amount: "+amount+", balance: "+this.account.getBalance());
		return true;
	}
		
}