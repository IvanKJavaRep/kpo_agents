package agent;

import java.util.List;

public class Storage extends Agent {
    List<Material> materials;

    public Storage(int id, Supervisor supervisor) {
        super(id, supervisor);
    }
}
