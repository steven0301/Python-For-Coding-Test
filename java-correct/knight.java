public class knight {
    public static void main(String[] args){
        char[] n = {'a', '1'};
        System.out.println(String.format("cnt : %d", solution(n)));
    }

    static int solution(char[] n){
        int cnt = 0;

        // 중요 : char -> int 변경시 Integer.valueOf()를 사용하면 ASCII에 해당되는 숫자가 반환됨
        //       따라서 본인에 해당되는 ASCII를 제하여주고 1을 추가하여 시작.
        int x = n[0] - 'a' + 1;
        int y = n[1] - '0';

        int[] dx = {-2, -2, 2, 2, 1, 1, -1, -1};
        int[] dy = {-1, 1, -1, 1, -2, 2, -2, 2};

        for(int i=0; i<8 ;i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if(1 <= nextX && nextX <=8 && 1<= nextY && nextY <= 8){
                cnt++;
            }
        }
        return cnt;
    }   

}
