import java.nio.file.*;
import java.nio.file.attribute.*; 
import java.io .*;

public class FileAttSample {
    public static void main (String [] args){

        Path filePath =
            Paths.get ("C:\\Users\\Arvina\\OneDrive\\Documents\\NetBeansProjects\\FileAttSample\\src\\chapter8\\ancient newspaper.docx"); 
        try{
            BasicFileAttributes fileAtt =
                Files. readAttributes (filePath, BasicFileAttributes.class);
            System.out.println("Size: " + fileAtt. size () + " bytes") ;
            System.out.println("Creation time: " + fileAtt. creationTime () ) ;
            System.out.println("Last modified time: "
                    + fileAtt. lastModifiedTime () ) ;
        }
        catch (IOException e)
        {
            System.out.println("IO Exception");
        }
    }
    
}
