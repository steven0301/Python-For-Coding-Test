public class letter_change {
    public static void main(String[] args){
        // String str = "0001100";
        String str = "01011010";
        System.out.println(String.format("answer : "+ solution(str)));
    }   

    static int solution(String str){
        int result = 0;

        int[] arr = new int[str.length()];
        for(int i = 0; i<str.length() ;i++){
            arr[i] = str.charAt(i)-'0';
        }

        int group0 = 0;
        int group1 = 0;
        if(arr[0] == 0){
            group0++;
        }else {
            group1++;
        }
        int temp = arr[0];
        for(int i=1; i<arr.length ;i++){
            if(temp != arr[i]){
                if(temp == 0){
                    group1++;
                }else {
                    group0++;
                }
                temp = arr[i];
            }
        }

        result = Math.min(group0, group1);      

        return result;
    }
}
