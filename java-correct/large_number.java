import java.util.Arrays;
import java.util.Collections;

public class large_number {
    public static void main(String[] args){
        int[] nmk = {5, 8 ,3};
        Integer[] list = {2 ,4, 5, 4, 6};
        System.out.println(String.format("answer : %s", solution(nmk, list)));
    }

    static int solution(int[] mkn, Integer[] list){
        int answer = 0;
        int n = mkn[0]; int m = mkn[1]; int k = mkn[2];
        int cnt = 0;

        Arrays.sort(list, Collections.reverseOrder());

        // 가장 큰 수, 그 다음으로 큰 수를 준비한다.
        int first = list[0];
        int second = list[1];

        // 최대 연속수 + 1을 묶음으로 그룹 가능수를 계산한다.
        cnt = (m / (k + 1)) * k;
        cnt += m % (k + 1);
        int cnt2 = m - cnt;

        // 부분합을 계산한다.
        int sum1 = cnt * first;
        int sum2 = cnt2 * second;

        answer = sum1 + sum2;

        // for(int i=0; i<m; i++){
        //     if(cnt != k){
        //         cnt++;
        //         answer += list[0];
        //     }else {
        //         cnt = 0;
        //         answer += list[1];
        //     }
        // }

        return answer;
    }
}
