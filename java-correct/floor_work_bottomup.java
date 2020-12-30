public class floor_work_bottomup {
    public static void main(String[] args){
        int n = 3;
        int[] d = new int[n+1];
        
        d[1] = 1;
        d[2] = 3;

        for(int i=2; i<n ;i++){
            d[n] = d[n-1] + 2*d[n-2];
        }
        System.out.println(String.format("answer : %d", d[n]));
    }
}
