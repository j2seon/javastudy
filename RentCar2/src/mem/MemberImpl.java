package mem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import base.Base;
import common.DataUtil; 

public class MemberImpl extends Base implements Member{
	String memData; //���޹��� �����͸� �޴� ����
	
	
	//ȸ�� ��� �޼ҵ� // MemeberVo���� ����Ϸ��� ȸ���� ������ MemeberVoŸ������ �ޱ�
	public void regMember(MemeberVo vo) throws MemberException, IOException {
		String id=vo.id;
		
		File file = new File("J:/temp/aaa/memberData.txt");
		
		PrintWriter out = new PrintWriter(new FileWriter(file,true));
		
		
		if(id==null || id.equals("")) {
			throw new MemberException("���̵�� �ʼ� �Է������Դϴ�.");
		}else {
		memData =vo.id+","+
				 vo.name+","+
				 vo.password+","+
				 vo.phoneNum+","+
				 vo.address;
//		DataUtil.encodeData(memData);
		System.out.println("ȸ����� �ð� : "+showTime());
		out.println(memData);
		out.close();
		System.out.println("ȸ�������մϴ�.");
		}
	}
	
	// ���� ȸ�� ��ȸ
	public String viewMember (MemeberVo vo) throws MemberException, IOException {
		File file = new File("J:/temp/aaa/memberData.txt");
	
			BufferedReader in= new BufferedReader(new FileReader(file));
			String memData = "";
			String data = in.readLine();
			while(data!=null) {
				memData+=data+"\n";
				data=in.readLine();
			}
		
//		DataUtil.decodeData(memData); //��ȣȭ�� �ؼ� ���� �� �ִ� ���¸� �������Ѵ�.
		System.out.println("ȸ�� ��ȸ �ð� : "+showTime());
		return memData;
	}
		
	//ȸ����������
	public void modMember(MemeberVo vo) throws MemberException, IOException{
		File file = new File("J:/temp/aaa/memberData.txt");
		
			BufferedReader in= new BufferedReader(new FileReader(file));
			String memData = "";
			String data = in.readLine();
			while(data!=null) {
				StringTokenizer st= new StringTokenizer(data,",");
				 memData= st.nextToken();
//				if(memData.equals()) {
//					memData+=st;
//				}else {
//					in.readLine();
//				}
			}
		
//		DataUtil.encodeData(memData);

		System.out.println("������ �ð� : "+showTime());
		System.out.println("ȸ�������� �����մϴ�.");

	}
	//ȸ������ �����ϴ� �޼���
	public void delMember(MemeberVo vo) throws MemberException{
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
