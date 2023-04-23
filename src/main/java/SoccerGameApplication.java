
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoccerGameApplication {
    public static void main(String[] args) {
        int attacker1_cnt = 0,attacker2_cnt = 0;
        ArrayList<String> attacker1;
        ArrayList<String> attacker2;
        ArrayList<String> goalkeeper;
        Scanner sc = new Scanner(System.in);

        attacker1 = getPlayer("attacker1",sc);
        attacker2 = getPlayer("attacker2",sc);
        goalkeeper = getPlayer("goalkeeper",sc);

        for (String i : goalkeeper) {
            if(!attacker1.contains(i)) {
                attacker1_cnt += 1;
            }
            if(!attacker2.contains(i)) {
                attacker2_cnt += 1;
            }
        }

        if(attacker1_cnt > attacker2_cnt) {
            System.out.println("attacker1이 승리하였습니다.");
        } else if(attacker1_cnt < attacker2_cnt) {
            System.out.println("attacker2이 승리하였습니다.");
        } else {
            System.out.println("무승부입니다.");
        }
    }

    public static ArrayList<String> getPlayer(String player,Scanner sc) {
        String arr[];
        System.out.println(player+"의 공을 입력해주십시오.");
        arr = sc.next().split(",");
        return Arrays.stream(arr).collect(Collectors.toCollection(ArrayList::new));
    }
}

