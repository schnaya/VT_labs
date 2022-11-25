package task3;
import interfaces.GetData;
public class task3 {
    public static void execute() {
        double h=GetData.GetInteger("h");
        double a=GetData.GetInteger("a");
        double b=GetData.GetInteger("b");        
        for(double x=a;x<b;x=x+h) {
        	 System.out.print(x);System.out.print("   ");System.out.println(Math.tan(x));	
        }
    }
    public static void main(String[] args) {
        task3.execute();}
}