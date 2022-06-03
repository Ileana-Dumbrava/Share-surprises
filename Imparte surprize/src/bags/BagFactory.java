package bags;

public class BagFactory implements IBagFactory {

	private static final BagFactory Instance = new BagFactory();
	
	private BagFactory() {
	}
	
	public static BagFactory getInstance() {
		return Instance;
	}

	@Override
	public IBag makeBag(String type) {
		if(type.equalsIgnoreCase("FIFO")){
			return new BagFIFO();
		} else if (type.equalsIgnoreCase("LIFO")) {
			return new BagLIFO();		
		} else {
			return new BagRandom();
		}
	}

}
