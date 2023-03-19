package agent;

public class Order extends Agent {
    Visitor visitor;

    public Order(int id, Supervisor supervisor) {
        super(id, supervisor);
    }
}
