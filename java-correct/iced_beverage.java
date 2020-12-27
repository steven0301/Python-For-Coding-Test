public class iced_beverage {
    public static void main(String[] args){
        int[][] arr = {{0,0,1,1,0},{0,0,0,1,1},{1,1,1,1,1},{0,0,0,0,0}};
        boolean[][] check = new boolean[1000][1000];
        int cnt = 0;

        // 행 : arr.length
        // 열 : arr[x].length
        for(int i=0; i<arr.length ;i++){
            for(int j=0; j<arr[i].length ;j++){
                if(dfs(i, j, arr, check)){
                    cnt++;
                }
            }
        }
        System.out.println(String.format("cnt : %d", cnt));
    }

    static boolean dfs(int x, int y, int[][] arr, boolean[][] check){        
        // 범위 제한
        if(x < 0 || y < 0 || x >= arr.length || y >= arr[x].length){
            return false;
        }

        // 값이 0 이면서 아직 방문하지 않는 노드 확인
        if(check[x][y] == false && arr[x][y] == 0){

            // 노드 방문처리
            check[x][y] = true;

            // 상/하/좌/우 순서로 재귀적 호출
            dfs(x,y+1,arr,check);
            dfs(x,y-1,arr,check);
            dfs(x-1,y,arr,check);
            dfs(x+1,y,arr,check);
            return true;
        }

        return false;
    }
}
