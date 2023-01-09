import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int location_id;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int location_id, String description) {
        this.location_id = location_id;
        this.description = description;
        this.exits= new HashMap<String , Integer>();
        this.exits.put("Q",0);
    }

    public int getLocation_id() {
        return location_id;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }

    public void add_exit (String direction , int location ){
        exits.put(direction,location);

    }
}
