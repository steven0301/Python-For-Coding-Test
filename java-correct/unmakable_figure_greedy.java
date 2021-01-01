import java.util.Arrays;

public class unmakable_figure_greedy {
    public static void main(String[] args){
        int[] arr = {3, 2, 1, 1, 9};
        // int[] arr = {3, 5, 7};
        System.out.println(String.format("answer : %d", solution(arr)));
    }

    static int solution(int[] arr){
        int result = 0;
        
        Arrays.sort(arr);

        result = 1;
        for(int i=0; i<arr.length ;i++){
            if(result < arr[i]){
                break;
            }
            result += arr[i];
        }

        return result;
    }

}
