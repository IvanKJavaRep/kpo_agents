package agent;

import message.Message;
import message.supervisor.*;
import message.visitor.SendOrder;

import java.util.ArrayList;
import java.util.List;

public class Visitor extends Agent {

    public Visitor(int id, Supervisor supervisor) {
        super(id, supervisor);
    }

    public void receiveMessage(Message message) {
        if (message instanceof ChangeOrder) {

        } else if (message instanceof SendMenu) {
            List<Food> food = ((SendMenu) message).food;
            Food f = food.get(0);
            List<Food> order = new ArrayList<>();
            order.add(f);
            SendOrder sendOrder = new SendOrder();
            sendOrder.order = order;
            this.sendMessage(sendOrder);

        } else if (message instanceof SendOrderBill) {

        } else if (message instanceof SendOrderTime) {

        } else if (message instanceof SendOrderConfirnation) {

        } else {
            System.out.println("Message not acceptable " + message.getClass().toString());
        }
    }


}
