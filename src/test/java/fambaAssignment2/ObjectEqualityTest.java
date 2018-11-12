package fambaAssignment2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Wande on 16/03/2017.
 */
public class ObjectEqualityTest {
    private ObjectEquality ObjEq;

    @Before
    public void setUp() throws Exception {
        ObjEq = new ObjectEquality();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testObjects(){
        String var = ObjEq.name1();
        String hisName = ObjEq.name2();
        Assert.assertEquals(var,hisName);
    }
}
