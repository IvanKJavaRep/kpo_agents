import agent.Beverage;
import agent.Food;
import agent.Supervisor;
import agent.Visitor;
import message.supervisor.SendMenu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor(1, null);
        List<Food> foods = new ArrayList<>();
        foods.add(new Beverage(1, supervisor));
        SendMenu sendMenu = new SendMenu();
        sendMenu.food = foods;
        Visitor visitor = new Visitor(1, supervisor);
        visitor.receiveMessage(sendMenu);
        System.out.println(supervisor.messages.peek());

    }
}