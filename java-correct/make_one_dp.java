import java.util.Arrays;

public class make_one_dp {
    public static int MAX = 10001;
    public static void main(String[] args){
        int n = 26;
        int k = 3;
        int[] d = new int[n+1];
        Arrays.fill(d, MAX);
        System.out.println(String.format("answer : %d", dp(n, k, d)));
    }

    static int dp(int n, int k, int[] d){
        if(n == 1) return 0;
        if(n == 2) return 1;

        if(d[n] != MAX) return d[n];

        d[n] = Math.min(d[n], dp(n-1, k, d) + 1);

        if(n%k == 0) d[n] = Math.min(d[n], dp(n/k, k, d) + 1);

        return d[n];
    }
}
