import com.com.luxoft.dnepr.courses.unit2.LuxoftUtils3;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Maxim
 * Date: 14.11.13
 * Time: 3:32
 * To change this template use File | Settings | File Templates.
 */
public class LuxoftUtils3Test {
    String str;

    /*@Test
    public void testWordAverageLength(){
        str = "i mum";
        Assert.assertEquals(2.0, LuxoftUtils3.wordAverageLength(str));

        str = "Timosha lapatun";
        Assert.assertEquals(7.0, LuxoftUtils3.wordAverageLength(str));

        str = "Лиса Алиса";
        Assert.assertEquals(4.5, LuxoftUtils3.wordAverageLength(str));
      */
    @Test
    public void testReverseWords() {

        str = "love night";
        Assert.assertEquals("evol thgin", LuxoftUtils3.reverseWords(str));

        str = "love  night ";
        Assert.assertEquals("evol  thgin ", LuxoftUtils3.reverseWords(str));

        str = "love dark night";
        Assert.assertEquals("evol krad thgin", LuxoftUtils3.reverseWords(str));
    }


}

