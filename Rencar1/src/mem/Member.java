package mem;

import base.Base; 

public class Member extends Base{
	private String id;
	private String password;
	private String name;
	private String address;
	private String phoneNum;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	//회원 등록 메소드 //언제 했는지 나오는 시간 
	public void regMember() {
		System.out.println("등록한 시간 : "+showTime());
		System.out.println("회원가입이 완료되었습니다.");
	}
	// 기존 회원 조회
	public String viewMember () {
		System.out.println("조회한 시간 : "+showTime());
		return " 조회한 회원정보 넣을거야" ;
	}
	//회원정보수정
	public void modMember() {
		System.out.println("수정한 시간 : "+showTime());
		System.out.println("정보수정이 완료되었습니다.");

	}
	//회원정보 삭제하는 메서드
	public void delMember() {
		System.out.println("삭제한 시간 : "+showTime());
		System.out.println("회원정보가 삭제되었습니다.");

	}
	
	
	
	
	

}
