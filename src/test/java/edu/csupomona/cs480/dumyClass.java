package edu.csupomona.cs480;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class dumyClass extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        //assertTrue( true );
    		fail("just for test");
    }
}
