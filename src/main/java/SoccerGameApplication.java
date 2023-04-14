import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SoccerGameApplication {
    public static void main(String[] args) {
        String[] attacker1 = {};
        String[] attacker2 = {};

        ArrayList<String> a1_list = Arrays.stream(attacker1)
        .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<String> a2_list = Arrays.stream(attacker2)
        .collect(Collectors.toCollection(ArrayList::new));

        String[] goalkeeper = {};
        ArrayList<String> g_list = Arrays.stream(goalkeeper)
        .collect(Collectors.toCollection(ArrayList::new));
    }
}
