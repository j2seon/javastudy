package reserve;

public interface Reserve {
	public abstract String ReserveCar (ReserveVo vo); //����
	public abstract void  ModReserveCarInfo(ReserveVo vo); //�������
	public abstract void CancelReserveCarInfo(ReserveVo vo); //�������
}
