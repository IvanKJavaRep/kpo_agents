package message.supervisor;

import message.Message;
import agent.Food;

import java.util.List;

public class SendMenu extends Message {
    public List<Food> food;
}
