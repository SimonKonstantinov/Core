package Module1.task1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



class MainTest {

    @Test
    void min() {
        int matrix[][] = { { 39, 27, 11, 42 },
                { 10, 93, 91, 90 },
                { 54, 78, 56, 89 },
                { 24, 64, 20, 65 }};
        int actual = 10;

        int expected = Main.min(matrix);
        Assert.assertEquals(expected,actual);
    }

    @Test
    void max() {
        int matrix[][] = { { 39, 27, 11, 42 },
                { 10, 93, 91, 90 },
                { 54, 78, 56, 89 },
                { 24, 64, 20, 65 }};
        int actual = 93;

        int expected = Main.max(matrix);
        Assert.assertEquals(expected,actual);
    }
}