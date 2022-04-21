package exer3;

import java.io.IOException;

public class ArrayUtill {
	public void call() throws IOException  {
		System.out.println("call 매서드 시작");
		int[] num = new int[2];
		num[0]=1;
		num[1]=2;
		if(num.length==2) {
			throw new IOException("배열크기가 2");
		}
		System.out.println("call 예외발생");
	}
	
}
