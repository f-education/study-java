import com.luxoft.dnepr.courses.unit1.BubleSort;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created with IntelliJ IDEA.
 * User: Maxim
 * Date: 12.11.13
 * Time: 0:50
 * To change this template use File | Settings | File Templates.
 */
public class BubleSortTest {
    private int[] rez;
    private int[] rez2;

    @Test
    public void testSortArray() {
        int[] array = {5, 1, 4, 2, 8};
        rez = BubleSort.sortArray(array, true);
        Assert.assertArrayEquals(new int[]{1, 2, 4, 5, 8}, rez);

        rez2 = BubleSort.sortArray(array, false);
        Assert.assertArrayEquals(new int[]{8, 5, 4, 2, 1}, rez2);


    }
}
