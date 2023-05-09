import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer,String> users = new HashMap<>();
        users.put(1,"Neria");
        users.put(2,"Vered");
        System.out.println(users.get(1));
    }
}
