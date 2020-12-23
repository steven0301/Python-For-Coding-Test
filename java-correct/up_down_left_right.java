public class up_down_left_right {
    public static void main(String[] args){
        int N = 5;
        char[] arr = {'R', 'R', 'R', 'U', 'D', 'D'};
        int[] list = solution(arr, N);
        System.out.println(String.format("x : %d, y : %d", list[1], list[0]));
    }

    static int[] solution(char[] arr, int N){
        int[] answer = new int[2];
        int x = 1;
        int y = 1;

        for(int i=0; i<arr.length ;i++){
            switch(arr[i]){
                case 'U':
                    if(y != 1) y -= 1;
                    break;
                case 'D':
                    if(y != N) y += 1;
                    break;
                case 'L':
                    if(x != 1) x -= 1;
                    break;
                case 'R':
                    if(x != N) x += 1;
                    break;
            }
        }
        answer[0] = y;
        answer[1] = x;
        return answer;
    }

}
