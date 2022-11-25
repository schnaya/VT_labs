package task8;

import java.util.ArrayList;

public class Sequence {

	 public static ArrayList<Double> merge(double[] a, double[] b){
		 
		 	if((a == null) || (b == null)) {
		 		throw new IllegalArgumentException("Sequences can't be null");
		 	}
		 	
	        double maxLength = a.length + b.length;
	        ArrayList<Double> mergedSequence = new ArrayList<Double>();
	        int indexA = 0, indexB = 0;
	        int curIndex = 0; 

	        
	       while (curIndex < maxLength  ) {
	    	   
	    	   
	    	   if((indexA < a.length) && (indexB < b.length)) { 
	    		   
	    		   if (a[indexA] == b[indexB] ){
	    			   mergedSequence.add( a[indexA++]);
	    			   indexB++;
	    			   curIndex += 2;
		    	   }
	    		   
	    		   else if (a[indexA] < b[indexB] ){
	    			   mergedSequence.add( a[indexA++]);
	    			   curIndex++;
	    		   }
	    		   else if (b[indexB] < a[indexA]){
	    			   mergedSequence.add( b[indexB++]);
	    			   curIndex++;
	    		   }
	    		   
	    	   }
	    	   
	    	   
	    	   
	    	   if ((indexB >= b.length) && (indexA < a.length) ) {
	    		   mergedSequence.add( a[indexA++]);
   			   curIndex++;
	    	   }
	    	   else if ((indexA >= a.length) && (indexB < b.length)) {
	    		   mergedSequence.add( b[indexB++]);
   			   curIndex++;
	    	   
	    	   
	    	   }
	    	   
	       }
	       return mergedSequence;
	    }
}