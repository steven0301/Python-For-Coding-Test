import java.util.Arrays;

public class efficient_currency {
    public static void main(String[] args){
        int[] arr = {2,3};
        int n = 15;
        // int[] arr = {3, 5, 7};
        // int n = 4;
        int[] d = new int[n+1];
        Arrays.fill(d, 10001);
        
        d[2] = 1;
        d[3] = 1;

        // a(n) = min(a(n-arr[i], a(n-arr[i+1], ... a(n-arr[i+k])))
        for(int i=4; i<=n ;i++){
            for(int j=0; j<arr.length ;j++){
                if(i-arr[j]>0)
                    d[i] = Math.min(d[i], d[i-arr[j]]+1);
            }
        }

        if(d[n] == 10001){
            d[n] = -1;
        }

        System.out.println(String.format("answer : %d", d[n]));
    }
}
