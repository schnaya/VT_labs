package task8;
import java.util.ArrayList;

import interfaces.GetData;
import task8.Sequence;
public class task8 {

	
    public static void execute() {
    	double[] arra=GetData.GetDoubleArray("a");
    	double[] arrb=GetData.GetDoubleArray("b");


		try {
			ArrayList<Double> finalSequence = Sequence.merge(arra, arrb); 
			System.out.println("Final sequebce: " +  (finalSequence.toString().substring(1, finalSequence.toString().length() - 1))  );
			
		}catch( IllegalArgumentException e) {
			System.out.println( e.getMessage() );
		}

    }
    public static void main(String[] args) {
        task8.execute();}
}