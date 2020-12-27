import java.util.Arrays;
import java.util.Collections;

public class tteokbokki {
    public static void main(String[] args){
        Integer arr[] = {19,15,10,17};
        Arrays.sort(arr, Collections.reverseOrder());
        int n = 6;
        System.out.println(String.format("number : %d", solution(arr, n)));
    }

    static int solution(Integer[] arr, int n){
        int result = 0;
        for(int i=1; i<=1000000 ;i++){
            int sum = 0;
            for(int j=0; j<arr.length && arr[j] > i ;j++){
                sum += arr[j] - i;
            }
            if(sum == n) {
                result = i;
                break;
            // 같은 조건을 만족하지 못하고, 최초로 n보다 작아졌을 경우
            }else if(sum < n){
                result = i-1;
                break;
            }
        }
        return result;
    }
}
