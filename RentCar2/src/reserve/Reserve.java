package reserve;

public interface Reserve {
	public abstract String ReserveCar (ReserveVo vo) throws ReserveException; //����
	public abstract void  ModReserveCarInfo(ReserveVo vo) throws ReserveException; //�������
	public abstract void CancelReserveCarInfo(ReserveVo vo)throws ReserveException; //�������
}
