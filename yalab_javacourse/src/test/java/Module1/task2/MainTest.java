package Module1.task2;

import org.junit.Assert;
import org.junit.Test;

class MainTest {

    @Test
    void main() {
    }

    @Test
    void quickSort_Smoke() {
        int[] actual = {5, 6, 3, 2, 5, 1, 4, 9};
        int[] expected = {1, 2, 3, 4, 5, 5, 6, 9};
        Main.quickSort(actual, 0, actual.length - 1);
        Assert.assertArrayEquals(actual, expected);

    }

}