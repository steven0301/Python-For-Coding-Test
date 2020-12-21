import java.util.Arrays;
import java.util.Collections;

public class change {
    public static void main(String[] args){
        
        // 500, 100, 50, 10 원으로 거스름돈을 내어줄 수 있을 때,
        // 가장 적은 동전으로 손님에게 건내도록 하는 로직을 작성하여라.
        Integer[] list = {100, 50, 500, 10};

        // 역순으로 Array 정렬
        Arrays.sort(list, Collections.reverseOrder());

        /*  cf. 역순으로 List 정렬 :
            Collections.sort(list, new Comparator(){
                @Override
                public int compare(Object obj1, Object obj2){
                    return obj1.getValue().compareTo(obj2.getValue());
                    // compareTo는 앞이 크면 양수 아니면 음수를 내보냄 (같으면 0)
                }
            });
        */
        int change = 1260;
        int answer = solution(change, list);
        System.out.println(String.format("answer : %s", answer));

    }

    static int solution(int change, Integer[] list) {
        int cnt = 0;
        for(int i=0; i<list.length ;i++){
            int coin = list[i];
            cnt += change/coin;
            change %= coin;
        }
        return cnt;
    }

}