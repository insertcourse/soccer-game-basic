import java.sql.Array;
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
        String[] valueString;
        

        System.out.println("attacker1의 공을 입력해주십시오.");
        String value = sc.next();
        valueString = value.split(",");

        attacker1 = Arrays.stream(valueString)
                        .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("attacker2의 공을 입력해주십시오.");
        value = sc.next();
        valueString = value.split(",");

        attacker2 = Arrays.stream(valueString)
                        .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("goalkeeper의 공을 입력해주십시오.");
        value = sc.next();
        valueString = value.split(",");

        goalkeeper = Arrays.stream(valueString)
                .collect(Collectors.toCollection(ArrayList::new));

        int cnt1 = 0, cnt2 = 0;
        for (String i : goalkeeper){
            for (String j : attacker1){
                if (Integer.parseInt(i) == Integer.parseInt(j)){
                    cnt1++;
                }
            }
            for (String k : attacker2){
                if (Integer.parseInt(i) == Integer.parseInt(k)){
                    cnt2++;
                }
            }
        }

        if (cnt1 < cnt2){
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
