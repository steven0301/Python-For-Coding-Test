import java.util.Arrays;
import java.util.Collections;

public class tteokbokki_binary_search {
    public static void main(String[] args){
        Integer arr[] = {19,15,10,17};
        Arrays.sort(arr, Collections.reverseOrder());
        int n = 6;
        solution(arr, n);
    }

    static void solution(Integer[] arr, int n){
        System.out.println(binarySearch(arr, n, 1, 1000000));
    }

    static int binarySearch(Integer[] arr, int target, int start, int end) {
        int result = 0;
        while (start <= end) {
            int mid = (start + end) / 2;

            int total = 0;
            for(int i=0; i<arr.length && arr[i] > mid; i++){
                total += arr[i] - mid;
            }

            if(total == target){
                return mid;
            }

            // 우측으로 이동해야 함
            else if (total > target){
                result = mid; // <- 중요 : 
                start = mid + 1;
            } 

            // 좌측으로 이동해야 함
            else end = mid - 1; 
        }
        return result;
    }
}
