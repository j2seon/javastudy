package Ex1;

public class MemberImpl implements Member{

	@Override
	public void searchMemeber() {
		System.out.println("ȸ�������� ��ȸ�մϴ�.");		
	}

	@Override
	public void regMemeber() {
		System.out.println("ȸ�������� ����մϴ�.");		
		
	}

	@Override
	public void modMemeber() {
		System.out.println("ȸ�������� �����մϴ�.");		
		
	}

	@Override
	public void delMemeber() {
		System.out.println("ȸ�������� �����մϴ�.");		
		
	}

	@Override
	public void gradeMember() {
		System.out.println("����� ������ �޼ҵ�.");		
		
	}
	//ȸ�������� ��ȣȭ�ϴ� �޼ҵ�
	public void encodeData() {
		System.out.println("ȸ�������� ��ȣȭ�մϴ�.");
	}


	

}