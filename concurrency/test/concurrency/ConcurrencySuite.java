
package concurrency;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Molly
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({concurrency.ProducerTest.class, concurrency.queueTest.class, concurrency.ConsumerTest.class, concurrency.methodClassTest.class, concurrency.ConcurrencyTest.class})
public class ConcurrencySuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
