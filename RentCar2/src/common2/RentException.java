package common2;

import java.util.Calendar;

//���� �߻���Ű�� ���� ���ܰ� �߻����� �� 
public class RentException extends Exception{
		public String mesg; //���ܹ߻��� ����� �޼���
		
		public RentException(String mesg) {
			this.mesg=mesg;
		}

		@Override
		public String toString() {
			return "���� �޽��� >> " +mesg;
		}
		
		public String getRentExceptioninfo() {
			String errmesg = "���ܹ߻� >> "+ showErrTime()+", ���ܳ��� : "+ mesg;
			return errmesg;
		}
		
		//�߻��Ǵ� �ð��� ǥ��
		public static String showErrTime() {
			String date = null;
			String time = null;
			
			Calendar cal = Calendar.getInstance();
			int hour = cal.get(Calendar.HOUR);
			int min = cal.get(Calendar.MINUTE);
			int sec = cal.get(Calendar.SECOND);
			
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH)+1;
			int day = cal.get(Calendar.DATE);
			
			date = year+"-"+month+"-"+day;
			time = hour+":"+min+":"+sec;
			
			return "��¥ : "+date +" , �ð� : "+time;
			
			
		}
		
	
	
}
