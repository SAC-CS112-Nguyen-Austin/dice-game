import java.util.*;
import java.util.Random;

public class die {
	
	public int rollDie(int numOfDice) {
		
		// max and min number of points
		int min = numOfDice;
		int max = 6 * numOfDice;
		
		//
		Random random = new Random();
		int dieValue = random.nextInt(max + 1 - min) + min;
		
		return dieValue;
	}
	
	

}
