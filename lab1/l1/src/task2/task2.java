package task2;
import interfaces.GetData;
public class task2 {
    public static void execute() {
        int x=GetData.GetInteger("x");
        int y=GetData.GetInteger("y");
        boolean res=false;
        if((y<5)&&(y>0)){if (Math.abs(x)<4){res=true;}}
        if((y<0)&&(y>-3)){if (Math.abs(x)<6){res=true;}}
        System.out.println(res);
    }
    public static void main(String[] args) {
        task2.execute();
        }
}