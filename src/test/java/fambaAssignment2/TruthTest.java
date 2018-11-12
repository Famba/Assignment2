package fambaAssignment2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Wande on 16/03/2017.
 */
public class TruthTest {

    Thruth myTruth;
    @Before
    public void setUp() throws Exception {
        myTruth = new Truth();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testName() throws Exception {

        boolean age = myTruth.Myage();
        Assert.assertTrue("Is this true",age);
    }
}
