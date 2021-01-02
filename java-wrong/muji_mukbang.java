public class muji_mukbang {
    public static void main(String[] args){
        int[] foodTime = {3, 1, 2};
        int k = 5;
        System.out.println(String.format("answer : %d", solution(foodTime, k)));
    }

    static int solution(int[] foodTime, int k){
        int answer = 0;

        int n = foodTime.length;
        int idx = 0;
        int addIdx = 0;
        for(int i=0; i<=k; i++){
            if(foodTime[i%n] == 0){
                idx++;
                addIdx++;
                continue;
            }else {
                foodTime[i%n]--;
                idx += (addIdx + 1);
            }
        }

        answer = idx%n;
        if(answer == 0){
            return n;
        }

        return answer;
    }
}
