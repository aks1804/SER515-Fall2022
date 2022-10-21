public class ProductIterator implements ListIterator {

	ClassProductList productList;
	int pos=0;

	public ProductIterator(ClassProductList theProductList) {
		this.productList=theProductList;
	}


	public boolean hasNext() {
		return pos < productList.size() && productList.get(pos) != null;
	}

	public Product next() {
		Product product = productList.get(pos);
		pos+=1;
		return product;
	}

	public void moveToHead() {
		pos=0;
	}

}
