public class Trading {

	OfferingList offeringList = new OfferingList();

	@SuppressWarnings("all")
	public void accept(NodeVisitor visitor) {
		System.out.println("Trading Reminder ...");
		visitor.visitTrading();
	}

}
