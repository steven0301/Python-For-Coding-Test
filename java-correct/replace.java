import java.util.Arrays;
import java.util.Collections;

public class replace {
    public static void main(String[] args){
            int[] arr1 = {1,2,5,4,3};
            Integer[] arr2 = {5,5,6,6,5};

            // 풀이
            // arr1 : 1 2 3 4 5  <- 오름차순 정렬
            // arr2 : 6 6 5 5 5  <- 내림차순 정렬
            // arr1[i] < arr2[i]일 경우 k개수 제한에 맞춰서 교체

            int k = 3;
            System.out.println(String.format("N : %d", solution(arr1, arr2, k)));
    }

    public static int solution(int[] arr1, Integer[] arr2, int k) {
        Arrays.sort(arr1);
        // Collections.reverseOrder()를 사용하기 위해서는 배열이 Integer 타입이어야 한다.
        Arrays.sort(arr2, Collections.reverseOrder());
        int n = 0;
        for(int i=0; i<arr1.length && n != k; i++){
            if(arr1[i] < arr2[i]){
                swap(arr1, arr2, i);
                n++;
            }
        }

        int cnt = 0;
        for (int e : arr1) {
            cnt += e;
        }

        return cnt;
    }

    public static void swap(int[] arr1, Integer[] arr2, int i) {
        int temp = arr2[i];
        arr1[i] = arr2[i];
        arr2[i] = temp;
    }

}
