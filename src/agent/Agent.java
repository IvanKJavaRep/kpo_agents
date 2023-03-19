package agent;

import message.Message;

public abstract class Agent {
    int id;
    Supervisor supervisor;

    public Agent(int id, Supervisor supervisor) {
        this.id = id;
        this.supervisor = supervisor;
    }

    protected void sendMessage(Message message) {
        supervisor.receiveMessage(message);
    }
    protected void receiveMessage(Message message)
    {

    }
}
