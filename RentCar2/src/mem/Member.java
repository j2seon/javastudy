package mem;


public interface Member {//ȸ������ ���õ� �޼ҵ��� �ۼ�
	public abstract void regMember(MemeberVo vo) throws MemberException; //ȸ����ϸ޼ҵ� 
	public abstract String viewMember (MemeberVo vo) throws MemberException; //ȸ����ȸ �޼ҵ�
	public abstract void modMember(MemeberVo vo) throws MemberException; //ȸ������ �����޼ҵ�
	public abstract void delMember(MemeberVo vo) throws MemberException;//ȸ������ �����޼ҵ�
	
}
