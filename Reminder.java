public class Reminder {

    Facade fo;

    public Reminder(Facade object) {
        this.fo = object;
    }

    public void remind() {
        ReminderVisitor rv = new ReminderVisitor(fo.trades); // Visitor Design Pattern Used Here
        System.out.println("<<VISITOR DESIGN PATTERN USED HERE TO VISIT OBJECTS>>");
        rv.visitFacade(fo);
        rv.visitProduct();
        rv.visitTrading();
    }
}
