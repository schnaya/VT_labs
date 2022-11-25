package task7;
import interfaces.GetData;
import interfaces.ArraySort;
public class task7 {

	
    public static void execute() {
    	int[] arr=GetData.GetIntArray("x");
    	ArraySort.sort(arr);
        for (int i = 0; i < arr.length; i++) {
          
                System.out.print(" " + arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        task7.execute();}
}