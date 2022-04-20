package reserve;

public interface Reserve {
	public abstract String ReserveCar (ReserveVo vo); //예약
	public abstract void  ModReserveCarInfo(ReserveVo vo); //예약수정
	public abstract void CancelReserveCarInfo(ReserveVo vo); //예약취소
}
