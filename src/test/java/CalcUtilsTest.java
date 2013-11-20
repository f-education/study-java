import com.dnepr.education.module1.unit1.CalcUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

/**
 * User: Maxim
 * Date: 31.10.13
 * Time: 0:38
 */
public class CalcUtilsTest {
    private Map<String, Double> hashmap;
    private static final double ROUT_ERROR = 0.00001;

    @Test
    public void testGetRootsQuadraticEq() {
        hashmap = CalcUtils.getRootsQuadraticEq(1, -2, -3);      //d > 0
        Assert.assertEquals(3.0, hashmap.get("x1"), ROUT_ERROR);
        Assert.assertEquals(-1.0, hashmap.get("x2"), ROUT_ERROR);

        hashmap = CalcUtils.getRootsQuadraticEq(1, 12, 36);       //d = 0
        Assert.assertEquals(-6.0, hashmap.get("x"), ROUT_ERROR);

        hashmap = CalcUtils.getRootsQuadraticEq(5, 0, 30);               //d < 0
        Assert.assertEquals(Double.NaN, hashmap.get("x"), ROUT_ERROR);

        hashmap = CalcUtils.getRootsQuadraticEq(0, 0, 0);
        Assert.assertEquals(Double.NaN, hashmap.get("x1"), ROUT_ERROR);
        Assert.assertEquals(Double.NaN, hashmap.get("x2"), ROUT_ERROR);


    }
}
