public class RatInMaze {

    public static void totalRatRoute(int[][] maze, int row, int coln, int[][] result){
        // Base Case 
        if(row < 0 || coln < 0 || row >= maze.length || coln >= maze.length 
           || maze[row][coln] == 0 || result[row][coln] == 1){
            return;
        }
        
        if(row == maze.length - 1 && coln == maze.length - 1){
            result[row][coln] = 1;
            printRoute(result);
            System.out.println();
            result[row][coln] = 0;
            return;
        }
        result[row][coln] = 1;

        totalRatRoute(maze, row + 1, coln, result);
        totalRatRoute(maze, row, coln + 1, result);
        totalRatRoute(maze, row - 1, coln, result);
        totalRatRoute(maze, row, coln - 1, result);

        result[row][coln] = 0;
    }

    public static void printRoute(int[][] result){
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result.length; j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] maze = {{1, 0, 1, 1},
                        {1, 0, 0, 1},
                        {1, 0, 1, 1},
                        {1, 1, 1, 1}};
        
        int[][] result = new int[maze.length][maze.length];
        
        totalRatRoute(maze, 0, 0, result);
    }
}
