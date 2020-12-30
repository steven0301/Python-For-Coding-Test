public class floor_work_topdown {
    public static void main(String[] args){
        int n = 3;
        int[] d = new int[n+1];
        System.out.println(String.format("answer : %d", dp(n, d)));
    }

    static int dp(int n, int[] d){
        if(n == 1) return 1;
        if(n == 2) return 3;
        if(d[n] != 0) return d[n];
        d[n] = dp(n-1,d) + 2*dp(n-2,d);
        return d[n];
    }

}
