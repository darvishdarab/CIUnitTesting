import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayUtilsWBTest {

    @Test
    public void testFindLastBranchCoverage1() {
        assertEquals(2, ArrayUtils.findLast(new int[]{1, 3, 3, 2}, 3));
    }


    @Test
    public void testFindLastBranchCoverage2() {
        assertEquals(-1, ArrayUtils.findLast(new int[]{}, 3));
    }

    /*
    @Test
    public void testLastZeroBranchCoverage1() {
        assertEquals(1, ArrayUtils.lastZero(new int[]{1, 0, 2}));
    }
    */



}