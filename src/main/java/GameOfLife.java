public class GameOfLife {
    /* instance variables */
    private static final String alive = "#";
    private static final String dead = "+";

    /**
     *creating object of the class
     * creating two dimensional array current and next generation
     *display grid for current and next generation
     * @param args
     */
    public static void main(String[] args) {

        Grid grid = new Grid();

        int[][] currentGeneration = grid.oldGeneration();
        int[][] futureGeneration = grid.newGeneration();

        System.out.println("......................");
        System.out.println(". CURRENT GENERATION .");
        System.out.println("......................");

        allGenerations(currentGeneration);

        System.out.println(".....................");
        System.out.println(". NEXT GENERATION   .");
        System.out.println(".....................");

        allGenerations(futureGeneration);
    }//end main method

    /* creating grid for all generations */
    public static void allGenerations(int[][] allGen) {
        for (int rows = 0; rows < allGen.length; rows++) {
            for (int column = 0; column < allGen[rows].length; column++) {
                if (allGen[rows][column] == 0) {
                    System.out.print(alive);
                }
                else {
                    System.out.print(dead);

                }

            }
            System.out.println(" ");
        }
    }//end method allGenerations
}//end of class

