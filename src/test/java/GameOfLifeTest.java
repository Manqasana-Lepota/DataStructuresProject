import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameOfLifeTest {

    GameOfLife gameOfLife =new GameOfLife();

    @Test
    public void nextGenerationTest(){

        int[][] initData = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };

        GameOfLife gameOfLife =new GameOfLife();
        int[][] results = gameOfLife.nextGeneration();


        // Check row 0
        Assert.assertEquals(results[0][0], 0);
        Assert.assertEquals(results[0][1], 0);
        Assert.assertEquals(results[0][2], 0);
        Assert.assertEquals(results[0][3], 0);
        Assert.assertEquals(results[0][4], 0);
        Assert.assertEquals(results[0][5], 0);
        Assert.assertEquals(results[0][6], 0);
        Assert.assertEquals(results[0][7], 0);
        Assert.assertEquals(results[0][8], 0);
        Assert.assertEquals(results[0][9], 0);

        // Check row 1
        Assert.assertEquals(results[1][0], 0);
        Assert.assertEquals(results[1][1], 0);
        Assert.assertEquals(results[1][2], 0);
        Assert.assertEquals(results[1][3], 1);
        Assert.assertEquals(results[1][4], 1);
        Assert.assertEquals(results[1][5], 0);
        Assert.assertEquals(results[1][6], 0);
        Assert.assertEquals(results[1][7], 0);
        Assert.assertEquals(results[1][8], 0);
        Assert.assertEquals(results[1][9], 0);

        // Check row 2
        Assert.assertEquals(results[2][0], 0);
        Assert.assertEquals(results[2][1], 0);
        Assert.assertEquals(results[2][2], 0);
        Assert.assertEquals(results[2][3], 1);
        Assert.assertEquals(results[2][4], 1);
        Assert.assertEquals(results[2][5], 0);
        Assert.assertEquals(results[2][6], 0);
        Assert.assertEquals(results[2][7], 0);
        Assert.assertEquals(results[2][8], 0);
        Assert.assertEquals(results[2][9], 0);

        // Check row 3
        Assert.assertEquals(results[3][0], 0);
        Assert.assertEquals(results[3][1], 0);
        Assert.assertEquals(results[3][2], 0);
        Assert.assertEquals(results[3][3], 0);
        Assert.assertEquals(results[3][4], 0);
        Assert.assertEquals(results[3][5], 0);
        Assert.assertEquals(results[3][6], 0);
        Assert.assertEquals(results[3][7], 0);
        Assert.assertEquals(results[3][8], 0);
        Assert.assertEquals(results[3][9], 0);

        // Check row 4
        Assert.assertEquals(results[4][0], 0);
        Assert.assertEquals(results[4][1], 0);
        Assert.assertEquals(results[4][2], 0);
        Assert.assertEquals(results[4][3], 0);
        Assert.assertEquals(results[4][4], 0);
        Assert.assertEquals(results[4][5], 0);
        Assert.assertEquals(results[4][6], 0);
        Assert.assertEquals(results[4][7], 0);
        Assert.assertEquals(results[4][8], 0);
        Assert.assertEquals(results[4][9], 0);

        // Check row 5
        Assert.assertEquals(results[5][0], 0);
        Assert.assertEquals(results[5][1], 0);
        Assert.assertEquals(results[5][2], 1);
        Assert.assertEquals(results[5][3], 1);
        Assert.assertEquals(results[5][4], 1);
        Assert.assertEquals(results[5][5], 0);
        Assert.assertEquals(results[5][6], 0);
        Assert.assertEquals(results[5][7], 0);
        Assert.assertEquals(results[5][8], 0);
        Assert.assertEquals(results[5][9], 0);

        // Check row 6
        Assert.assertEquals(results[6][0], 0);
        Assert.assertEquals(results[6][1], 0);
        Assert.assertEquals(results[6][2], 1);
        Assert.assertEquals(results[6][3], 1);
        Assert.assertEquals(results[6][4], 0);
        Assert.assertEquals(results[6][5], 0);
        Assert.assertEquals(results[6][6], 0);
        Assert.assertEquals(results[6][7], 0);
        Assert.assertEquals(results[6][8], 0);
        Assert.assertEquals(results[6][9], 0);

        // Check row 7
        Assert.assertEquals(results[7][0], 0);
        Assert.assertEquals(results[7][1], 0);
        Assert.assertEquals(results[7][2], 0);
        Assert.assertEquals(results[7][3], 1);
        Assert.assertEquals(results[7][4], 1);
        Assert.assertEquals(results[7][5], 0);
        Assert.assertEquals(results[7][6], 0);
        Assert.assertEquals(results[7][7], 0);
        Assert.assertEquals(results[7][8], 0);
        Assert.assertEquals(results[7][9], 0);

        // Check row 8
        Assert.assertEquals(results[8][0], 0);
        Assert.assertEquals(results[8][1], 0);
        Assert.assertEquals(results[8][2], 0);
        Assert.assertEquals(results[8][3], 0);
        Assert.assertEquals(results[8][4], 0);
        Assert.assertEquals(results[8][5], 0);
        Assert.assertEquals(results[8][6], 0);
        Assert.assertEquals(results[8][7], 0);
        Assert.assertEquals(results[8][8], 0);
        Assert.assertEquals(results[8][9], 0);

        // Check row 9
        Assert.assertEquals(results[9][0], 0);
        Assert.assertEquals(results[9][1], 0);
        Assert.assertEquals(results[9][2], 0);
        Assert.assertEquals(results[9][3], 0);
        Assert.assertEquals(results[9][4], 0);
        Assert.assertEquals(results[9][5], 0);
        Assert.assertEquals(results[9][6], 0);
        Assert.assertEquals(results[9][7], 0);
        Assert.assertEquals(results[9][8], 0);
        Assert.assertEquals(results[9][9], 0);



    }

}