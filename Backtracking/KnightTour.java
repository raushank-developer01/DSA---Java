public class KnightTour {
    static int N = 5;

    public static boolean isSafe(int x, int y, int result[][]){
        return (x >= 0 && x < N && y >= 0 && y < N && result[x][y] == -1);
    }

    public static void printSolution(int result[][]){
        for(int x = 0; x < N; x++){
            for(int y = 0; y < N; y++){
                if(result[x][y]/10 == 0){
                    System.out.print(result[x][y] + "  ");
                }else{
                    System.out.print(result[x][y] + " ");
                } 
            }
            System.out.println();
        }
    }

    public static boolean solveKT(){
        int result[][] = new int[8][8];

        for(int x = 0; x < N; x++){
            for(int y = 0; y < N; y++){
                result[x][y] = -1;
            }
        }

        int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};

        result[0][0] = 0;

        if(!solveKTUtil(0, 0, 1, result, xMove, yMove)){
            System.out.println("Solution does not exist");
            return false;
        }else{
            printSolution(result);
        }
        return true;
    }

    public static boolean solveKTUtil(int x, int y, int movei, int result[][], int xMove[], int yMove[]){
        int k, next_x, next_y;
        if(movei == N * N){
            return true;
        }

        for(k = 0; k < 8; k++){
            next_x = x + xMove[k];
            next_y = y + yMove[k];
            if(isSafe(next_x, next_y, result)){
                result[next_x][next_y] = movei;
                if(solveKTUtil(next_x, next_y, movei + 1, result, xMove, yMove)) return true;
                else result[next_x][next_y] = -1;
            }
        }
        return false;
    }

    public static void main(String args[]){
        solveKT();
    }
}
