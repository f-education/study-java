import com.luxoft.dnepr.courses.unit1.Binary;
import com.luxoft.dnepr.courses.unit1.Decimal;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Maxim
 * Date: 08.11.13
 * Time: 23:18
 * To change this template use File | Settings | File Templates.
 */
public class DecimalTest {

    private String number;

    @Test
    public void testDecimalToBinary(){
        number = Decimal.decimalToBinary("25");
        Assert.assertEquals("11001", number);

        number = Decimal.decimalToBinary("2k5");
        Assert.assertEquals("Not decimal", number);

        number = Decimal.decimalToBinary("0025");
        Assert.assertEquals("11001", number);

    }
}
