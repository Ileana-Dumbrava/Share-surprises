package surprise;

import java.util.Random;
import java.util.Scanner;

public class Candies implements ISurprise {
	private final int noOfCandies;
	private final String candyType;
	private static final String[] allTypesOfCandy = {"chocolate", "jelly", "fruits", "vanilla"};
	private static final Random random = new Random();
	
	private Candies(int noOfCandies, String candyType) {
		this.noOfCandies = noOfCandies;
		this.candyType = candyType;		
	}
	
	@Override
	public void enjoy() {
		System.out.println("There are " + this.noOfCandies + " " + this.candyType);
	}
	
	public static Candies generate() {
		int noOfCandies = random.nextInt(allTypesOfCandy.length + 2); 
		int indexOfType = random.nextInt(allTypesOfCandy.length);
		return new Candies(noOfCandies, allTypesOfCandy[indexOfType]);
	}
	
	@Override
	public String toString() {
		return this.noOfCandies + " " + this.candyType;
	}
}
