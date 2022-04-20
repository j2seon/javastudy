package common;

public class DataUtil { // 화면에서 회원이 입력하는 정보를 암호화하고 복호화한다.
	// static으로 지정해서 메인이 실행중일때 같이 실행될 수 있도록 설정 >> static 이 붙으면 jvm이 자동으로 main메소드가 시작될때 같이 시작되도록 만든다. (즉, 계속 데이터를 받는 상태로 만듬)
	public static void encodeData(String data) { 
		System.out.println(data+"를 암호화합니다."); //전달받은 데이터를 암호화해서 정보지키기
	}
	public static void decodeData(String data) { //암호화된 데이터를 읽기 위해 복호화 하기
		System.out.println(data+"를 복호화합니다.");
	}
	

}
