package message.visitor;

import agent.Food;
import message.Message;

import java.util.List;

public class SendOrder extends Message {
    public List<Food> order;
}
