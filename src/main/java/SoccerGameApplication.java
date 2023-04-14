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

        int cnt1 = 0, cnt2 = 0;
        int numberI, numberJ, numberK;
        for (String i : g_list){
            numberI = Integer.parseInt(i);
            for (String j : a1_list){
                numberJ = Integer.parseInt(j);
                if (numberI == numberJ){
                    cnt1 += 1;
                }
            }
            for (String k : a2_list){
                numberK = Integer.parseInt(k);
                if (numberI == numberK){
                    cnt2 += 1;
                }
            }
        }

        if (cnt1 < cnt2){
            System.out.println("attack1이 승리하였습니다.");
        }
        else if(cnt1 == cnt2){
            System.out.println("무승부입니다.");
        }
        else{
            System.out.println("attack2이 승리하였습니다.");
        }

        sc.close();
    }
}
