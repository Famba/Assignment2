package fambaAssignment2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Wande on 16/03/2017.
 */
public class NonNullnesTest {
    NonNullness x;
    @Before
    public void setUp() throws Exception {
        x = new NonNullness();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testName() throws Exception {
        Assert.assertNotNull(x.numbers());
    }
}
