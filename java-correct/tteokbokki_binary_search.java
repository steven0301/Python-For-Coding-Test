import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class tteokbokki_binary_search {
    public static void main(String[] args){
        Integer arr[] = {19,15,10,17};
        Arrays.sort(arr, Collections.reverseOrder());
        int n = 6;

        // int[] -> ArrayList : Max 값을 찾기위함
        // Arrays.sort(arr) 이후 arr[arr.length-1]로 찾는것도 가능함
        List<Integer> list = new ArrayList<>();
        for(int e : arr){
            list.add(e);
        }

        int start = 0;
        int end   = Collections.max(list);
        System.out.printf("answer : %d", binary_search(arr, n, start, end));
    }

    static int binary_search(Integer[] arr, int target, int start, int end){
        int result = 0;
        while(start<=end){
            int mid = (start + end)/2;
            int sum = 0;
            for(int i=0; i<arr.length && arr[i]>mid ; i++){
                sum += arr[i]-mid;
            }

            if(sum == target) return mid;

            // 우측으로 이동
            else if(sum > target) {
                result = mid; // <- 최대한 덜 잘랐을 경우가 정답이므로
                start = mid + 1;
            }

            // 좌측으로 이동
            else end = mid - 1;
        }
        return result;
    }
}
