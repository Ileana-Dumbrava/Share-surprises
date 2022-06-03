package surprise;

import java.util.Random;

public class MinionToy implements ISurprise {

	private final String nameOfToy;
	private static final String[] names = {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};
	private static int index = 0;
	
	private MinionToy(String nameOfToy) {
		this.nameOfToy = nameOfToy;
	}

	@Override
	public void enjoy() {
		System.out.println("You have the minion: " + this.nameOfToy);
	}

	@Override
	public String toString() {
		return this.nameOfToy;
	}
	
	
	public static MinionToy generate() {
		MinionToy aMinion = new MinionToy(names[index]);
		index++;
		if (index == names.length) {
			index = 0;
		}
		return aMinion;
	}
}
