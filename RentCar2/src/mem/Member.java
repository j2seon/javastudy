package mem;

import java.io.IOException;

public interface Member {//회원관리 관련된 메소드들로 작성
	public abstract void regMember(MemeberVo vo) throws MemberException, IOException; //회원등록메소드 
	public abstract String viewMember (MemeberVo vo) throws MemberException, IOException; //회원조회 메소드
	public abstract void modMember(MemeberVo vo) throws MemberException, IOException; //회원정보 수정메소드
	public abstract void delMember(MemeberVo vo) throws MemberException;//회원정보 삭제메소드
	
}
