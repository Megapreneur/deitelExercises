package Personal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class AcctTest {
    private  Acct myAcct;
    @BeforeEach public void setUp(){
        myAcct = new Acct("Ade");
    }
    @Test
    public void testThatAccountCanBeCreated(){
        assertNotNull(myAcct);
    }
    @Test
    public void testThatAccountHasAName(){
        myAcct.setAcctName("Ade");
        assertEquals("Ade", myAcct.getAcctName());
    }
}
