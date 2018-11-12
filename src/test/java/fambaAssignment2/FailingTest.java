package fambaAssignment2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Wande on 16/03/2017.
 */
public class FailingTest {
    Failling fail;
    @Before
    public void setUp() throws Exception {
        fail = new Failling();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testFailing() throws Exception {
        String answer = fail.name();
        Assert.assertNotSame("Not the sames",answer);

    }
}
