import java.nio.file.*;
import java.nio.file.attribute.*; 
import java.io.*;

public class FileAttSample {
        public static void main (String [] args) {

            Path file1 =
                Paths.get ("C:\\Users\\Arvina\\OneDrive\\Documents\\NetBeansProjects\\FileAttSample1\\src\\chapter9\\oop-reviewer-1.docx") ; 
            Path file2 =
                Paths.get ("C:\\Users\\Arvina\\OneDrive\\Documents\\NetBeansProjects\\FileAttSample1\\src\\chapter8\\oop-reviewer.docx") ; 
            try{
                BasicFileAttributes fileAtt1 =
                    Files.readAttributes(file1, BasicFileAttributes.class);
                BasicFileAttributes fileAtt2 =
                    Files.readAttributes(file2, BasicFileAttributes.class);
                FileTime time1 = fileAtt1.creationTime(); 
                FileTime time2 = fileAtt2.creationTime(); 
                System.out.println("filel's creation time is: " + time1);
                System.out.println("file2's creation time is: " + time2) ;
                if (time1.compareTo(time2) < 0)
                    System.out.println("file1 was created before file2."); 
                else if (time1.compareTo(time2) > 0)
                    System.out.println("file1 was created after file2.");
                else
                    System.out.println("file1 and file2 were created at the same time.");
            }
            catch (IOException e)
            {
            System.out.println("IO Exception") ;
        }
    }
}
