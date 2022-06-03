package surprise;

import java.util.Random;

public final class GatherSurprises {

	private static final Random random = new Random();
	
	private GatherSurprises() {	
	}
	
	public static ISurprise[] gather(int n) {
		ISurprise[] newSurprises = new ISurprise[n];
		for (int i = 0; i < n; i++) {
			newSurprises[i] = gather();
		}
		return newSurprises;
	}

	public static ISurprise gather() {
		int n = random.nextInt(3);
		switch (n) {
			case 1:
				return FortuneCookie.generate();
			case 2: 
				return Candies.generate();
			default: 
				return MinionToy.generate();
		}
	}

}
