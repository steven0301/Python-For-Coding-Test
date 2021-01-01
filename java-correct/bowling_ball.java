import java.util.Arrays;

public class bowling_ball {
    public static void main(String[] args){
        int n = 3;
        int[] arr = {1, 3, 2, 3, 2};
        // int n = 5;
        // int[] arr = {1, 5, 4, 3, 2, 4, 5, 2};
        System.out.println(String.format("answer : %d", solution(arr, n)));
    }

    static int solution(int[] arr, int n){
        int result = 0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1 ;i++){
            for(int j=i+1; j<arr.length ;j++){
                if(arr[i] == arr[j]) continue;
                result++;
            }

        }
        return result;
    }
}
