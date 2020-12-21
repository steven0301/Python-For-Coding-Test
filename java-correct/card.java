public class card{
    public static void main(String[] args){
        int[][] arr = {{3,1,2}, {4,1,4}, {2,2,2}};
        System.out.println(solution(arr));
    }

    static int solution(int[][] arr){
        int max = 0; // <-- 전체 행렬 중에서 최댓값을 찾아야 한다.
        for(int i=0; i<arr.length ;i++){
            int min = 100001; // <-- 행 내에서 최솟값을 찾아야 한다.
            for(int j=0; j<arr[i].length; j++){
                min = Math.min(min, arr[i][j]);
            }
            max = Math.max(min, max);
        }
        return max;
    }
}