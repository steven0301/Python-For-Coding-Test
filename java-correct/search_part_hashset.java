import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 이전탐색이 아닌, HashSet을 사용해서 검사한다.
public class search_part_hashset {
    public static void main(String[] args){
        int[] list = {8,3,7,9,2};
        int[] checkList = {5,7,9};

        // list -> set 저장
        Set<Integer> set = new HashSet<>();
        for(int e : list){
            set.add(e);
        }

        List<String> answerList = solution(set, checkList);
        for(String str : answerList){
            System.out.print(String.format("%s ", str));
        }
    }

    static List<String> solution(Set<Integer> set, int[] checkList){
        List<String> result = new ArrayList<>();
        for(int e : checkList){
            if(set.contains(e)) result.add("yes");

            else result.add("no");
        }
        return result;
    }    
}
