public class GameOfLife {
    /*declaring instance variable*/
    private int rows;
    private int columns;

    private static int width = 10;
    private static int height = 10;

    /*create grid*/
    int[][] gridLayout = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };


    /*Returns the current generation*/
    public int[][] currentGeneration() {

        return this.gridLayout;
    }


    /*Returns the next generation*/
    public int[][] nextGeneration() {

        int[][] futureGeneration = new int[width][height];

        /*iterate through two dimensional array*/
        for (int i = 0; i < width - 1; i++) {
            for (int j = 0; j < height - 1; j++) {

                /* get living neighbors*/
                int aliveNeighbours = 0;
                for (int x = -1; x <= 1; x++) {
                    for (int y = -1; y <= 1; y++) {
                        /*check for boundary conditions*/
                        if (i + x < 0 || i + x > (this.rows - 1) || y + j < 0 || y + j > (this.columns - 1)) {
                            continue;
                        }
                        aliveNeighbours += gridLayout[i + x][j + y];
                    }
                }
                /*remove since its neighbours may have counted before*/
                aliveNeighbours -= gridLayout[i][j];

                /*Cell is lonely with less than two live neighbors and dies*/
                if ((gridLayout[i][j] == 1) && (aliveNeighbours < 2))
                    futureGeneration[i][j] = 0;

                /*Cell dies due to over population*/
                else if ((gridLayout[i][j] == 1) && (aliveNeighbours > 3))
                    futureGeneration[i][j] = 0;

                /*A new cell is born*/
                else if ((gridLayout[i][j] == 0) && (aliveNeighbours == 3))
                    futureGeneration[i][j] = 1;

                /*Nothing changes*/
                else {
                    futureGeneration[i][j] = gridLayout[i][j];
                }
            }

        }
        return futureGeneration;
    }

    /**
     * creating object of the class
     * creating two dimensional array current and next generation
     * display grid for current and next generation
     * @param args
     */
    public static void main(String[] args) {

        GameOfLife grid = new GameOfLife();
        int[][] currentGen = grid.currentGeneration();
        int[][] nextGen = grid.nextGeneration();
        System.out.println("Current Generation");
        printResults(currentGen);
        System.out.println("Next Generation");
        printResults(nextGen);
    }

    /*creating grid for current and next generation*/
    private static void printResults(int[][] results) {
        for (int i = 0; i < results.length; i++) {
            for (int j = 0; j < results[i].length; j++) {
                if (results[i][j] == 0) {
                    System.out.print("+");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

