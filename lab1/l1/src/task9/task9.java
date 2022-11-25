package task9;
import interfaces.GetData;
public class task9 {

	
    public static void execute() {
    	Basket basket = new Basket();
		fill(basket);
		
		try {
		System.out.println("Total ball's weight in basket is: " + BallsList.getBallsWeight(basket));
		System.out.println("Count of blue balls is: "+ BallsList.getCountOfColoredBalls(basket, "blue"));
		}catch(IllegalArgumentException e) {
			System.out.println( e.getMessage() );
		}
		
	}
	
	public static  void fill(Basket basket) {
        int ballsCount;
        double ballWeight;
        String ballColor;

        ballsCount = GetData.GetInteger(" balls amount ");
        
        for (int i = 0; i < ballsCount; i++) {
            System.out.println("Ball " + (i + 1) + " of " + ballsCount);
            
            ballWeight = GetData.GetDouble(" balls weight ");
            
            System.out.print("Enter ball's color: ");
            ballColor =GetData.GetString(" balls weight ");
            
            basket.addBall(new Ball(ballColor, ballWeight));
        }
    }
    public static void main(String[] args) {
        task9.execute();}
}