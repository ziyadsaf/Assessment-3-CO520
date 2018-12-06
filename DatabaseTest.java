

/**
 * The test class DatabaseTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DatabaseTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class DatabaseTest
     */
    public DatabaseTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }
    
    public void testAll()
	{
	    Database db = new Database();
	    Book java = new Book("Objects First with Java", "Barnes & Kolling", "Prentice Hall", 20012);
	    
	    // Create 3 journal objects
	    Journal j1 = new Journal ("1",1,1998);
	    Journal j2 = new Journal ("2",2,1999);
	    Journal j3 = new Journal ("3",2,2000);
	    
	    // Create 3 publication objects
	    Publication p1 = new Publication ("pub1", 1998);
	    Publication p2 = new Publication ("pub2", 1999);
	    Publication p3 = new Publication ("pub3", 2000);
	    
	    // Create a book object
	    Book b1 = new Book ("Harry Potter" , "JK Rowling", "Puffin", 2000);
	    
	    // Adds the publication objects
	    db.addPublication(p1); 
	    db.addPublication(p2); 
	    db.addPublication(p3); 
	     
	    // Prints out the publications
	    System.out.println(p1);
	    System.out.println(p2);
	    System.out.println(p3);
	    
	    // Test 1: Add a book
	    db.addPublication(java);		
	    assertEquals(1, db.getTotal());	
	    
	    db.printList();
	}
}
