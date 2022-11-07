package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Opponent {
    protected static List<Integer> answer;
    public Opponent(){
        Opponent.answer = createAnswer();
    }

    public static boolean checkRandomNumber(int num, List<Integer> list) {
        return !list.contains(num);
    }
    public static List<Integer> createAnswer(){
        List<Integer> list = new ArrayList<>();
        while(list.size() < 3){
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if(!checkRandomNumber(randomNumber, list)){
                continue;
            }
            list.add(randomNumber);
        }
        System.out.println(list);
        return list;
    }

    public static Integer getNumber(int idx){
        return answer.get(idx);
    }
}