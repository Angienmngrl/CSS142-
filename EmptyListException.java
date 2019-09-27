package printqueue;
/**
 * Description: EmptyListException definition
 * @author Nomingerel Tserenjav and Muhammed Guroglu
 */
public class EmptyListException extends RuntimeException
{
     /**
     * Calls the super class for the exception check
     * @param name String
     */
    public EmptyListException( String name )
    {
        super( "The " + name + " is empty" );
    }
}