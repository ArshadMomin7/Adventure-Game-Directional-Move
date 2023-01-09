import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations=  new HashMap<Integer,Location>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        locations.put(0,new Location(0,"You are sitting in front of the computer learning java"));
        locations.put(1,new Location(1,"You are standing at the end of the road before a small building"));
        locations.put(2,new Location(2,"You are at the top of the hill"));
        locations.put(3,new Location(3,"You are inside the building "));
        locations.put(4,new Location(4,"You are at the valley "));
        locations.put(5,new Location(5,"You are in forest"));

        locations.get(1).add_exit("W",2);
        locations.get(1).add_exit("E",3);
        locations.get(1).add_exit("S",4);
        locations.get(1).add_exit("N",5);
//        locations.get(1).add_exit("Q",0);

        locations.get(2).add_exit("N",5);
//        locations.get(2).add_exit("Q",0);

        locations.get(3).add_exit("W",1);
//        locations.get(3).add_exit("Q",0);

        locations.get(4).add_exit("N",1);
        locations.get(4).add_exit("W",2);
//        locations.get(4).add_exit("Q",0);

        locations.get(5).add_exit("S",1);
        locations.get(5).add_exit("W",2);
//        locations.get(5).add_exit("Q",0);


        int loc = 1;
        while (true){
            System.out.println(locations.get(loc).getDescription());
            if (loc==0){
                break;
            }

            Map<String,Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()){
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = sc.nextLine().toUpperCase();
            if (exits.containsKey(direction)){
                loc = exits.get(direction);
            }else {
                System.out.println("You cannot go in that direction");
            }
            if (!locations.containsKey(loc)){
                System.out.println("You cannot go in the direction");
            }
        }
    }
}
