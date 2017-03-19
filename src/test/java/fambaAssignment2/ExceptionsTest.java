package fambaAssignment2;

import org.junit.framework.Test;
import org.junit.framework.TestCase;
import org.junit.framework.TestSuite;

/**
 * Created by Wande on 16/03/2017.
 */
public class ExceptionsTest {
    Exceptions exceptTest;

    @Before
    public void setUp() throws Exception {
        exceptTest = new Exceptions();
    }

    @After
    public void tearDown() throws Exception {
        exceptTest = new Exceptions();
    }

    @Test(exceptTest = ArithmeticException.class)
    public void testName(){

        int answer = exceptTest.number1(1);
        Assert.assertEquals(-1,answer);
    }
}
