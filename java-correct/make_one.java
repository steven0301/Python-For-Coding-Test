public class make_one {
    public static void main(String[] args){
        int N = 25;
        int K = 3;
        System.out.println(solution(N, K));
    }

    static int solution(int N, int K) {
        int cnt = 0;
        while(N != 1){
            cnt++;
            if(N % K != 0){
                N--;
            }else {
                N /= K;
            }
        }
        return cnt;
    }

}
