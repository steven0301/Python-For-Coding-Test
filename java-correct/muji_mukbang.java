public class muji_mukbang {
    public static void main(String[] args){
        int[] food_times = {3, 1, 2};
        int k = 5;
        System.out.println(String.format("answer : %d", solution(food_times, k)));
    }

    static int solution(int[] food_times, long k){
        int answer = 0;

        
        
        return answer;
    }
}

class Food implements Comparable<Food> {
    private int seq;
    private int index;

    public Food(int seq, int index){
        this.seq = seq;
        this.index = index;
    }

    public int getTime(){
        return this.seq;
    }

    public int getIndex(){
        return this.index;
    }

    // seq가 작은것 부터 우선순위를 가지도록 설정
    @Override
    public int compareTo(Food f){
        return ((Integer)this.seq).compareTo(f.index);
    }

}
