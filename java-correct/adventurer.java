import java.util.Arrays;

public class adventurer {
    public static void main(String[] args){
        // int[] arr = {2,3,1,2,2};
        int[] arr = {2,3,4,2,3,4,5,6};
        // int[] arr = {2,2,3,3,4};
        System.out.println(String.format("answer : %d", solution(arr)));
    }

    static int solution(int[] arr){
        int groupCnt = 0;
        int cnt = 0;

        Arrays.sort(arr);
        // cnt :  1  2  3  4  5  6  7  8
        // 결과 : {2, 2, 3, 3, 4, 4, 5, 6}
        //        |..|  |........|
        // 즉, 마지막에 해당되는 숫자 = 한 그룹의 길이
        for(int i=0; i<arr.length ;i++){
            cnt++;
            if(arr[i] <= cnt){
                groupCnt++;
                cnt=0;
            }
        }
        return groupCnt;
    }

}