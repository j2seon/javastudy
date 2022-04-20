package car;

public interface Car {
	public abstract String checkCarInfo(CarVo vo); //차량정보조회
	public abstract void regCarInfo(CarVo vo);//차량등록
	public abstract void modCarInfo(CarVo vo);//차량정보수정
	public abstract void delCarInfo(CarVo vo);//차량정보 삭제
}
