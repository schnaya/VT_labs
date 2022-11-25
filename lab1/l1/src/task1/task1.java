package task1;
import interfaces.GetData;
public class task1 {
    public static void execute() {
        int x=GetData.GetInteger("x");
        int y=GetData.GetInteger("y");
        double res=(1+Math.pow(Math.sin(x+y),2))/(2+Math.abs(x-2*x/(1+Math.pow(x,2)*Math.pow(y,2))))+x;
        System.out.println(res);
    }
    public static void main(String[] args) {
        task1.execute();}
}

