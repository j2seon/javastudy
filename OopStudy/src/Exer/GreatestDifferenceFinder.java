package Exer;

public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        //인풋받은 배열의 최대값과 최소값의 차이 값 ! -2랑 7이면 9를 리턴해야한다. 원소 개수가 2보다 작으면 0리턴
    	
    	//원소 개수가 2보다 작으면 0리턴
    	if(intArray.length<2) {
    		return 0;
    	}
    	//최대값 최소값을 받는 변수 만들기 
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