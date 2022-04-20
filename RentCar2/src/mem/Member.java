package mem;


public interface Member {//회원관리 관련된 메소드들로 작성
	public abstract void regMember(MemeberVo vo); //회원등록메소드 
	public abstract String viewMember (MemeberVo vo); //회원조회 메소드
	public abstract void modMember(MemeberVo vo); //회원정보 수정메소드
	public abstract void delMember(MemeberVo vo);//회원정보 삭제메소드
	
}
