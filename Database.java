import java.util.ArrayList;

/**
 * A database for collections of publications, e.g. books and journals
 * 
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Database
{
    // A collection of books
    private ArrayList<Publication> publicationList;

    /**
     * Create a new database
     */
    public Database()
    {
        publicationList = new ArrayList<Publication>();
    }
    
    /**
     * Add a new publication
     * 
     * @param newPublication The publication to be added
     */
    public void addPublication(Publication newPublication) {
        if (publicationList.contains(newPublication)){
            System.out.println("Publication: " + newPublication.getTitle() + newPublication.getYear());
        }
        else 
        {
        publicationList.add(newPublication);      
    }
    }    

    /**
     * Get the total number of collections 
     * 
     * @return The total number of collections  
     */
    public int getTotal() {
        return publicationList.size();
    }    

    /** 
     * 
     * Print the details of all collections
     */
    public void printList() {
        for (Publication publication:publicationList){
            System.out.println(publication.toString());
    }   
}
    /**
     * Print the details after a given year
     * @ param year Year given 
     */
    public void printDetails(int year) {
         for (Publication publication:publicationList){
             if (year == publication.getYear()){
                 System.out.println("Publication: " + "Title: " + publication.getTitle() + "Year: " + publication.getYear());
                 }
                }
            }
     /** 
     * 
     * Deletes all publications before a given year
     * @ param year Year given 
     */
    public void deletePublications(int year){
        
        int total = 0;
    
        for (int pub = publicationList.size()-1; pub >= 0; pub--)
        {
            if (publicationList.get(pub).getYear()< year)
                {
                publicationList.remove(pub);
                total++;
                
               }
        }        
        System.out.println("Deleted: " + total);
    }
        
    }
    

    
        

