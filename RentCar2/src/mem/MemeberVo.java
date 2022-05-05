package mem;

public class MemeberVo {
	static String id;
	public  String getId() {
		return id;
	}
	public  void setId(String id) {
		MemeberVo.id = id;
	}


	public  String getPassword() {
		return password;
	}


	public  void setPassword(String password) {
		MemeberVo.password = password;
	}


	public  String getName() {
		return name;
	}


	public  void setName(String name) {
		MemeberVo.name = name;
	}


	public  String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		MemeberVo.address = address;
	}


	public  String getPhoneNum() {
		return phoneNum;
	}


	public  void setPhoneNum(String phoneNum) {
		MemeberVo.phoneNum = phoneNum;
	}


	static String password;
	static String name;
	static String address;
	static String phoneNum;

	
	//»ý¼ºÀÚ
	public MemeberVo(String id, String password, String name, String address, String phoneNum) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
	}


	public MemeberVo() {
		this(id, password, name, address, phoneNum);
	}
	
	
	
}
