
/**
 * Write a description of class TravelGuide here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TravelGuide extends Book
{
    // instance variables - replace the example below with your own
    private String country;

    /**
     * Constructor for objects of class TravelGuide
     */
    public TravelGuide(String country, String title, String author, String publisher, int year)
    {
        super(title , author , publisher , year);
        this.country = "UK";
    }  
    /**
     * 
     */
     public void setCountry(){
    {
        this.country = country;
    }
}
        
    /**
     * 
     */
    public String getCountry(){
    {
        return country;
    }
}
   /**
    * 
    */
   public String toString(){
       {
         return super.toString()
         + "Country: " + country;
         
        }
       
    }
            
}
