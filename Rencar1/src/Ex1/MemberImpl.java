package Ex1;

public class MemberImpl implements Member{

	@Override
	public void searchMemeber() {
		System.out.println("회원정보를 조회합니다.");		
	}

	@Override
	public void regMemeber() {
		System.out.println("회원정보를 등록합니다.");		
		
	}

	@Override
	public void modMemeber() {
		System.out.println("회원정보를 수정합니다.");		
		
	}

	@Override
	public void delMemeber() {
		System.out.println("회원정보를 삭제합니다.");		
		
	}

	@Override
	public void gradeMember() {
		System.out.println("등급을 나누는 메소드.");		
		
	}
	//회원정보를 암호화하는 메소드
	public void encodeData() {
		System.out.println("회원정보를 암호화합니다.");
	}


	

}
