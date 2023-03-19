package agent;

import java.util.List;

public class Bill extends Agent {
    Order order;
    List<Food> food;

    public Bill(int id, Supervisor supervisor) {
        super(id, supervisor);
    }

    //в копейках
    int sum() {
        return 0;
    }
}
