package car;

import base.Base;
import common.*;
import mem.MemeberVo;
public class CarImpl extends Base implements Car {
	String carData;
	
	//차량 정보조회 메서드
	public String checkCarInfo(CarVo vo) {
		carData="차 번호 : "+vo.carNumber+","+
				"차 이름 : "+ vo.carName+","+
				"차 크기 : "+vo.carSize+","+
				"차 색상 : "+vo.carColor+","+
				"제조사 : "+vo.carmaker;
	
		DataUtil.decodeData(carData);
		System.out.println("차량 정보를 조회한 시간 : "+ showTime());
		System.out.println("렌터카 정보를 출력합니다.");
		return carData;
	
	}
	//차량 등록
	public void regCarInfo(CarVo vo) {
		carData= vo.carNumber+","+
				vo.carName+","+
				vo.carSize+","+
				vo.carColor+","+
				vo.carmaker;
	
		DataUtil.encodeData(carData);

		System.out.println("등록한 시간 : "+showTime());
		System.out.println("새로운 렌트카를 등록합니다.");
	}
	
	// 차정보 수정
	public void modCarInfo(CarVo vo) {
		carData=vo.carNumber+","+
				vo.carName+","+
				vo.carSize+","+
				vo.carColor+","+
				vo.carmaker;
		
		DataUtil.decodeData(carData);

		System.out.println("수정한 시간 : "+showTime());
		System.out.println("렌트카 정보를 수정합니다.");
	}
	
	//차정보 삭제하는 메소드
	public void delCarInfo(CarVo vo) {
		carData=vo.carNumber+","+
				vo.carName+","+
				vo.carSize+","+
				vo.carColor+","+
				vo.carmaker;
		
		DataUtil.encodeData(carData);

		
		System.out.println("렌트카 정보 삭제 시간 : "+showTime());
		System.out.println("렌트카 정보를 삭제합니다.");
	}
	
	
	
	
	
}
