package fambaAssignment2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Wande on 16/03/2017.
 */
public class FalseTest {
    False lie;
    @Before
    public void setUp() throws Exception {
        lie = new False();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testName() throws Exception {

        boolean variant = lie.Surname();

        Assert.assertFalse("Is this false",variant);

    }
}
