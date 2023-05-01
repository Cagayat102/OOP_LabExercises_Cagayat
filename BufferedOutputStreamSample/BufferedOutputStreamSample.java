import java.nio.file.*; 
import java.io .*; 
import static java.nio.file.StandardOpenOption.*;

public class BufferedOutputStreamSample { 
    public static void main (String [] args){

        Path file =
            Paths.get ("C:\\Users\\Arvina\\OneDrive\\Documents\\NetBeansProjects\\BufferedOutputStreamSample\\src\\first_name.txt"); 
        String s = "RANIKA";
        byte[] data = s.getBytes(); 
        OutputStream output = null; 
    try{
        output = new
            BufferedOutputStream(Files.newOutputStream (file, CREATE)); 
        output.write(data); 
        output.flush(); 
        output.close();
        }
    catch (Exception e)
        {
            System.out.println("Message: " + e) ;
        }
    }
    
}
