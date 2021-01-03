public class string_rearrangement {
    public static void main(String[] args){
        String str = "AJKDLSI412K4JSJ9D";
        System.out.println(String.format("%s", solution(str)));
    }

    static String solution(String str){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            // 숫자일 경우를 추출
            if(ch-'0' >= 0 && ch-'0' < 10) sb1.append(ch);

            // Character.isLetter(ch) 를 통해서 알파벳을 판별할 수도 있다
            else sb2.append(ch);
        }
        return sb2.append(sb1).toString();
    }
}
