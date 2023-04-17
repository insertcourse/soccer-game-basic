import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoccerGameApplication {
    public static void main(String[] args) {
        ArrayList<String> attacker1 = new ArrayList<>();

        ArrayList<String> attacker2 = new ArrayList<>();

        ArrayList<String> goalkeeper = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        

        System.out.println("attacker1의 공을 입력해주십시오.");
        String[] valueString = sc.next().split(",");

        attacker1 = Arrays.stream(valueString)
                        .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("attacker2의 공을 입력해주십시오.");
        valueString = sc.next().split(",");

        attacker2 = Arrays.stream(valueString)
                        .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("goalkeeper의 공을 입력해주십시오.");
        valueString = sc.next().split(",");

        goalkeeper = Arrays.stream(valueString)
                .collect(Collectors.toCollection(ArrayList::new));

        int cnt1 = 0, cnt2 = 0;
        for (String i : goalkeeper){
            if (attacker1.indexOf(i) == -1){
                cnt1++;
            }
            if (attacker2.indexOf(i) == -1){
                cnt2++;
            }
        }

        if (cnt1 > cnt2){
            System.out.println("attacker1이 승리하였습니다.");
        }
        else if(cnt1 == cnt2){
            System.out.println("무승부입니다.");
        }
        else{
            System.out.println("attacker2이 승리하였습니다.");
        }

        sc.close();
    }
}
