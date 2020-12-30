public class dp_make_one_topdown {
    public static void main(String[] args){
        int n = 26;
        int[] d = new int[n+1];
        System.out.println(String.format("cnt : %d", dp(n, d)));
    }

    // d(n) = minimum(d(n-1), d(n/2), d(n/3), d(n/5)) + 1
    static int dp(int n, int[] d){

        if(n == 1) return 0;

        if(d[n] != 0){
            return d[n];
        }

        // 값을 미리 저장해놓기 위함
        d[n] = dp(n-1,d) + 1;

        if(n%5 == 0){
            d[n] = Math.min(d[n], dp(n/5, d)+1);
        }

        if(n%3 == 0){
            d[n] = Math.min(d[n], dp(n/3, d)+1);
        }

        if(n%2 == 0){
            d[n] = Math.min(d[n], dp(n/2, d)+1);
        }

        return d[n];
    }
    
}
