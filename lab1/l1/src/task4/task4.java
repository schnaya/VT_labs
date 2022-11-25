package task4;
import interfaces.GetData;
public class task4 {
	
	    public static boolean checkNum(int number){
	    	boolean check=true;
	        for(int i =2; i<number; i++){
	            if(number%i==0){
	                check = false;
	                break;
	            }
	        } return check;
	    }
	
    public static void execute() {
    	int[] arr=GetData.GetIntArray("x");
        for(int i=0;i<arr.length;i++) {
        	if(checkNum(arr[i])) {       	 System.out.printf("Prime element %d %n",i);}   	
       }
    }
    public static void main(String[] args) {
        task4.execute();}
}