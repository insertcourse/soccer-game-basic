import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class
SoccerGameApplication {
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

        Scanner sc = new Scanner(System.in);
        String[] valueString;
        

        System.out.println("attacker1의 공을 입력해주십시오.");
        String value = sc.next();
        valueString = value.split(",");

        for (int i = 0; i < 5; i++) {
            a1_list.add(valueString[i]);
        }

        System.out.println("attacker2의 공을 입력해주십시오.");
        value = sc.next();
        valueString = value.split(",");

        for (int i = 0; i < 5; i++){
            a2_list.add(valueString[i]);
        }

        System.out.println("goalkeeper의 공을 입력해주십시오.");
        value = sc.next();
        valueString = value.split(",");


        for (int i = 0; i < 4; i++){
            g_list.add(valueString[i]);
        }


        sc.close();
    }
}
