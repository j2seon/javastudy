package common2;

import java.util.Calendar;

//내가 발생시키고 싶은 예외가 발생했을 때 
public class RentException extends Exception{
		public String mesg; //예외발생시 적용될 메세지
		
		public RentException(String mesg) {
			this.mesg=mesg;
		}

		@Override
		public String toString() {
			return "예외 메시지 >> " +mesg;
		}
		
		public String getRentExceptioninfo() {
			String errmesg = "예외발생 >> "+ showErrTime()+", 예외내용 : "+ mesg;
			return errmesg;
		}
		
		//발생되는 시간을 표시
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
			
			return "날짜 : "+date +" , 시간 : "+time;
			
			
		}
		
	
	
}
