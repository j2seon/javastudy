package mem;


public interface Member {//ȸ������ ���õ� �޼ҵ��� �ۼ�
	public abstract void regMember(MemeberVo vo); //ȸ����ϸ޼ҵ� 
	public abstract String viewMember (MemeberVo vo); //ȸ����ȸ �޼ҵ�
	public abstract void modMember(MemeberVo vo); //ȸ������ �����޼ҵ�
	public abstract void delMember(MemeberVo vo);//ȸ������ �����޼ҵ�
	
}
