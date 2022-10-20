public abstract class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	private ClassProductList classProductList;

	public Reminder visitProduct(Product product) {
		System.out.println("Visiting product");
		return product;
	}

	public Reminder visitTrading(Trading trading) {
		System.out.println("Visiting trading");
		return trading;
	}

	public Reminder visitFacade(Facade facade) {
		System.out.println("Visiting facade");
		return facade;
	}

	public Reminder visitClassProductList(ClassProductList classProductList) {
		System.out.println("Visiting class product list");
		return classProductList;
	}

}
