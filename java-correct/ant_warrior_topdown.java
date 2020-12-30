public class ant_warrior_topdown {
    public static void main(String[] args){
        int[] arr = {1, 3, 1, 5};
        int[] d = new int[arr.length+1];
        System.out.println(String.format("answer : %d", dp(arr, d, arr.length-1)));
    }

    // d(n) = max(d(n-1), d(n-2) + k)
    static int dp(int[] arr, int[] d, int n){
        if(n == 0){
            return arr[0];
        }
        if(n == 1){
            return Math.max(arr[0], arr[1]);
        }
        if(d[n] != 0){
            return d[n];
        }
        d[n] = Math.max(dp(arr, d, n-1), dp(arr, d, n-2) + arr[n]);
        return d[n];
    }
}
