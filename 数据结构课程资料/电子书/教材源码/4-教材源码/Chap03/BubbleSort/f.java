

/**
 * The test class f.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class f extends junit.framework.TestCase
{
	private BubbleSortApp bubbleSo1;

    /**
     * Default constructor for test class f
     */
    public f()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
		bubbleSo1 = new BubbleSortApp();
	}

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }

	public void testOo()
	{
	    String[] str={""};
        BubbleSortApp.main(str);
	}

	public void testGg()
	{
	}
}


