
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoccerGameApplication {
    public static void main(String[] args) {
        ArrayList<String> attacker1;
        ArrayList<String> attacker2;
        ArrayList<String> goalkeeper;
        Scanner sc = new Scanner(System.in);

        attacker1 = getPlayer("attacker1",sc);
        attacker2 = getPlayer("attacker2",sc);
        goalkeeper = getPlayer("goalkeeper",sc);
    }

    public static ArrayList<String> getPlayer(String player,Scanner sc) {
        String arr[];
        System.out.println(player+"의 공을 입력해주십시오.");
        arr = sc.next().split(",");
        return Arrays.stream(arr).collect(Collectors.toCollection(ArrayList::new));
    }
}

