public class Reminder {

    Facade fo;

    public Reminder(Facade object) {
        this.fo = object;
    }

    public void remind() {
        ReminderVisitor rv = new ReminderVisitor(fo.trades);
        Product p = new Product("", "");
        Trading t = new Trading();// Visitor Design Pattern Used Here
        System.out.println("<<VISITOR DESIGN PATTERN USED HERE TO VISIT OBJECTS>>");
        fo.accept(rv);
        p.accept(rv);
        t.accept(rv);
    }
}
