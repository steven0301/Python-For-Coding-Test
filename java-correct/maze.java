import java.util.LinkedList;
import java.util.Queue;

public class maze {
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args){
        int[][] arr = {{1,0,1,0,1,0},{1,1,1,1,1,1},{0,0,0,0,0,1},{1,1,1,1,1,1},{1,1,1,1,1,1}};
        System.out.println(String.format("answer : %d", bfs(0, 0, arr)));
    }

    static int bfs(int x, int y, int[][] arr){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));

        while(!queue.isEmpty()){
            Node node = queue.poll();
            x = node.getX();
            y = node.getY();

            // i<4 : 4가지 방향을 의미
            for(int i=0; i<4 ;i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || ny < 0 || nx >= arr.length || ny >= arr[x].length) continue;

                if(arr[nx][ny] == 0) continue;

                // 최단거리일 경우에만 길을 찾아서 +1을 해줌
                if(arr[nx][ny] == 1){
                    arr[nx][ny] = arr[x][y] + 1;
                    queue.offer(new Node(nx, ny));
                }
            }
        }
        return arr[arr.length-1][arr[x].length-1];
    }
}

class Node {
    private int x;
    private int y;

    Node(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
}
