public class Grid {
    /* instance variables */
    private static int width = 10;
    private static int height = 10;

    private int[][] grid = new int[width][height];

    private int rows;
    private int columns;

    /* constructor that creates random states */
    public Grid() {
        for (int m = 0; m < width; m++) {
            for (int n = 0; n < height; n++) {
                grid[m][n] = (int) (Math.random() * 10);
            }
        }
        this.rows = this.grid.length;
        this.columns = this.grid[0].length;
    }//end constructor


    /* returns the current generation */
    public int[][] oldGeneration() {
        return this.grid;
    }//end method

    /* returns the next generation */
    public int[][] newGeneration() {

        int[][] nextLife = new int[width][height];

        for (int row = 0; row < nextLife.length; row++) {
            for (int col = 0; col < nextLife[row].length; col++) {
                nextLife[row][col] = countLivingNeighbors(row, col);
            }
        }
        return nextLife ;
    }//end method


    /**
     * returns the count of living neighbors
     * gets the next generation
     * @param row
     * @param col
     * @return alive neighbors
     */
    private int countLivingNeighbors(int row, int col) {

        /* get living neighbors */
        int aliveNeighbors = 0;

        for(int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                /* check for boundary conditions */
                if (row + x < 0 || row + x > (this.rows - 1) || y + col < 0 || y + col > (this.columns - 1)) {
                    continue;
                }
                /* remove since its neighbours may have counted before */
                aliveNeighbors -= grid[row][col];


                /* cell is lonely with less than two live neighbors and dies */
                if ((grid[row][col] == 1) && (aliveNeighbors < 2))
                    return 0;

                /* cell dies due to over population */
                else if ((grid[row][col] == 1) && (aliveNeighbors > 3))
                    return 0;

                /* a new cell is born */
                else if ((grid[row][col] == 0) && (aliveNeighbors == 3))
                    return 1;

                /* nothing changes */
                else
                     return grid[row][col];
            }
        }
        return aliveNeighbors;
    }//end method
}//end of class

