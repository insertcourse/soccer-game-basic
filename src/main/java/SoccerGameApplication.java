import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
    public class SoccerGameApplication {

    public static void main(String[] args) {

        int a=0,b=0; //attacker1 막힌회수,attacker2 막힌회수

        String arr1[];
        String arr2[];
        String arr3[];
        Scanner scanner = new Scanner(System.in); //변수 선언

        System.out.println("attacker1의 공을 출력해주십시오.");
        arr1 = scanner.nextLine().split(",");
        ArrayList<String> attacker1 = Arrays.stream(arr1)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("attacker2의 공을 출력해주십시오.");
        arr2 = scanner.nextLine().split(",");
        ArrayList<String> attacker2 = Arrays.stream(arr2)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("goalkeeper의 공을 출력해주십시오.");
        arr3 = scanner.nextLine().split(",");
        ArrayList<String> goalkeeper = Arrays.stream(arr3)
                .collect(Collectors.toCollection(ArrayList::new)); //scanner 사용 및 ArrayList 변환

        for (String i : goalkeeper) {
            if(attacker1.contains(i)) {
                a+= 1;
            }
            if(attacker2.contains(i)) {
                b+= 1;
            }
        } //막은 회수 비교

        if(a < b){
            System.out.println("attacker1이 승리하였습니다.");
        }
        else if(a > b){
            System.out.println("attacker2이 승리하였습니다.");
        }
        else {
            System.out.println("무승부입니다.");
        }
    } //출력

    }




