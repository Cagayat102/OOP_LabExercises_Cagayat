import java.nio.file .*; 
import java.io .*;

public class PathSample {
    public static void main (String [] args){

        Path filePath =
            Paths.get("C:\\Users\\Arvina\\OneDrive\\Documents\\NetBeansProjects\\PathSample\\src"); 
        try{
            Files.delete (filePath) ;
            System.out. println("The file or directory is deleted"); 
        } 
        catch (NoSuchFileException e)
        {
            System.out. println ("No such file or directory") ; 
        }    
        catch (DirectoryNotEmptyException e)
        {
            System.out. println("Directory is not empty") ; 
        }
        catch (SecurityException e)
        {    
            System.out. println ("No permission to delete"); 
        }    
        catch (IOException e)
        {
            System.out. println ("IO exception") ;
        }
    }
    
}
