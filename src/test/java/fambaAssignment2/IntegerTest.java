package fambaAssignment2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Wande on 16/03/2017.
 */
public class IntegerTest {
    Integers add = new Integers();

    @Test(timeout =100)
    public void testAdd() throws Exception {
        int var = add.addIntegers(5,5);
        Assert.assertEquals(10,var);
    }
}
