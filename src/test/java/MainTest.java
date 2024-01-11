import id.co.fasyah.Main;
import id.co.fasyah.Result;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {
    @Test
    public void test() {
        String fileName = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "list_names.txt";
        Result result = Main.countTheWords(fileName);
        assertEquals(8, result.getCount());
        assertNotNull(result.getLongestThan5());
    }
}
