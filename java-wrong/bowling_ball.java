import java.util.HashMap;
import java.util.Map;

public class bowling_ball {
    public static void main(String[] args){
        // int n = 3;
        // int[] arr = {1, 3, 2, 3, 2};
        int n = 5;
        int[] arr = {1, 5, 4, 3, 2, 4, 5, 2};
        System.out.println(String.format("answer : %d", solution(arr, n)));
    }

    static int solution(int[] arr, int n){
        int result = 0;

        // (1, 1), (2, 2), (3, 2)
        //  1 : 2+2, 2 : 1*2, 3: 2*1
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length ;i++){
            // map.put(i, map.getOrDefault(i, 0)+1) 이 아닌거 조심
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        int temp;
        for(int key1 : map.keySet()){
            temp = 1;
            for(int key2 : map.keySet()){
                if(key1 == key2) continue;
                temp *= map.get(key2);
                System.out.println(String.format("key2 : %d, value : %d, temp : %d", key2, map.get(key2), temp));
            }
            result += temp;
        }

        return result;
    }
}
