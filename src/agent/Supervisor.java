package agent;

import message.Message;

import java.util.AbstractQueue;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Supervisor extends Agent {

    public Queue<Message> messages;
    List<Agent> agents;

    public Supervisor(int id, Supervisor supervisor) {
        super(id, supervisor);
        messages = new ConcurrentLinkedQueue<>();
    }

    public void receiveMessage(Message message) {
        messages.add(message);
    }

    void takeMessage() {
        messages.poll();
    }


    protected void sendMessage(Message message) {

    }

    Agent makeAgent() {
        return null;
    }

}
