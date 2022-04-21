package reserve;

public interface Reserve {
	public abstract String ReserveCar (ReserveVo vo) throws ReserveException; //예약
	public abstract void  ModReserveCarInfo(ReserveVo vo) throws ReserveException; //예약수정
	public abstract void CancelReserveCarInfo(ReserveVo vo)throws ReserveException; //예약취소
}
