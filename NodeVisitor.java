public abstract class NodeVisitor {

	public abstract Reminder visitProduct(Product product);

	public abstract Reminder visitTrading(Trading trading);

	public abstract Reminder visitFacade(Facade facade);

	public abstract Reminder visitClassProductList(ClassProductList classProductList);

}
