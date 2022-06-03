package give;

import java.util.concurrent.TimeUnit;

import bags.BagFactory;
import bags.IBag;
import surprise.ISurprise;

public abstract class AbstractGiveSurprises {
	
	private final IBag bag;
	private final int waitTime;
	
	public AbstractGiveSurprises(String type, int waitTime) {
		this.bag = BagFactory.getInstance().makeBag(type);
		this.waitTime = waitTime;
	}

	public void put(ISurprise newSurprise) {
		this.bag.put(newSurprise);
	}
	
	public void put(IBag surprises) {
		this.bag.put(surprises);
	}
	
	public void give() {
		if (this.bag.isEmpty()) {
			System.out.println("The bag is empty");
			return;
		} 
	
		this.bag.takeOut().enjoy();
		this.giveWithPassion();		
	}
	

	public void giveAll() {
		if (this.bag.isEmpty()) {
			System.out.println("The bag is empty");
			return;
		}
	
		int limit = this.bag.size();
		while (limit > 0) {
			try {
				this.give();
				TimeUnit.SECONDS.sleep(waitTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
			limit--;
		}
	}

	public boolean isEmpty() {
		return this.bag.isEmpty();
	}

	abstract void giveWithPassion();

}
