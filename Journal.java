/**
 * A simple model of a Journal
 * 
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Journal extends Publication
{
    private int year;           // The year when the journal was published
    private int month;          // The month when the journal was published

    /**
     * Create a journal. 
     * 
     * @param title     The title of the journal.
     * @param month     The month when the journal was published.
     * @param year      The year when the journal was published.     
     */
    public Journal(String title, int month, int year)
    {
        super(title , year);
        this.month = month;
        
    }

    /**
     * Get the title of the journal
     *  
     * @return  The title of the journal
     */
    public String getTitle()
    {
        return super.getTitle();
    } 

    /**
     * Get the month of the journal when it was published
     *  
     * @return  The month of the journal when it was published
     */
    public int getMonth()
    {
        return month;
    }
    
    public boolean equals(Object obj)
    {
        if(obj==this)
        {
            return true;
            }
            if(!(obj instanceof Journal))
            {
                return false;
            }
     Journal other = (Journal) obj;
     return getTitle().equals(other.getTitle()) && month == (other.month) && year == (other.year);
    }
    
               
    /**
     * Get the year of the journal when it was published
     *  
     * @return  The year of the journal when it was published
     */
    public int getYear()
    {
        return super.getYear();
    }

    /**
     * Get the details of the journal
     *  
     * @return  The details of the journal including 
     *          the title, publisher, month and year
     */
  
              
    
    public String toString(){
        return "Journal: " + getTitle() + " ( " + getMonthName(month) + " " + getYear() + " ) ";
    }
    /**
     * To get the first three letters of a given month's name
     * 
     * @param month A given month
     * @return   The first three letters of the given month's name
     */
    private String getMonthName(int month) {
        switch (month) {
            case 1: return "Jan";
            case 2: return "Feb";
            case 3: return "Mar";
            case 4: return "Apr";
            case 5: return "May";
            case 6: return "Jun";
            case 7: return "Jul";
            case 8: return "Aug";
            case 9: return "Sep";
            case 10: return "Oct";
            case 11: return "Nov";
            case 12: return "Dec";
            default: return "Unknow";
        }
    }    
}
