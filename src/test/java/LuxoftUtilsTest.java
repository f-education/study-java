import com.luxoft.dnepr.courses.unit1.LuxoftUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Maxim
 * Date: 01.11.13
 * Time: 0:09
 */
public class LuxoftUtilsTest {

    String month;

    @Test
    public void testGetMonthName() {
        month = LuxoftUtils.getMonthName(1, "en");
        Assert.assertEquals("January", month);

        month = LuxoftUtils.getMonthName(12, "ru");
        Assert.assertEquals("Декабрь", month);

        month = LuxoftUtils.getMonthName(5, "hindi");
        Assert.assertEquals("Unknown Language", month);

        month = LuxoftUtils.getMonthName(13, "hindi");
        Assert.assertEquals("Unknown Language", month);

        month = LuxoftUtils.getMonthName(-5, "ru");
        Assert.assertEquals("Неизвестный месяц", month);

        month = LuxoftUtils.getMonthName(-5, "en");
        Assert.assertEquals("Unknown Month", month);


    }

}
