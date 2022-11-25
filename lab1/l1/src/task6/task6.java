package task6;
import interfaces.GetData;
public class task6 {

	
    public static void execute() {
    	int[] arr=GetData.GetIntArray("x");
    	int n=arr.length;
    	int[][]matr=new int[n][n];
        for(int i=0;i<n;i++) {
        	
        		for(int k=n-1;k>=0;k--) {
        			matr[i][k]=arr[Math.abs((i+k)%(n))];
        		}         	   	
            
       }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + matr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        task6.execute();}
}