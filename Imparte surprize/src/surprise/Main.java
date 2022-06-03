package surprise;

import bags.BagFactory;
import bags.IBag;
import give.GiveSurpriseAndApplause;
import give.GiveSurpriseAndSing;

public class Main {

	public static void minionToy() {
		GiveSurpriseAndApplause bag1 = new GiveSurpriseAndApplause("FIFO", 1);
		bag1.put(MinionToy.generate());
		bag1.put(MinionToy.generate());
		bag1.put(MinionToy.generate());
		bag1.put(MinionToy.generate());
		bag1.put(MinionToy.generate());
		bag1.put(MinionToy.generate());
		bag1.put(MinionToy.generate());
		bag1.put(MinionToy.generate());
		bag1.giveAll();
		System.out.println();
	}
	

	public static void createSurpriseAndGive() {
		ISurprise surprise1 = GatherSurprises.gather();
		ISurprise surprise2 = GatherSurprises.gather();
		ISurprise surprise3 = GatherSurprises.gather();
		ISurprise surprise4 = GatherSurprises.gather();
		ISurprise surprise5 = GatherSurprises.gather();
		
		System.out.println(surprise1);
		System.out.println(surprise2);
		System.out.println(surprise3);
		System.out.println(surprise4);
		System.out.println(surprise5);
		System.out.println();

		GiveSurpriseAndSing bag = new GiveSurpriseAndSing("LIFO", 1);
		bag.put(surprise1);
		bag.put(surprise2);
		bag.put(surprise3);
		bag.put(surprise4);
		bag.put(surprise5);
		System.out.println();
		bag.giveAll();
		System.out.println();
	}
	
	
	public static void createBagAndTakeOut() {
		IBag bag1 = BagFactory.getInstance().makeBag("LIFO");
		bag1.put(FortuneCookie.generate());
		bag1.put(MinionToy.generate());
		
		IBag bag2 = BagFactory.getInstance().makeBag("FIFO");
		bag2.put(FortuneCookie.generate());
		
		bag1.put(bag2);

		
		while (bag1.size() != 0) {
			System.out.println(bag1.takeOut());
		}	
	}
	
	public static void main(String[] args) {
		minionToy();
		createSurpriseAndGive();
		createBagAndTakeOut();
	}

}
