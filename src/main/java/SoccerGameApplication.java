import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoccerGameApplication {
    public static void main(String[] args) {
        ArrayList<String> attacker1 = new ArrayList<String>();
        ArrayList<String> attacker2 = new ArrayList<String>();

        ArrayList<String> goalkeeper = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("attacker1의 공을 입력해주십시오.");
        ArrayList<String> attacker1Balls = Arrays.stream(sc.next().split(","))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("attacker2의 공을 입력해주십시오.");
        ArrayList<String> attacker2Balls = Arrays.stream(sc.next().split(","))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("goalkeeper의 공을 입력해주십시오.");
        ArrayList<String> goalkeeperBalls = Arrays.stream(sc.next().split(","))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
