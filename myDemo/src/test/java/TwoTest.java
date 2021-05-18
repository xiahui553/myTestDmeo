import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.UUID;

public class TwoTest {
    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][] {
                {"aa","bb","cc"},
                {"aaa","bbb","ccc"}
//                { new Random().nextInt(1000) },
//                { UUID.randomUUID().toString().replaceAll("-","")},
        };
    }
    @Test(dataProvider = "test1")
    public void verifyData1(String a,String b,String c) {
        Assert.assertEquals(a,"aa");
        Assert.assertEquals(b,"bb");
        Assert.assertEquals(c,"cc");
    }
}
