package exer3;

import java.io.IOException;

public class ArrayUtill {
	public void call() throws IOException  {
		System.out.println("call �ż��� ����");
		int[] num = new int[2];
		num[0]=1;
		num[1]=2;
		if(num.length==2) {
			throw new IOException("�迭ũ�Ⱑ 2");
		}
		System.out.println("call ���ܹ߻�");
	}
	
}
