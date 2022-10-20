public class Product {

	private Trading trading;

	private ClassProductList classProductList;

	public Reminder accept(NodeVisitor visitor) {
		System.out.println("Product Reminder ...");
		return visitor.visitProduct(this);
	}

}
