/**
 * A simple model of a book
 * 
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Book extends Publication
{    
    private String author;      // the author of the book
    private String publisher;   // the publisher of the book
    
    /**
     * Create a book. 
     * 
     * @param title     The title of the book.
     * @param author    The title of the book.
     * @param publisher The publisher of the book.
     * @param year      The year when the book was published.
     */
    public Book(String title, String author, String publisher, int year)
    {
        super(title , year);
        this.author = author;
        this.publisher = publisher;
        
        
    }

    /**
     * Get the title of the book
     *  
     * @return  The title of the book
     */
    public String getTitle()
    {
        return super.getTitle();
    }
    
    /**
     * Get the author of the book
     *  
     * @return  The author of the book
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Get the publisher of the book
     *  
     * @return  The publisher of the book
     */
    public String getPublisher()
    {
        return publisher;
    }
    
    /**
     * Get the year of the book when it was published
     *  
     * @return  The  year of the book when it was published
     */
    public int getYear()
    {
        return super.getYear();
    }
    
    /**
     * Get the details of the book
     *  
     * @return  The details of the book including 
     *          the title, author, publisher and year
     */
    public String toString()
    {
        return "Book: " + getTitle() + " by " + author + " (Published by " + publisher + " in " + getYear() + ")";        
    }         
    
    /**
     * Check if the book is the same as the given one.
     * 
     * @param obj The given object.
     * 
     * @return true if the book and the given object are the same 
     *         or they have the same title, author, publisher and year; 
     *         false otherwise
     */
    public boolean equals(Object obj) {        
        if (obj == this) return true;
        
        if ( !(obj instanceof Book) )  return false;
        
        Book aBook = (Book) obj;        
        return getTitle().equals(aBook.getTitle()) && 
               this.author.equals(aBook.author) &&
               this.publisher.equals(aBook.publisher) && 
               this.getYear() == aBook.getYear();
    }            
}
