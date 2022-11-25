package task9;

import java.util.Objects;

public class Ball {
	
	private final String colour;
	private final double weight;
	
	public Ball (String colour, double weight) {
		
		
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight can't be negative");
        }
        if ((colour == null) || colour.isEmpty()) {
            throw new IllegalArgumentException("Ball should have a color");
        }
        
		this.colour = colour;
		this.weight = weight;
	}
	
	public String getColour() {
		return colour;
	}
	
	public double getWeight() {
		return weight;
	}
	
	@Override
	 public boolean equals(Object o) {
       
        if (this == o) {
            return true;
        }
        if ((o == null) || (getClass() != o.getClass())) {
            return false;
        }
        
        Ball ball;
        ball = (Ball) o;
        if (ball.colour == null || colour == null) {
        	return false;
        }
        return (ball.weight == weight) && Objects.equals(ball.colour, colour);
    }
	
	@Override
	public int hashCode() {
		 	final int prime = 31;
		    int result = 1;
		    result = prime * result + ((colour == null) ? 0 : colour.hashCode());             
		    result = prime * result + Double.hashCode(weight); 
		    return result;
		    
	}
}