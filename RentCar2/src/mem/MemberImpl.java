package mem;

import base.Base; 
import common.DataUtil; 

public class MemberImpl extends Base implements Member{
	String memData; //전달받은 데이터를 받는 변수
	
	
	//회원 등록 메소드 // MemeberVo에서 등록하려는 회원의 정보를 MemeberVo타입으로 받기
	public void regMember(MemeberVo vo) {
		memData =vo.id+","+
				 vo.name+","+
				 vo.password+","+
				 vo.phoneNum+","+
				 vo.address;
		DataUtil.encodeData(memData);
		System.out.println("회원등록 시간 : "+showTime());
		System.out.println("회원가입합니다.");
	}
	
	// 기존 회원 조회
	public String viewMember (MemeberVo vo) {
		memData= "회원 아이디 : "+vo.id+","+
				"회원비번:"+vo.password+
				"회원이름:"+vo.name+
				"회원 전화번호 : "+ vo.phoneNum;
		
		DataUtil.decodeData(memData); //복호화를 해서 읽을 수 있는 상태를 만들어야한다.
		System.out.println("회원 조회 시간 : "+showTime());
		return memData;
	}
	//회원정보수정
	public void modMember(MemeberVo vo) {
		memData= vo.id+","+
				 vo.name+","+
				 vo.password+","+
				 vo.phoneNum+","+
				 vo.address;
		
		DataUtil.encodeData(memData);

		System.out.println("수정한 시간 : "+showTime());
		System.out.println("회원정보를 수정합니다.");

	}
	//회원정보 삭제하는 메서드
	public void delMember(MemeberVo vo) {
		memData = vo.id+","+
				 vo.name+","+
				 vo.password+","+
				 vo.phoneNum+","+
				 vo.address;
		
		DataUtil.decodeData(memData); //복호화를 해서 읽읅 수 있는 상태를 만들어야한다.

		System.out.println("삭제한 시간 : "+showTime());
		System.out.println("회원정보가 삭제합니다.");

	}
	
	
	
	
	

}
