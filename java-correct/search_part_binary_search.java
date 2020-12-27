import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class search_part_binary_search {
    public static void main(String[] args){
        int[] list = {8,3,7,9,2};
        int[] checkList = {5,7,9};

        // 이진탐색 이전에 정렬 수행
        Arrays.sort(list);

        List<String> answerList = solution(list, checkList);
        for(String str : answerList){
            System.out.print(String.format("%s ", str));
        }
    }

    static List<String> solution(int[] list, int[] checkList){
        List<String> result = new ArrayList<>();
        for(int i=0; i<checkList.length ;i++){
            int temp = binarySearch(list, checkList[i], 0, list.length-1);

            if(temp != -1) result.add("yes");

            else result.add("no");
        }
        return result;
    }    

    static int binarySearch(int[] list, int target, int start, int end){
        while(start <= end){
            int mid = (start + end) / 2;
            if(list[mid] == target) return mid;

            else if(list[mid] > target) end = mid-1;

            else start = mid+1;
        }
        return -1;
    }
}
