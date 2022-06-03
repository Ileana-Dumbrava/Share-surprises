package bags;

import java.util.ArrayList;

import surprise.ISurprise;

public class BagFIFO implements IBag {
	
	private final ArrayList<ISurprise> surprises;
	
	public BagFIFO(){
		this.surprises = new ArrayList<>();
	}
	
	@Override
	public void put(ISurprise newSurprise) {
		this.surprises.add(newSurprise);
	}
	
	@Override
	public void put(IBag bagOfSurprises) {
		for (int i = 0; i < bagOfSurprises.size(); i++) {
			this.surprises.add(bagOfSurprises.takeOut());
		}
	}

	@Override
	public ISurprise takeOut() {
		if (!this.surprises.isEmpty()) {
			return this.surprises.remove(0);
		}
		
		System.out.println("The bag is empty");
		return null;	
	}

	@Override
	public boolean isEmpty() {
		return this.surprises.isEmpty();
	}
	
	@Override
	public int size() {
		return this.surprises.size();
	}
}
