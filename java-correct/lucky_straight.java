import java.util.Scanner;

public class lucky_straight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append(sc.next());
        System.out.println(String.format("%s", solution(sb.toString())));
    }

    static String solution(String str){
        String answer = "READY";
        int sum1 = 0;
        int sum2 = 0;
        int len = str.length();
        
        for(int i=0; i<len ;i++){
            if(i<(len/2)) sum1 += (str.charAt(i)-'0');

            else sum2 += (str.charAt(i)-'0');
        }

        if(sum1 == sum2) answer = "LUCKY";

        return answer;
    }
}
