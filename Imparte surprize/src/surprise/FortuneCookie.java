package surprise;

import java.util.Arrays;
import java.util.Random;

public class FortuneCookie implements ISurprise {

	private final String message;
	private static final String[] quotes = {"Your road to glory will be rocky, but fulfilling.",
			"Nothing is impossible to a willing heart", "Don't worry about money, the best things in life are free",
			"Don't pursue hapiness, create it!", "Courage is not the absence of fear; it is the conquest of it", 
			"All things are difficult before they are easy.", "A ship in harbor is safe, but that’s not why ships are built.",
			"If you want the rainbow, you have to tolerate the rain.", "The usefulness of a cup is in its emptiness.", 
			"Success lies in the hands of those who wants it.", "One that would have the fruit must climb the tree.", 
			"Big journeys begin with a single step.", "Of all our human resources, the most precious is the desire to improve.",
			"People learn little from success, but much from failure.", "Be not afraid of growing slowly, be afraid only of standing still.",
			"A person who won’t read has no advantage over a person who can’t read.", "Happiness isn’t an outside job, it’s an inside job.", 
			"Never forget that a half truth is a whole lie.", "We must always have old memories and young hopes.",
			"To avoid criticism, do nothing, say nothing, be nothing"};
	
	private static final Random random = new Random();
	
	private FortuneCookie(String message) {
		this.message = message;	
	}
	
	@Override
	public void enjoy() {
		System.out.println("You have a fortune cookie! " + this.message);
	}
	
	@Override
	public String toString() {
		return "FortuneCookie";
	}
	
	public static FortuneCookie generate() {
		int n = random.nextInt(quotes.length);
		return new FortuneCookie(quotes[n]);		
	}
	
}
