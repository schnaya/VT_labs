package interfaces;

import java.util.Scanner;

public class GetData {
	
	public static int GetInteger(String name) {
	Scanner in = new Scanner(System.in);
    System.out.printf("Input %s: %n",name);
    int res=in.nextInt();
    in.close();
    return res;
}
	public static double GetDouble(String name) {
	Scanner in = new Scanner(System.in);
    System.out.printf("Input %s: %n",name);
    while (! in.hasNextDouble()) {
		in.next();
	}
    double res=in.nextDouble();
    in.close();
    return res;
}
	public static int[] GetIntArray(String name) {
		int[] arr;
        Scanner in = new Scanner(System.in);
        System.out.printf("Input length of array %s: %n",name);
        int n = in.nextInt();
        arr= new int[n];
        for(int i=0;i<n;i++) {
        	 System.out.printf("Input element %s[%d]: %n",name,i);
             arr[i]=in.nextInt();	
        }
        in.close();
		return arr;
		
	}
	public static double[] GetDoubleArray(String name) {
		double[] arr;
        Scanner in = new Scanner(System.in);
        System.out.printf("Input length of array %s: %n",name);
        int n = in.nextInt();
        arr= new double[n];
        for(int i=0;i<n;i++) {
        	 System.out.printf("Input element %s[%d]: %n",name,i);
             arr[i]=in.nextDouble();	
        }
        in.close();
		return arr;
		
	}
	public static String GetString(String name) {
		Scanner in = new Scanner(System.in);
	    System.out.printf("Input %s: %n",name);
	    String res=in.nextLine();
	    in.close();
	    return res;	
	}

}
