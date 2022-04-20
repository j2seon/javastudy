package car;

import base.Base;

public class Car extends Base {
	private String carNumber;
	private String carName;
	private String carColor;
	private int carSize;
	private String carmaker;
	
	//차량 정보조회 메서드
	public String checkCarInfo() {
		System.out.println("렌트카 정보 조회 시간 : "+showTime());
		System.out.println("렌트카 정보를 조회합니다.");
	
		return "조회한 차량정보출력될거얌";
	
	}
	//차량 등록
	public void regCarInfo() {
		System.out.println("등록한 시간 : "+showTime());
		System.out.println("새로운 렌트카를 등록합니다.");
	}
	
	// 차정보 수정
	public void modCarInfo() {
		System.out.println("수정한 시간 : "+showTime());
		System.out.println("렌트카 정보를 수정합니다.");
	}
	
	//차정보 삭제하는 메소드
	public void delCarInfo() {
		System.out.println("렌트카 정보 삭제 시간 : "+showTime());
		System.out.println("렌트카 정보를 삭제합니다.");
	}
	
	
	
	
	
}
