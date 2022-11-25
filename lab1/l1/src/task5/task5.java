package task5;

import interfaces.GetData;

public class task5 {
	static class NumSubSequence {
        int beginIdex;
        int endIdex;
        int lengthSeq = 2;
 
        NumSubSequence(int beginIdex) {
            this.beginIdex = beginIdex;
        }
 
        NumSubSequence(int beginIdex, int lengthSeq) {
            this.beginIdex = beginIdex;
            this.lengthSeq = lengthSeq;
        }
 
        void riseLength() {
            lengthSeq++;
            endIdex = beginIdex + lengthSeq - 1;
        }
 
    }
 
	
    public static void execute() {
    	int[] arr=GetData.GetIntArray("x");
        NumSubSequence tmpSeq = null;
        NumSubSequence bigestSeq = new NumSubSequence(0, 0);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                if (tmpSeq == null)
                    tmpSeq = new NumSubSequence(i);
                else tmpSeq.riseLength();
                if (bigestSeq.lengthSeq < tmpSeq.lengthSeq) bigestSeq = tmpSeq;
            } else tmpSeq = null;
        }
        System.out.println(arr.length-bigestSeq.lengthSeq);
       }
    
    public static void main(String[] args) {
        task5.execute();}
}