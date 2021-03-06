package reserve;

import base.Base;
import common.DataUtil;

public class ReserveImpl extends Base implements Reserve{
	String resData;
	
	
	//차를 예약
	public String ReserveCar(ReserveVo vo)throws ReserveException {
		resData=vo.resCarNumber +","+
				 vo.resDate+","+
				 vo.useBeginDate+","+
				 vo.retrunDate+",";
		
		DataUtil.encodeData(resData);
		System.out.println("렌트카 예약시간 : "+showTime());
		System.out.println("렌트카를 예약합니다.");
		return resData;
				
	}
	
	//차예약정보를 수정하는메소드
	public void ModReserveCarInfo(ReserveVo vo)throws ReserveException {
		resData="차량번호 : "+vo.resCarNumber+","+
				"차량예약날 : "+vo.resDate+","+
				"예약시작날짜 : "+vo.useBeginDate +","+
				"반남할날짜 : "+vo.retrunDate+",";
		
		DataUtil.decodeData(resData);
		System.out.println("렌트카 예약 정보 수정한 시간 : "+showTime());
		System.out.println("예약을 수정합니다.");
	}
	
	//차예약 취소
	public void CancelReserveCarInfo(ReserveVo vo)throws ReserveException {
		resData=vo.resCarNumber +","+
				 vo.resDate+","+
				 vo.useBeginDate+","+
				 vo.retrunDate+",";
		
		DataUtil.decodeData(resData);
		
		System.out.println("렌트카 예약 취소한 시간 : "+showTime());
		System.out.println("예약취소합니다.");
	}

	
	
	
}
