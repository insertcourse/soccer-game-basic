## 기본 자바 문법 - 축구게임

1. [Scanner](https://st-lab.tistory.com/92)
2. [강화포문](https://java119.tistory.com/107)
3. [String 메서드](https://kadosholy.tistory.com/111)
4. [컬렉션 프레임웤](https://jacobhboy66.tistory.com/18)

### 기능 요구사항
- 공격수의 이름은 attacker1, attacker2이다.
- 골키퍼의 이름은 goalkeeper 이다.
- 각각 공격수에게 찰 공 5개를 컴마로 분리하여 입력받는다. 공의 범위는 0 ~ 10 사이다.
- 골키퍼는 막을 수 있는 공 4개를 컴마로 분리하여 입력받는다.
- 공격수가 골을 넣는 조건은 골키퍼와 겹치지 않는 값의 공을 가지고 있는 것이다.
- 5번의 공격수의 슈팅후에 두명의 공격수중에 더 많은 골을 넣은 공격수의 이름 + '이 승리하였습니다'를 출력한다.
- 두 공격수의 득점이 동일하다면, '무승부입니다'를 출력한다.

### 기능 구현목록

- [X] 공격수 2명(attacker1, attacker2)을 ArrayList<String>로 선언을 한다.
- [X] 골키퍼(goalkeeper)을 ArrayList<String>로 선언을 한다.
  - 배열을 ArrayList로 만드는 방법은 다음과 같다.
```java
        String[] array = {"value1", "value2"};

        ArrayList<String> arrayList = Arrays.stream(array)
                .collect(Collectors.toCollection(ArrayList::new));
```
- [ ] 공격수 두 명의 공을 입력받는다.
  - 간편함을 위해 공을 검증하진 않는다.
- [ ] 골키퍼가 막을 수 있는 공을 입력받는다.
- [ ] 공격수와 골키퍼의 공을 비교한다.
- [ ] 결과를 출력한다.

### 콘솔
<img src="https://cdn.discordapp.com/attachments/979610207074258956/1096023009648726066/KakaoTalk_20230413_194333299.png" width="50%" height="50%">

### 프로그래밍 요구사항 
- 기능을 하나 구현하면 구현한 기능을 설명하는 한 줄의 커밋을 한다.


### 미션을 진행하는 법
1. Repository를 fork한다.
2. 자신의 깃허브 이름으로 branch를 생성한다.
3. 기능 요구사항을 보고, 기능을 구현할 때 마크다운에 체크를 한다.
4. 모두 구현한 후 pull request를 요청한다. 
5. 코드리뷰 후 개선한다.