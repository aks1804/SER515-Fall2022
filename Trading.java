public class Trading {

	private OfferingList offeringList;

	private Product product;

	public Reminder accept(NodeVisitor visitor) {
		System.out.println("Trading Reminder ...");
		return visitor.visitTrading(this);
	}

}
