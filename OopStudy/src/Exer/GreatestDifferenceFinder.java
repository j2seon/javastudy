package Exer;

public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        //��ǲ���� �迭�� �ִ밪�� �ּҰ��� ���� �� ! -2�� 7�̸� 9�� �����ؾ��Ѵ�. ���� ������ 2���� ������ 0����
    	
    	//���� ������ 2���� ������ 0����
    	if(intArray.length<2) {
    		return 0;
    	}
    	//�ִ밪 �ּҰ��� �޴� ���� ����� 
    	int max=intArray[0]; int min =intArray[0];
	    for(int i=0; i<intArray.length; i++) {
	    	if(intArray[i]>max) {
	    			max=intArray[i];
	    	}
	    }
	    for(int i =0; i<intArray.length; i++) {
	    	if(intArray[i]<min) {
	    			min=intArray[i];
	    	}
    	}
    	
    	return max-min;
    }
}