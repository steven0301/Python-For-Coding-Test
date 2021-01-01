import java.util.HashMap;
import java.util.Map;

public class adventurer {
    public static void main(String[] args){
        // int[] arr = {2,3,1,2,2};
        int[] arr = {2,3,4,2,3,4,5,6};
        System.out.println(String.format("answer : %d", solution(arr)));
    }

    static int solution(int[] arr){
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length ;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        // map : (1, 1), (2, 3), (3, 1)
        // group(1,2,3)은 group(1)만 있는 것을 count하는것과 큰 차이가 없다고 생각함 (오답)
        for(int key : map.keySet()){
            if(map.get(key) >= key){
                result += (map.get(key)/key);
                map.put(key, map.get(key)-key);
            }
        }

        return result;
    }

}