import com.luxoft.dnepr.courses.unit2.HttpWebConnector;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;

/**
 * User: Maxim
 * Date: 28.11.13
 * Time: 23:28
 */
public class HttpWebConnectorTest {
    private static String urlGoogle;
    private static String urlBlog;
    private static final String TAG_HEAD = "<head";
    private static final String TAG_BODY = "<body";

    @BeforeClass
    public static void init(){
        urlBlog = "http://programador.ru";
        urlGoogle = "http://google.com";
    }

    @Test
    public void testGetWebContent() throws Exception {
        HttpWebConnector connector = new HttpWebConnector();

        String content1 = connector.getWebContent(urlBlog);
        String content2 = connector.getWebContent(urlGoogle);

        System.out.println(content1);
        System.out.println(content2);

        Assert.assertNotNull(content1);
        Assert.assertNotNull(content2);

        Assert.assertTrue(content1.length() > 10);
        Assert.assertTrue(content2.length() > 10);

        Assert.assertTrue(content1.contains(TAG_BODY));
        Assert.assertTrue(content1.contains(TAG_HEAD));

        Assert.assertTrue(content2.contains(TAG_HEAD));
        Assert.assertTrue(content2.contains(TAG_BODY));
    }

    @Test
    public void testWriteContentToFile() throws IOException {
        HttpWebConnector connector = new HttpWebConnector();
        File file = connector.writeContentToFile(TAG_BODY);

        Assert.assertTrue(file.exists());
        Assert.assertEquals(TAG_BODY.length(), file.length());
        Assert.assertEquals("programma.txt" ,file.getName());

        BufferedReader reader = new BufferedReader(new FileReader(file));

        Assert.assertEquals(TAG_BODY, reader.readLine());

    }

}
