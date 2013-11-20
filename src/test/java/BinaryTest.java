import com.luxoft.dnepr.courses.unit1.Binary;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Maxim
 * Date: 06.11.13
 * Time: 1:06
 * To change this template use File | Settings | File Templates.
 */
public class BinaryTest {
    private String number;

    @Test
    public void testBinaryToDecimal(){
        number = Binary.binaryToDecimal("1100");
        Assert.assertEquals("12", number);

        number = Binary.binaryToDecimal("jj8");
        Assert.assertEquals("Not binary", number);

        number = Binary.binaryToDecimal("11100001");
        Assert.assertEquals("225", number);








    }
}
