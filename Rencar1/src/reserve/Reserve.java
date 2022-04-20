package reserve;

import base.Base;

public class Reserve extends Base{
	private String resCarNumber;
	private String resDate;
	private String useBeginDate;
	private String retrunDate;
	
	//차를 예약
	public String reserveCar() {
		System.out.println("렌트카 예약시간 : "+showTime());
		System.out.println("렌트카를 예약합니다.");
		return "예약된 차량 정보출력될거얌";
				
	}
	
	//차예약정보를 수정하는메소드
	public void modReserveCarInfo() {
		System.out.println("렌트카 예약 정보 수정한 시간 : "+showTime());
		System.out.println("예약을 수정합니다.");
	}
	
	//차예약 취소
	public void cancelReserveCarInfo() {
		System.out.println("렌트카 예약 취소한 시간 : "+showTime());
		System.out.println("예약취소합니다.");
	}
	
	
}
