public class time {
    public static void main(String[] args){
        int n = 5;
        System.out.println(String.format("counts : %d", solution(n)));
    }

    static int solution(int n){
        int cnt = 0;
        for(int h=0; h<=n; h++){
            for(int m=0; m<60 ;m++){
                for(int s=0; s<60 ;s++){
                    // 1의 자리, 10의 자리 체크
                    if(h%10 == n || m%10 == n | s%10 == n || h/10 == n || m/10 == n | s/10 == n){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

}
