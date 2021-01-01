import java.util.ArrayList;
import java.util.List;

public class multiple_or_add {
    public static void main(String[] args){
        // String str = "02984";
        String str = "567";
        System.out.println(String.format("answer : %d", solution(str)));
    }

    static int solution(String str){
        int result = 0;
        
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<str.length() ;i++){
            list.add(str.charAt(i)-'0');
        }

        result = list.get(0);
        for(int i=1; i<list.size() ;i++){
            int add = result + list.get(i);
            int mul = result * list.get(i);
            result = Math.max(add, mul);
        }

        return result;
    }
}
