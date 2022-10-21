
import java.util.ArrayList;
public class ClassProductList extends ArrayList<Product> {
	@SuppressWarnings("all")
	public void accept(NodeVisitor visitor) {
		System.out.println("Class Product List Reminder ...");
	}

}
