public class Buyer extends Person {

	public void showMenu() {
		System.out.println("Buyer Menu Items: ");
		productMenu.showMenu();
	}

	public void createProductMenu(int menuType){
		if(menuType==0)
			productMenu = new MeatProductMenu();
		else
			productMenu = new ProduceProductMenu();
	}
}
