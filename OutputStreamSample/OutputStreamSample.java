import java.io.*;

public class OutputStreamSample {
    public static void main (String [] args){

        String s= "RANIKA"; 
        byte [] data = s.getBytes ();
        OutputStream output = null;
    try{

        output = System.out; 
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
