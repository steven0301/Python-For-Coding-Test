public class ant_warrior_bottomup {
    public static void main(String[] args){
        int[] arr = {1, 3, 1, 5};
        int[] d = new int[arr.length+1];

        d[0] = arr[0];
        d[1] = Math.max(arr[0], arr[1]);

        for(int i=2;i<arr.length;i++){
            d[i] = Math.max(d[i-1], d[i-2] + arr[i]);
        }

        System.out.println(String.format("answer : %d", d[arr.length-1]));
    }
}
