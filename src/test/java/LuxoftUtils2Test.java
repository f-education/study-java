import com.luxoft.dnepr.courses.unit1.LuxoftUtils;
import com.luxoft.dnepr.courses.unit1.LuxoftUtils2;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Maxim
 * Date: 05.11.13
 * Time: 20:53
 * To change this template use File | Settings | File Templates.
 */
public class LuxoftUtils2Test {
    String month;

    @Test
    public void testGetMonthName(){
        month = LuxoftUtils2.getMonthName(1, "en");
        Assert.assertEquals("January", month);

        month = LuxoftUtils2.getMonthName(12, "ru");
        Assert.assertEquals("Декабрь", month);

        month = LuxoftUtils2.getMonthName(5, "hindi");
        Assert.assertEquals("Unknown Language", month);

        month = LuxoftUtils2.getMonthName(13, "hindi");
        Assert.assertEquals("Unknown Language", month);

        month = LuxoftUtils2.getMonthName(-5, "ru");
        Assert.assertEquals("Неизвестный месяц", month);

        month = LuxoftUtils2.getMonthName(-5, "en");
        Assert.assertEquals("Unknown month", month);

    }
}
