public class unmakable_figure_permutation {
    public static void main(String[] args){
        // int[] arr = {3, 2, 1, 1, 9};
        int[] arr = {3, 5, 7};
        boolean[] answer = new boolean[1001];
        System.out.println(String.format("answer : %d", solution(arr, answer)));
    }

    static int solution(int[] arr, boolean[] answer){
        int result = 0;
        for(int i=1; i<=arr.length ;i++){
            permutation(arr, 0, arr.length, i, answer);
        }

        // false인 것 중에서 가장 작은 값 찾기
        for(int i=1; i<answer.length ;i++){
            if(answer[i] == false){
                result = i;
                break;
            }
        }
        return result;
    }

    // 더해서 만들 수 있는 값은 해당되는 index의 answer 배열에 true를 마킹한다.
    static void sum(int[] arr, int r, boolean[] answer){
        int result = 0;
        for(int i=0; i<r ;i++){
            result += arr[i];
        }
        answer[result] = true;
    }

    static void permutation(int[] arr, int depth, int n, int r, boolean[] answer){
        if(r == depth){
            sum(arr, r, answer);
            return;
        }
        for(int i=depth;i<n;i++){
            swap(arr, depth, i);
            permutation(arr, depth+1, n, r, answer);
            swap(arr, depth, i);
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
