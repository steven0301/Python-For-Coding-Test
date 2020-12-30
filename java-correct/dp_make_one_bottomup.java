public class dp_make_one_bottomup {
    public static void main(String[] args){
        int n = 26;
        int[] d = new int[n+1];
        d[1] = 0;

        for(int i=2; i<=n ;i++){
            d[i] = d[i-1] + 1;

            if(i%2 == 0) d[i] = Math.min(d[i], d[i/2]+1);

            if(i%3 == 0) d[i] = Math.min(d[i], d[i/3]+1);

            if(i%5 == 0) d[i] = Math.min(d[i], d[i/5]+1);

        }
        System.out.println(String.format("d[%d] = %d",n,d[n]));
    }

}
