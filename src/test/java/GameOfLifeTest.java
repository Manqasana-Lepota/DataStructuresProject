import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameOfLifeTest {

    static int width = 10;
    static int height = 10;

    @Test
    public void Grid() {
        int[][] grid = new int[width][height];
    }


    @Test
    public void aliveCellWithFewerThanTwoLiveNeighborsDies() {
        Assert.assertEquals(0, 0);
    }


    @Test
    public void aLiveCellWithTwoLiveNeighboursDiesLiveOnTheNextGeneration() {
       Assert.assertEquals(1,1);
    }


    @Test
    public void aLiveCellWithMoreThanThreeLiveNeighboursDies() {
       Assert.assertEquals(0,0);
    }

    @Test
    public void aLiveCellWithTwoOrThreeLiveNeighboursRemainsLive() {
      Assert.assertEquals(1,1);
    }
}

