package mem;

import base.Base; 
import common.DataUtil; 

public class MemberImpl extends Base implements Member{
	String memData; //���޹��� �����͸� �޴� ����
	
	
	//ȸ�� ��� �޼ҵ� // MemeberVo���� ����Ϸ��� ȸ���� ������ MemeberVoŸ������ �ޱ�
	public void regMember(MemeberVo vo) {
		memData =vo.id+","+
				 vo.name+","+
				 vo.password+","+
				 vo.phoneNum+","+
				 vo.address;
		DataUtil.encodeData(memData);
		System.out.println("ȸ����� �ð� : "+showTime());
		System.out.println("ȸ�������մϴ�.");
	}
	
	// ���� ȸ�� ��ȸ
	public String viewMember (MemeberVo vo) {
		memData= "ȸ�� ���̵� : "+vo.id+","+
				"ȸ�����:"+vo.password+
				"ȸ���̸�:"+vo.name+
				"ȸ�� ��ȭ��ȣ : "+ vo.phoneNum;
		
		DataUtil.decodeData(memData); //��ȣȭ�� �ؼ� ���� �� �ִ� ���¸� �������Ѵ�.
		System.out.println("ȸ�� ��ȸ �ð� : "+showTime());
		return memData;
	}
	//ȸ����������
	public void modMember(MemeberVo vo) {
		memData= vo.id+","+
				 vo.name+","+
				 vo.password+","+
				 vo.phoneNum+","+
				 vo.address;
		
		DataUtil.encodeData(memData);

		System.out.println("������ �ð� : "+showTime());
		System.out.println("ȸ�������� �����մϴ�.");

	}
	//ȸ������ �����ϴ� �޼���
	public void delMember(MemeberVo vo) {
		memData = vo.id+","+
				 vo.name+","+
				 vo.password+","+
				 vo.phoneNum+","+
				 vo.address;
		
		DataUtil.decodeData(memData); //��ȣȭ�� �ؼ� �П� �� �ִ� ���¸� �������Ѵ�.

		System.out.println("������ �ð� : "+showTime());
		System.out.println("ȸ�������� �����մϴ�.");

	}
	
	
	
	
	

}