import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Facade Pattern called
        Facade object = new Facade(); // Facade Design Pattern Used Here
        object.createProductList();
        int option;
        do {
            System.out.println("\n\n1) LOGIN PAGE\n2) REMINDER\n3) EXIT");
            System.out.print("Enter option: ");
            Scanner inp = new Scanner(System.in);
            option = inp.nextInt();
            switch (option) {
                case 1 -> {
                    boolean verify = object.login();
                    if (!verify) {
                        System.out.println("Login Failed");
                        continue;
                    }
                    System.out.println("<<FACADE DESIGN PATTERN USED HERE>>");
                    object.createUser();
                    object.attachProductToUser();
                    object.productOperation();
                }
                case 2 -> {
                    Reminder r = new Reminder(object);
                    r.remind();
                }
            }
        }while(option!=3);
    }
}
