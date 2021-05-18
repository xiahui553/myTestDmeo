import org.testng.Assert;
import org.testng.annotations.Test;

public class OneTest {
    @Test
    public void test_one(){
        Assert.assertTrue(true);
    }
    @Test
    public void test_two(){
        Assert.assertTrue(false);
    }

}
