package fambaAssignment2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

/**
 * Created by Wande on 16/03/2017.
 */
public class ObjectIdentityTest {
    ObjectIdentity myObject;
    @Before
    public void setUp() throws Exception {

        myObject = new ObjectIdentity();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testName() throws Exception {
        Assert.assertNotSame(myObject.objectA(),myObject.objectB());
    }
}
