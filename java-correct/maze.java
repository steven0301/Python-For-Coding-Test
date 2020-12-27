public class maze {
    public static void main(String[] args){
        int[][] arr = {{1,0,1,0,1,0},{1,1,1,1,1,1},{0,0,0,0,0,1},{1,1,1,1,1,1},{1,1,1,1,1,1}};
        boolean[][] check = new boolean[arr.length][arr[0].length];
        int cnt = 0;
        
        for(int i=0; i<arr.length ;i++){
            for(int j=0; j<arr[i].length ;j++){
                if(bfs(i,j,arr,check)){
                    cnt++;
                }
            }
        }

        System.out.println(String.format("cnt : %d", cnt));
    }

    static boolean bfs(int x, int y, int[][] arr, boolean[][] check){

        if(x < 0 || y < 0 || x >= 5 || y >= 6){
            return false;
        }

        if(check[x][y] == false && arr[x][y] != 0){

            check[x][y] = true;

            bfs(x+1, y, arr, check);
            bfs(x-1, y, arr, check);
            bfs(x, y+1, arr, check);
            bfs(x, y-1, arr, check);
        }

        return false;
    }

}
